package by.nc.teamone.web.controllers;

import by.nc.teamone.entities.models.RoomModel;
import by.nc.teamone.services.IFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

	@RequestMapping(value = "/getAllClaim", method = RequestMethod.GET )
	public ModelAndView getAllClaim(){
		ModelAndView view = new ModelAndView();
		view.addObject("claims", facade.getUserRoomList());
		view.setViewName("definition-allclaim");
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		view.addObject("user", facade.getUserByName(name));
		return view;
	}

	@RequestMapping(value =  "/accept", method = RequestMethod.POST)
	public ModelAndView accept(@RequestParam("roomId") long roomId,
							   @RequestParam("flag") boolean flag,
							   @RequestParam("userId") long userId){
		facade.changeStatusRoom(roomId, flag, userId);
		ModelAndView view = new ModelAndView();
		view.addObject("claims", facade.getUserRoomList());
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		view.addObject("user", facade.getUserByName(name));
		view.setViewName("definition-allclaim");
		return view;
	}

}
