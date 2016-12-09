package by.nc.teamone.dba.dao.impl;

import by.nc.teamone.dba.dao.IEquipmentDAO;
import by.nc.teamone.entities.Equipment;
import org.springframework.context.annotation.Scope;

@Scope("singleton")
public class EquipmentDAOImpl extends BaseDAOImpl<Equipment, Long> implements IEquipmentDAO{

	public EquipmentDAOImpl(){
		super(Equipment.class);
	}
	
}
