package edu.epidata;

import java.util.ArrayList;
import java.util.List;

public class League
{
	public List<Character> Members;
	private Character LeagueStats;
	private String name;
	private String type;
	enum Type {Heroes, Villians}
	
	public League(String name, String type) {
		Members = new ArrayList<Character>();
		this.name = name;
		this.type = type;
		this.LeagueStats = null;
	}
	
	public void addMember(Character charac) 
	{
		Members.add(charac);
	}
	
	private Character CalculateStats(List<Character> chslist)
	{
		
		int Ag = 0, 
			Sp = 0, 
			Str = 0, 
			Res = 0;
		for(Character C : chslist) 
		{
			Ag += C.getAttributes().get(0).GetLevel();
			Sp += C.getAttributes().get(1).GetLevel();
			Str += C.getAttributes().get(2).GetLevel();
			Res += C.getAttributes().get(3).GetLevel();
		}
		
		Character retCharac = new Character(Getname(), Getname(), false);
		retCharac.setAttributes(Ag/Members.size(), Sp/Members.size(), Str/Members.size(), Res/Members.size());
		return retCharac;	
	}
	
	public Character GetLeagueStats() 
	{
		this.LeagueStats = CalculateStats(Members);
		return this.LeagueStats;
	}
	
	public String Getname() 
	{
		return this.name;
	}
	
	@Override
    public String toString() 
	{
		return this.name;
	}
}
