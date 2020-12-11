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
	
	public Character addMember(Character charac) 
	{
		if(Members.isEmpty()) 
		{
			Members.add(charac);
			LeagueStats = charac;
		}else
		{
			Members.add(charac);
			LeagueStats = CalculateStats(Members);
		}
		return LeagueStats;
	}
	
	public Character addMember(League league) 
	{
		if(Members.isEmpty()) 
		{
			Members.add(league.GetLeagueStats());
			LeagueStats = league.GetLeagueStats();
		}else
		{
			Members.add(league.GetLeagueStats());
			LeagueStats = CalculateStats(Members);
		}
		return LeagueStats;
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
		retCharac.setAttributes(Ag, Sp, Str, Res);
		return retCharac;	
	}
	
	public Character GetLeagueStats() 
	{
		return this.LeagueStats;
	}
	
	public String Getname() 
	{
		return this.name;
	}

}
