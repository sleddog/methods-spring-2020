package com.api.Dnd.model;

import java.util.HashMap;

public class ClassPicker 
{
	HashMap<Integer, String> input = new HashMap<>();
	
	String out = "";
	String out2 = "";
	String optimal = "";
	
	public ClassPicker() {}
	
	public void assignStats(Player play) 
	{
		input.put(play.getStrg(),"Strength");
		input.put(play.getDex(),"Dexterity");
		input.put(play.getInte(),"Intelligence");
		input.put(play.getWis(),"Wisdom");
		input.put(play.getCon(),"Constitution");
		input.put(play.getCha(),"Charisma");
	}
	
	public void pickMyClass(Player play)
	{
		int temp = 0;
		String highS = "";
		
		for(Integer i : input.keySet())
		{
			if( i >= temp)
			{
				temp = i;
			}
		}
		
		highS = input.get(temp);	
		
		
		out = "Your highest stat is - " + highS;
		
		switch(highS)
		{
		case "Strength":
			optimal = "Barbarian, Paladin, Fighter, Ranger";
			break;
		case "Dexterity":
			optimal = "Druid, Monk, Ranger, Rogue";
			break;
		case "Intelligence":
			optimal = "Bard, Sorcerer, Warlock, Wizard";
			break;
		case "Wisdom":
			optimal = "Cleric, Druid, Monk, Wizard";
			break;
		case "Constitution":
			optimal = "Barbarian, Fighter, Sorcerer, Warlock";
			break;
		case "Charisma":
			optimal = "Bard, Cleric, Paladin, Rogue";
			break;
		}
				
		out2 = " Based on your stats the most optimal classes for "
				+ "you to play are - " + optimal;
		
		play.setHighest(out);
		play.setOptimal(out2);
	}
	
}
