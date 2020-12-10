package edu.epidata;

import java.util.Comparator;

public class RealNameComparator implements Comparator<Character> 
{

	@Override
	public int compare(Character o1, Character o2) 
	{
		return o1.getRealName().compareToIgnoreCase(o2.getRealName());
	}

}
