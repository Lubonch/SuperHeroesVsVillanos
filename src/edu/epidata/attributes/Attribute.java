package edu.epidata.attributes;

public class Attribute 
{
	String name;
	int level;
	
	public Attribute(String name, int level) 
	{
		this.name = name;
		this.level = level;
	}
	
	public String Getname() {
		return this.name;
	}

	public int GetLevel() {
		return this.level;
	}
	
	public void SetLevel(int lvl) 
	{
		this.level = lvl;
	}
	
}
