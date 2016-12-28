package by.nc.teamone.services.transformers.impl;

import by.nc.teamone.entities.UserRoom;
import by.nc.teamone.entities.models.UserRoomModel;
import org.springframework.stereotype.Repository;

@Repository
public class UserRoomModelTransformer {

    public UserRoomModel buildModel(UserRoom userRoom){
        UserRoomModel userRoomModel = new UserRoomModel();
        userRoomModel.checkInDate = userRoom.getCheckInDate();
        userRoomModel.checkOutDate = userRoom.getCheckOutDate();
        userRoomModel.room = userRoom.getRoom();
        userRoomModel.user = userRoom.getUser();
        return userRoomModel;
    }

}
