package JavaInterfaceMethods;

public interface Animal 
{
	
	public void getame();
	
	public static void getAge() 
	{
		
		System.out.println("Static method in Interface");
		
	}
	
	default void getAgeFromCAll()
	{
		agecalculator();
	}
	
	
	private void agecalculator()
	{
		System.out.println("In private method of interface");
	}
	
	

}
