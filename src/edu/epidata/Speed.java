package edu.epidata;

import java.util.Random;

public class Speed extends Attribute
{
	String name;
	int level;
	
	public Speed() 
	{
		super("Speed",new Random().nextInt(500));	
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
