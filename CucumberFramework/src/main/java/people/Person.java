package people;
/************************************************************************
 * Class Person
 * Represents a Person object with a name and an age value. 
 ************************************************************************/

public class Person 
{
	/************************************************************************
	 * Global Fields 
	 ************************************************************************/
	private String name;
	private int age;
	
	/************************************************************************
	 * Constructor 
	 * initiates fields name and age 
	 ************************************************************************/
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	/************************************************************************
	 * Default constructor
	 * Post- assigns global fields to their zero equivalent  
	 ************************************************************************/
	public Person() 
	{
	}
	
	/************************************************************************
	 * toFile method 
	 * files must be use this format when being read into the program  
	 * Post- returns string object in comma separated format 
	 ************************************************************************/
	public String toFile()
	{
		String export = name + "," + age;
		return export;
	}
	
	/************************************************************************
	 * prettyToFile method 
	 * Post- returns a String object of persons name and age in pretty format 
	 ************************************************************************/
	public String prettyToFile()
	{
		return String.format("\n%10s%15s\n%10s%15d\n","Name: ",getName(),"Age: ",getAge());
	}
	
	/************************************************************************
	 * Getter and setter methods 
	 * Post- these methods access or change private global fields 
	 ************************************************************************/
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}
	
	/************************************************************************
	 * toString method 
	 * over rides default toString method 
	 * Post- returns a String object of persons name and age in pretty format 
	 ************************************************************************/
	public String toString()
	{
		return String.format("\n%11s%15s\n%11s%15d\n","Name: ",getName(),"Age: ",getAge());
	}
}//end