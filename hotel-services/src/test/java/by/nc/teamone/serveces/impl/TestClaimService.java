package by.nc.teamone.serveces.impl;


import by.nc.teamone.dba.dao.IClaimDAO;
import by.nc.teamone.dba.dao.ITypeDAO;
import by.nc.teamone.dba.dao.IUserDAO;
import by.nc.teamone.entities.Claim;
import by.nc.teamone.entities.Type;
import by.nc.teamone.entities.User;
import by.nc.teamone.entities.models.ClaimModel;
import by.nc.teamone.serveces.ITestServices;
import by.nc.teamone.services.IFacade;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional(transactionManager = "txManager")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/test-service-config.xml"})
public class TestClaimService implements ITestServices {

    @Autowired
    IFacade facade;

    @Autowired
    IClaimDAO claimDAO;

    @Autowired
    ITypeDAO typeDAO;

    @Autowired
    IUserDAO userDAO;

    private Type type;
    private User user;

    @Override
    @Before
    public void setValues() {
        type = new Type();
        user = new User();
    }

    @Override
    @After
    public void deleteValues() {
        type = null;
        user = null;
    }

    @Test
    public void addClaim(){

        ClaimModel claimModel = new ClaimModel();
        claimModel.checkOutDate = "test";
        claimModel.checkInDate = "test";
        claimModel.status = "test";

        user.setClaims(new ArrayList<>());

        userDAO.add(user);
        typeDAO.add(type);

        claimModel.type = type.getId();
        claimModel.id = user.getId();

        facade.addClaim(claimModel);

        List<Claim> claimList = claimDAO.getAll();
        claimList.get(claimList.size()-1);

        ClaimModel claimModel1 = new ClaimModel();
        claimModel1.status = claimList.get(claimList.size()-1).getStatus();
        claimModel1.checkOutDate = claimList.get(claimList.size()-1).getCheckOutDate();
        claimModel1.checkInDate = claimList.get(claimList.size()-1).getCheckInDate();
        claimModel1.type = claimList.get(claimList.size()-1).getType().getId();
        claimModel1.id = claimList.get(claimList.size()-1).getUser().getId();

        Assert.assertEquals(claimModel, claimModel1 );
    }

}
