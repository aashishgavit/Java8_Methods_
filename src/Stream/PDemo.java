package Stream;

import java.util.function.Function;

public class PDemo
{

	public static void main(String[] args)
	{
		Predicate<Integer> p=(T) -> T%2 ==0;
		System.out.println(p.test (23));
		
		Function<Integer, Integer> p1=(T) -> T*2;
		System.out.println(p1.apply(85));
		
		
	}
	
}
