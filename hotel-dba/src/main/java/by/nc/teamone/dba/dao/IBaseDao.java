package by.nc.teamone.dba.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface IBaseDao<T, PK extends Serializable> {

	List<T> getAll();
	T get(PK id);
	PK add(T object);
	void delete (T object);
	void update (T object);
	
}
