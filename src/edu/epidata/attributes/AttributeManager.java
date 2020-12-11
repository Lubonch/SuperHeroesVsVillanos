package edu.epidata.attributes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class AttributeManager 
{
	List<Attribute> attributes;
	

	public AttributeManager() 
	{
		attributes = new ArrayList<Attribute>();
		attributes.add (new Agility ("Agilty", new Random().nextInt(500)));
        attributes.add (new Speed ("Speed", new Random().nextInt(500)));
        attributes.add (new Strength ("Strenght", new Random().nextInt(500)));
        attributes.add (new Resistance ("Resistance", attributes.get(2).GetLevel(), attributes.get(1).GetLevel()));
	}
	
	public List<Attribute> getAttributes() 
	{
		return attributes;
	}
	
	public void setAttributes(int a1, int a2, int a3, int a4) 
	{
		attributes.get(0).SetLevel(a1);
		attributes.get(1).SetLevel(a2);
		attributes.get(2).SetLevel(a3);
		attributes.get(3).SetLevel(a4);
	}

	
}
