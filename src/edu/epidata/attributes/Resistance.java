package edu.epidata.attributes;

public class Resistance extends Attribute
{
	public Resistance(String name, int val1, int val2) 
	{
		super(name, val1/val2 );
	}
	
}
