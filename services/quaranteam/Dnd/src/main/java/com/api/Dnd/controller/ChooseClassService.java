package com.api.Dnd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.api.Dnd.model.ClassPicker;
import com.api.Dnd.model.Player;

@Controller
public class ChooseClassService {

  @RequestMapping(path = {"/player"}, method = RequestMethod.GET)
  public String playerSats(@ModelAttribute Player player) 
  {
    return "input";
  }
  
  @RequestMapping(value = "/player", method = RequestMethod.POST)
  public String playerChoose(@ModelAttribute ClassPicker pickMe, Player player) 
  {
	  
	  pickMe.assignStats(player);
	  pickMe.pickMyClass(player);
	  
    return "result";
  }
  
}