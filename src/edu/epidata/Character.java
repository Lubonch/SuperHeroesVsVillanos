package edu.epidata;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import edu.epidata.attributes.*;

public class Character 
{
	private String realName;
	public String nickName;
	public boolean isHero;
	
	private AttributeManager attributes;
	
	
	public Character(String realName, String nickName, boolean isHero) 
	{
		this.realName = realName;
		this.nickName = nickName;
		this.isHero = isHero;
		attributes = new AttributeManager();
	}
	
	
	public String getRealName() {
		return realName;
	}


	public String getNickName() {
		return nickName;
	}


	public boolean isHero() {
		return isHero;
	}


	public List<Attribute> getAttributes() 
	{
		return attributes.getAttributes();
	}
	
	public void setAttributes(int a1, int a2, int a3, int a4) 
	{
		attributes.setAttributes(a1,a2,a3,a4);
	}


	@Override
    public String toString() 
	{
		StringBuilder sbuilder = new StringBuilder();
		sbuilder.append(String.format("Nombre: %1$s Apodo: %2$s",realName,nickName));
		for(Attribute a: attributes.getAttributes()) 
		{
			sbuilder.append(String.format(" %1$s: ",a.Getname()));
			sbuilder.append(String.format(" %1$s ",a.GetLevel()));
		}
			
		return sbuilder.toString();
		
	}
}
