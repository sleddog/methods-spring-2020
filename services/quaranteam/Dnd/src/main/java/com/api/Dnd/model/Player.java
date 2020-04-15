package com.api.Dnd.model;

public class Player 
{
	private int strg; // Strength
	private int dex; // Dexterity
	private int inte; // Intelligence
	private int wis; // Wisdom
	private int con; // Constitution
	private int cha; //Charisma
	private String highest = "";
	private String optimal = "";

	ClassPicker pickMe = new ClassPicker();
	
	
	
	
	public Player()
	{
		
	}
	
	public Player( int strg, int dex, int inte, int wis, int con, int cha)
	{
		this.strg = strg;
		this.dex = dex;
		this.inte = inte;
		this.wis = wis;
		this.con = con;
		this.cha = cha;
	}
	
	/**
	 * Getters
	 */
	public String getOptimal()
	{
		return this.optimal;
	}
	
	public String getHighest()
	{
		return this.highest;
	}
	
	public int getStrg()
	{
		return strg;
	}
	
	public int getDex()
	{
		return dex;
	}
	
	public int getInte()
	{
		return inte;
	}
	
	public int getWis()
	{
		return wis;
	}
	
	public int getCon()
	{
		return con;
	}
	
	public int getCha()
	{
		return cha;
	}
	
	
	/***
	 * Setters
	 */
	public void setStrg(int strg)
	{
		this.strg = strg;
	}
	
	public void setDex(int dex)
	{
		this.dex = dex;
	}
	
	public void setInte(int inte)
	{
		this.inte = inte;
	}
	
	public void setWis(int wis)
	{
		this.wis = wis;
	}
	
	public void setCon(int con)
	{
		this.con = con;
	}
	
	public void setCha(int cha)
	{
		this.cha = cha;
	}
	
	public void setOptimal(String optimal)
	{
		this.optimal = optimal;
	}
	
	public void setHighest(String highest)
	{
		this.highest = highest;
	}
	
}
