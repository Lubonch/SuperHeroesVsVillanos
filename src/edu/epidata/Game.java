package edu.epidata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import edu.epidata.parameters.Parameter;

public class Game
{
	enum order {ASC, DESC}
	List<Character> characters;
	
	public Game() 
	{
		characters  = new ArrayList<Character>();
	}
	
	public void CreateCharacter(String name, String nick, boolean hero) 
	{
		characters.add(new Character(name, nick, hero));
	}
	
	public void Fight(String C1, String C2) 
	{
		boolean win = false;
		Character fighter1 = SearchCharacter(characters, C1);
		Character fighter2 = SearchCharacter(characters, C2);
		
		if(fighter1.getAttributes().get(0).GetLevel() < fighter2.getAttributes().get(0).GetLevel()) 
		{
			win = true;
		}
		
		if(win == true) 
		{
			System.out.println(fighter1.getNickName()+" is the winner!");
		}
	}
	
	public void WhoBeat(String C)
	{
		Character fighter = SearchCharacter(characters, C);
		List<Character> BeatByAgility = new ArrayList<Character>();
		List<Character> BeatBySpeed = new ArrayList<Character>();
		List<Character> BeatByStrength = new ArrayList<Character>();
		List<Character> BeatByResistance = new ArrayList<Character>();
		
		for(Character charac: characters) 
		{
			if(fighter.getAttributes().get(0).GetLevel() < charac.getAttributes().get(0).GetLevel()) 
			{
				BeatByAgility.add(charac);
			}
			if(fighter.getAttributes().get(1).GetLevel() > charac.getAttributes().get(1).GetLevel()) 
			{
				BeatBySpeed.add(charac);
			}
			if(fighter.getAttributes().get(2).GetLevel() > charac.getAttributes().get(2).GetLevel()) 
			{
				BeatByStrength.add(charac);
			}
			if(fighter.getAttributes().get(3).GetLevel() > charac.getAttributes().get(3).GetLevel()) 
			{
				BeatByResistance.add(charac);
			}
		}
		System.out.println(fighter.getNickName()+" is weak against the Agility level of: ");
		for(Character charac: BeatByAgility) {charac.toString();}
		System.out.println(fighter.getNickName()+" is weak against the Speed level of: ");
		for(Character charac: BeatBySpeed) {charac.toString();}
		System.out.println(fighter.getNickName()+" is weak against the Strength level of: ");
		for(Character charac: BeatByStrength) {charac.toString();}
		System.out.println(fighter.getNickName()+" is weak against the Resistance level of: ");
		for(Character charac: BeatByResistance) {charac.toString();}
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
	
	public Character SearchCharacter(List<Character> characs, String Nick) 
	{
		Character searchedcharac = new Character("","",true);
		
		for(Character charac: characs) 
		{
			if(charac.getNickName().equals(Nick)) 
			{
				searchedcharac =  charac;
			}
		}
		
		return searchedcharac;
	}
	
}
