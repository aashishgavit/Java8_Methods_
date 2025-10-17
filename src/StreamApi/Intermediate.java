package StreamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Intermediate 
{
	public static void main(String[] args) 
	{
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		
		//for even number
		list.stream().filter(s -> s%2 ==0).forEach(d -> System.out.println(d));
		
		//for even in list
		List<Integer> lw=list.
				stream()
				.filter(q -> q%2 ==0)
				.collect(Collectors.toList());
		System.out.println(lw);
		
		// for count 
		long count = list.stream().filter(s -> s%2==0).count();
		System.out.println(count);
		
		//
		List<String> name=Arrays.asList("Aashish", "Munna", "Vehan", "Raghu");
		//name.stream().filter(a -> a.startsWith("V")).forEach(s -> System.out.println(s));
		
		
		
		
		
	
		
		
	}

}
