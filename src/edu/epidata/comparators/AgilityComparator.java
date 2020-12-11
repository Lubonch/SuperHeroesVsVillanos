package edu.epidata.comparators;

import java.util.Comparator;

import edu.epidata.Character;

public class AgilityComparator implements Comparator<Character>
{
	
	@Override
	public int compare(Character o1, Character o2) 
	{
		return o1.getAttributes().get(0).GetLevel() - o2.getAttributes().get(0).GetLevel();
	}

}
