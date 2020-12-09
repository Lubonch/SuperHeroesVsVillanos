package edu.epidata;

public abstract class CAttribute extends Attribute
{
	String name;
	String level;
	
	public CAttribute(String name, int level) 
	{
		super(name, level);
	}
	
	public abstract int calculatelevel(Attribute... attribute);
	
	
}
