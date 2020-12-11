package edu.epidata.comparators;

import java.util.Comparator;

import edu.epidata.Character;

public class NicknameComparator implements Comparator<Character> 
{

	@Override
	public int compare(Character o1, Character o2) 
	{
		return o1.getNickName().compareToIgnoreCase(o2.getNickName());
	}

}
