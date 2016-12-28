package by.nc.teamone.services.managers.impl;


import by.nc.teamone.dba.dao.IUserRoomDAO;
import by.nc.teamone.entities.UserRoom;
import by.nc.teamone.entities.models.UserRoomModel;
import by.nc.teamone.services.managers.IUserRoomManager;
import by.nc.teamone.services.transformers.impl.UserRoomModelTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
@Scope("singleton")
public class UserRoomManagerImpl implements IUserRoomManager{

    @Autowired
    IUserRoomDAO userRoomDAO;

    @Autowired
    UserRoomModelTransformer userRoomModelTransformer;

    @Override
    public List<UserRoomModel> getUserRoomList() {
        List<UserRoom> userRoomList = userRoomDAO.getAll();
        List<UserRoomModel> userRoomModelList  = new ArrayList<UserRoomModel>();
        for(UserRoom iter:userRoomList){
            if (iter.getClaimStatus().getId() == 1L)
            userRoomModelList.add(userRoomModelTransformer.buildModel(iter));
        }
        return userRoomModelList;
    }
}
