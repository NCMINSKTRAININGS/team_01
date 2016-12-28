package by.nc.teamone.services.managers.impl;

import by.nc.teamone.dba.dao.IBaseDAO;
import by.nc.teamone.entities.Equipment;
import by.nc.teamone.services.managers.IEquipmentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Scope("singleton")
@Transactional
public class EquipmentManagerImpl implements IEquipmentManager{
	
	@Autowired
	IBaseDAO<Equipment, Long> baseDAO;

	@Override
	public List<Equipment> getAllEquipment() {
		List<Equipment> equipments = baseDAO.getAll();
		return equipments;
	}

}
