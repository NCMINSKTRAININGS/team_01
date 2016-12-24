package by.nc.teamone.dba.dao.impl;

import by.nc.teamone.dba.dao.IEquipmentDAO;
import by.nc.teamone.entities.Equipment;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Scope("singleton")
@Repository
public class EquipmentDAOImpl extends BaseDAOImpl<Equipment, Long> implements IEquipmentDAO{
	public EquipmentDAOImpl(){
		super(Equipment.class);
	}
}
