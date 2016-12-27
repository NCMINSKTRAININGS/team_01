package by.nc.teamone.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import by.nc.teamone.entities.models.RoomModel;
import by.nc.teamone.services.IFacade;

@Controller
@RequestMapping(value="/room")
public class RoomController {
	
	@Autowired
	private IFacade facade;
	
	@ModelAttribute("roomModel")
    public RoomModel construct(){
    	return new RoomModel();
    }

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView goToAddRoom(){
		ModelAndView view = new ModelAndView();
		view.addObject("equipments", facade.getAllEquipment());
		view.addObject("typeList", facade.getAllType());
		view.setViewName("definition-addroom");
		return view;
	}
	
	@RequestMapping(value="/addRoom", method = RequestMethod.POST)
	public ModelAndView addRoom(@ModelAttribute("roomModel") RoomModel roomModel){
		ModelAndView view = new ModelAndView();
		facade.addRoom(roomModel);
		view.setViewName("definition-landlord");
		return view;
	}
	
//	@RequestMapping(value="/getRoom", method = RequestMethod.GET)
//	public ModelAndView getRoom(){
//		List<Room> roomList = facade.getRoomList();
//		System.out.println(roomList);
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("roomList", roomList);
//		modelAndView.setViewName("defifnition-user");
//		return modelAndView;
//	}
}
