package edu.epidata;

import java.util.ArrayList;
import java.util.List;

public class Character 
{
	private String realName;
	public String nickName;
	public boolean isHero;
	List<Attribute> attributes = new ArrayList<Attribute>();
	
	
	public Character(String realName, String nickName, boolean isHero) 
	{
		this.realName = realName;
		this.nickName = nickName;
		this.isHero = isHero;
		
		attributes.add(new Agility());
		attributes.add(new Strength());
		attributes.add(new Speed());
		attributes.add(new Resistance());
	}
	
	@Override
    public String toString() 
	{
		StringBuilder sbuilder = new StringBuilder();
		sbuilder.append(String.format("Nombre: %1$s Apodo: %2$s",realName,nickName));
		for(Attribute a: attributes) 
		{
			sbuilder.append(String.format("%1$s: ",a.Getname()));
			sbuilder.append(String.format("%1$s ",a.GetLevel()));
		}
			
		return sbuilder.toString();
		
	}
}
