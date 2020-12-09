package edu.epidata;

import java.util.ArrayList;
import java.util.List;

public class League extends Character
{
	List<Character> Members;
	
	public League(String realName, String nickName, boolean isHero) {
		super(realName, nickName, isHero);
		Members = new ArrayList<Character>();
	}
	
	public void addMember(String name) 
	{
		
	}
	
}
