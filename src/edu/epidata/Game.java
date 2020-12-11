package edu.epidata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import edu.epidata.parameters.Parameter;
import edu.epidata.comparators.AgilityComparator;
import edu.epidata.comparators.CharacterChainedComparatorASC;
import edu.epidata.comparators.CharacterChainedComparatorDESC;
import edu.epidata.comparators.NicknameComparator;
import edu.epidata.comparators.RealNameComparator;
import edu.epidata.comparators.ResistanceComparator;
import edu.epidata.comparators.SpeedComparator;
import edu.epidata.comparators.StrengthComparator;

public class Game
{
	public enum order {ASC, DESC}
	private List<League> leagues;
	private List<Character> characters;
	
	public Game() 
	{
		characters  = new ArrayList<Character>();
		leagues = new ArrayList<League>();
	}
	
	public void CreateCharacter(String name, String nick, boolean hero) 
	{
		characters.add(new Character(name, nick, hero));
	}
	
	public void CreateLeague(String leagueName, String type) 
	{
		leagues.add(new League(leagueName, type));
	}
	
	public void Fight(String C1, String C2) 
	{
		boolean win = false;
		Character fighter1 = SearchCharacter(characters, C1);
		if(fighter1 == null) {fighter1 = SearchLeague(leagues, C1).GetLeagueStats();}
		Character fighter2 = SearchCharacter(characters, C2);
		if(fighter2 == null) {fighter2 = SearchLeague(leagues, C2).GetLeagueStats();}
		
		if(fighter1.getAttributes().get(0).GetLevel() < fighter2.getAttributes().get(0).GetLevel()) 
		{
			win = true;
		}
		
		if(win) 
		{
			System.out.println(fighter1.getNickName()+" is the winner!");
		}else 
		{
			System.out.println(fighter2.getNickName()+" is the winner!");
		}
	}
	
	public void WhoBeat(String C)
	{
		Character fighter = SearchCharacter(characters, C);
		
		if(fighter == null) {fighter = SearchLeague(leagues, C).GetLeagueStats();}
		
		List<Character> BeatByAgility = new ArrayList<Character>();
		List<Character> BeatBySpeed = new ArrayList<Character>();
		List<Character> BeatByStrength = new ArrayList<Character>();
		List<Character> BeatByResistance = new ArrayList<Character>();
		
		for(Character charac: characters) 
		{
			if(new AgilityComparator().compare(fighter, charac) < 0) 
			{
				BeatByAgility.add(charac);
			}
			if(new SpeedComparator().compare(fighter, charac) < 0) 
			{
				BeatBySpeed.add(charac);
			}
			if(new StrengthComparator().compare(fighter, charac) < 0) 
			{
				BeatByStrength.add(charac);
			}
			if(new ResistanceComparator().compare(fighter, charac) < 0) 
			{
				BeatByResistance.add(charac);
			}
		}
		System.out.println(fighter.getNickName()+" is weak against the Agility level of: ");
		for(Character charac: BeatByAgility) {System.out.println(charac.toString());}
		System.out.println(fighter.getNickName()+" is weak against the Speed level of: ");
		for(Character charac: BeatBySpeed) {System.out.println(charac.toString());}
		System.out.println(fighter.getNickName()+" is weak against the Strength level of: ");
		for(Character charac: BeatByStrength) {System.out.println(charac.toString());}
		System.out.println(fighter.getNickName()+" is weak against the Resistance level of: ");
		for(Character charac: BeatByResistance) {System.out.println(charac.toString());}
	}
	public void CharacterList(order val) 
	{
		if(val == order.ASC) 
		{
			Collections.sort(characters,new CharacterChainedComparatorASC(new RealNameComparator(),
					new NicknameComparator(),
					new AgilityComparator(),
					new SpeedComparator(),
					new StrengthComparator(),
					new ResistanceComparator()));
		}else if(val == order.DESC)
		{
			Collections.sort(characters,new CharacterChainedComparatorDESC(new RealNameComparator(),
					new NicknameComparator(),
					new AgilityComparator(),
					new SpeedComparator(),
					new StrengthComparator(),
					new ResistanceComparator()));
		}
		
		
		for (Character charac : characters) 
		{
          System.out.println(charac.toString());
        }		
	}
	
	public static Character SearchCharacter(List<Character> characs, String Nick) 
	{
		Character searchedcharac = null;
		
		for(Character charac: characs) 
		{
			if(charac.getNickName().equals(Nick)) 
			{
				searchedcharac =  charac;
			}
		}
		
		return searchedcharac;
	}

	public void addToLeague(String leagueName, String C) 
	{
		
		League league = SearchLeague(leagues, leagueName);
		if(league != null) 
		{
			league.addMember(SearchCharacter(characters, C));
		}		
	}

	public static League SearchLeague(List<League> leagues, String name) 
	{
		League searcheditem = null;
		
		for(League league: leagues) 
		{
			if(league.Getname().equals(name)) 
			{
				searcheditem = league;
			}
		}
		
		return searcheditem;
	}
	public List<League> getLeagues()
	{
		return leagues;
	}
}
