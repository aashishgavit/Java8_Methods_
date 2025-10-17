package com.practice;

public class Demo 
{
	public static void main(String[] args) 
	{
		Student d=new Student(" Aashish" , 1);
		Student d1=new Student(" Gavit" , 2);
		Student d2=new Student(" Munna" , 3);
		Student d3=new Student(" Vehan" , 4);
		Student d4=new Student(" Alex" , 5);
		
		Student[] one={d ,d2,d3,d4};
		
		for(int i=0; i<=one.length; i++)
		{
			System.out.println(one[i]);
		}
		
//		System.out.println(one);
//		System.out.println(one.toString());
		
	}
	
	

}
