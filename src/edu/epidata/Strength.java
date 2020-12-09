package edu.epidata;

import java.util.Random;

public class Strength extends Attribute
{
	String name;
	int level;
	
	public Strength() 
	{
		super("Strength",new Random().nextInt(500));	
	}
	
	@Override
	public String Getname() {
		return this.name;
	}

	@Override
	public int GetLevel() {
		return this.level;
	}

}
