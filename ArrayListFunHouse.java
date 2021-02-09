//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
 
  public static ArrayList<Integer> getListOfFactors(int number)
  {                                         
	  //declare and initialize a new empty arraylist of integers
    ArrayList<Integer> factors = new ArrayList<Integer>();
     	//for loop that starts from 2, and goes up to the number
    for (int i = 2; i < number; i ++)
	  {
      //if the number is divisible by the current number
      if (number % i == 0)
		  {
			  //add the current number to the arrayList
        factors.add(i);
		  }
	  }
	  //return the arraylist
    return factors;
  }
 
  public static void keepOnlyCompositeNumbers( List<Integer> nums )
  {
	  //for loop that loops backwards through the ArrayList
    for (int i = nums.size() - 1; i >= 0; i--)
    {
      //if the current number is not composite
      if (getListOfFactors(nums.get(i)).size() < 1)
      {
        //remove the current element from the list
        nums.remove(i);
      }
    }
  }
}
