package edu.epidata;

import java.util.Comparator;

public class ResistanceComparator implements Comparator<Character> 
{

	@Override
	public int compare(Character o1, Character o2) 
	{
		return o1.getAttributes().get(3).GetLevel() - o2.getAttributes().get(3).GetLevel();
	}
	
}
