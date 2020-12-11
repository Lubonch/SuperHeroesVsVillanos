package edu.epidata.comparators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import edu.epidata.Character;

public class CharacterChainedComparatorASC implements Comparator<Character>
{
	private List<Comparator<Character>> listComparators;
	
	@SafeVarargs
	public CharacterChainedComparatorASC(Comparator<Character>... comparators) 
	{
        this.listComparators = Arrays.asList(comparators);
    }
	
	@Override
    public int compare(Character o1, Character o2) 
	{
        for (Comparator<Character> comparator : listComparators) 
        {
            int result = comparator.compare(o1, o2);
            if (result != 0) 
            {
                return result;
            }
        }
        return 0;
    }
}
