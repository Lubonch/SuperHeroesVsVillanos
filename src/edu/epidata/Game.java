package edu.epidata;

import java.util.ArrayList;
import java.util.List;

import edu.epidata.parameters.Parameter;

public class Game
{
	enum order {ASC, DESC}
	static List<Character> characters;
	
	public Game() 
	{
		characters  = new ArrayList<Character>();
	}
	
	public static void CreateCharacter(String name, String nick, boolean hero) 
	{
		characters.add(new Character(name, nick, hero));
	}
	
	public static void Fight(Character C1, Character C2, Parameter Attribute) 
	{
		
	}
	
	public static  List<Character> WhoBeat(Character C, String param, String param2, String param3)
	{
		
		return characters;
		
	}
	public static List<Character> CharacterList(order val, String param, String param2, String param3) 
	{
		return characters;
		
	}
}
