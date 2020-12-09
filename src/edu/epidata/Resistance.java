package edu.epidata;

import java.util.Random;

public class Resistance extends CAttribute
{
	
	public Resistance(Attribute... attribute) 
	{
		super("Resistance", new Random().nextInt(500));
	}

	@Override
	public int calculatelevel(Attribute... attribute) 
	{
		int lvl = attribute[0].GetLevel()/attribute[1].GetLevel();
		return lvl;
	}
	
	
}
