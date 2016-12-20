package by.nc.teamone.services.managers;

import by.nc.teamone.entities.Type;
import by.nc.teamone.entities.models.TypeModel;

import java.util.List;

public interface ITypeManager {

    List<TypeModel> getAllTypeModel();
    List<Type> getAllType();

}
