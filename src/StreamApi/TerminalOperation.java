package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperation 
{
	public static void main(String[] args) 
	{
		//for each count...
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		list.stream().forEach(z -> System.out.println(z));
		
	
		
		//In form of list
		List<Integer> l1=list.stream().collect(Collectors.toList());
		System.out.println(l1);
		
		
		//for count
		long count=  list.stream().count();
		System.out.println(count);
		
		long count1=list.stream().distinct().count();
		System.out.println(count1);
	
		
		
		
		//sum of complete list
		Optional<Integer> sum=list.stream().reduce((a,b) -> (a+b));
		System.out.println("Sum of list : "+sum.get());
		
		
		
		
		
	}

}
