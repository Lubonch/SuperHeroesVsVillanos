package edu.epidata;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CharacterChainedComparatorDESC implements Comparator<Character>
{
	private List<Comparator<Character>> listComparators;
	
	@SafeVarargs
	public CharacterChainedComparatorDESC(Comparator<Character>... comparators) 
	{
        this.listComparators = Arrays.asList(comparators);
    }
	
	@Override
    public int compare(Character o1, Character o2) 
	{
        for (Comparator<Character> comparator : listComparators) 
        {
            int result = comparator.compare(o2, o1);
            if (result != 0) 
            {
                return result;
            }
        }
        return 0;
    }
}