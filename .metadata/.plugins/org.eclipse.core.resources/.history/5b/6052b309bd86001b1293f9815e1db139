package database;

import people.Employee;
import people.Person;
import people.Student;
/******************************************************************
* CollegeDatabase Class
* implements Database 
* Represents A CollegeDataBase object with a default size, not found, 
* entry and size type value.
* Maintains A database of people that are members of a college. 
*******************************************************************/

public class CollegeDatabase implements Database
{
	//Global fields 
	public static final int DEFAULT_SIZE = 20; 
	public final int NOT_FOUND = -1; 
	private Person[] entry; 
	private int size,test,teste; 
	
	/****************************************************
	 * Default constructor CollegeDatabase
	 * Post- calls a second constructor with default size 
	 * as it's argument.
	 ****************************************************/
	public CollegeDatabase()
	{ 
		this(DEFAULT_SIZE);
	}
	
	/****************************************************
	 * Constructor CollegeDatabase
	 * Accepts an arrays max size as an integer
	 * array size must be grater than zero
	 * Post- initialize size to zero and person array 
	 ****************************************************/
	public CollegeDatabase(int arraySize)
	{
		try
		{
			if (arraySize < 1)
			{
				throw new IllegalArgumentException("you entered: " + arraySize);
			}
			else
			{
				entry = new Person[arraySize];
				size = 0;
			} 
		}
		catch (IllegalArgumentException e)
		{
			System.out.println("Array size must be greater than zero: " + e);
		}
	}
	
	/****************************************************
	 * expand method 
	 * Helper method that creates an array twice the size 
	 * of the current entry array, and copies the contents 
	 * of the current array into the new array.
	 ****************************************************/
	public void expand()
	{
		Person[] holder = new Person[entry.length * 2];
		
		for (int i = 0; i < entry.length; i++)
		{
			holder[i] = entry[i];
		}
		entry = holder;
	}
	
	/************************************************************
	 * add method 
	 * This method accepts a Person object as a parameter,
	 * Checks to see if the database is full, if so expands 
	 * it calls the expand method.
	 * runs a check that no duplicate names are added to database. 
	 * Post- adds new person to existing Person database.
	 ************************************************************/
	public void add(Person person)
	{   
		if(size == entry.length)
		{
			expand();
		}
		int location = findLocation(person.getName());
		try
		{		
			if(location != NOT_FOUND)
			{
				throw new IllegalArgumentException("Duplicate name not added!");
			}
			else
			{
				entry[size] = person; 
				size++;
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Name already used! Index: " + location + " " + person.getName() + e);
		}
	}
	
	/***********************************************************
	 * delete method
	 * Takes string as a parameter. This string is used to find 
	 * the persons position in the Person array. 
	 * Post- deletes a person from the database if found and returns
	 * true, if not found returns false.
	 ***********************************************************/
	public boolean delete(String name)
	{
		int location = findLocation(name);
		if(location == NOT_FOUND)
		{
			return false;
		}
		 for(int j = location; j < size; j++)
			entry[j] = entry[j + 1];
			return true;
	}

	/***********************************************************
	 * search method
	 * Takes string as parameter. This string is passed to 
	 * findLocation method and checks if the person was found or
	 * not.
	 * Post- returns a person object if persons name is found. If 
	 * name is not found null is returned. 
	 ***********************************************************/
	public Person search(String name)
	{
		int location = findLocation(name);
		if (location == NOT_FOUND)
		{
			System.out.println("Person not in Database");
			return null; 
		}
		return entry[location];
	}
	
	/****************************************************
	 * findLocation method 
	 * Takes a string as a parameter and loops array checking 
	 * if this string exists 
	 * Post- returns an integer of the person index in
	 * Person array. If person is not found returns -1. 
	 ****************************************************/
	public int findLocation(String name)
	{
		for(int i = 0; i < size; i++)
		{
			if(entry[i].getName().equals(name))
			{
				return i; 
			}
		}
		return NOT_FOUND;
	}
	
	/***********************************************************
	 * getDatabase method
	 * Post- returns Person array.
	 ***********************************************************/
	public Person[] getDatabase()
	{
		return entry;
	}
	
	/***********************************************************
	 * separateStudent method 
	 * separates out all Person objects of type student in
	 * entry array and places them into a temporary array.
	 * Post- returns temporary array
	 ***********************************************************/
	public Student[] separateStudent()
	{
		Student[] holder = new Student[size]; 
		int addPoint = 0; 
		for (int i = 0; i < size; i++)
		{
			if(entry[i] instanceof Student)
			{
				holder[addPoint] = (Student) entry[i];
				addPoint++;
			}
		}
		return holder; 
	}
	
	/***********************************************************
	 * separateEmployee method 
	 * separates out all Person objects of type Employee in
	 * entry array and places them into a temporary array.
	 * Post- returns temporary array
	 ***********************************************************/
	public Employee[] separateEmployee()
	{
		Employee[] holder = new Employee[size]; 
		int addPoint = 0; 
		for (int i = 0; i < size; i++)
		{
			if(entry[i] instanceof Employee)
			{
				holder[addPoint] = (Employee) entry[i];
				addPoint++;
			}
		}
		return holder; 
	}
	
	/***********************************************************
	 * get method 
	 * Accepts a string as only parameter. This string is used 
	 * as a parameter to the findLocation method. 
	 * post- If found returns index of person in array. If not
	 * returns -1. 
	 ***********************************************************/
	public int get(String name)
	{
		 return findLocation(name);
	}

	/***********************************************************
	 * getSize method
	 * -Post returns size 
	 ***********************************************************/
	public int getSize()
	{
		return size;
	}
}//end
