package people;
/**************************************************************************
 * Employee Class 
 * Extends Person
 * Represents a Employee object with a office, salary and type value. 
 **************************************************************************/

public class Employee extends Person
{
	/**********************************************************************
	 * Global Fields
	 **********************************************************************/
	private String office;
	private double salary;
	public final String TYPE = "Employee";
	
	/**********************************************************************
	 * Constructor takes four arguments
	 * age and name are passed to the superclass constructor person.
	 * Salary and office instance variables are initiated 
	 **********************************************************************/
	public Employee(String name,int age, String office, double salary)
	{
		super(name, age);
		this.office = office;
		this.salary = salary;
	}
	
	/**********************************************************************
	 * Constructor takes three arguments 
	 * The first argument person is used to initiate name and age fields of 
	 * Employees super constructor Person. 
	 * salary and office instance variables are initiated.
	 **********************************************************************/
	public Employee(Person person, String office, double salary)
	{
		super(person.getName(), person.getAge());
		this.office = office; 
		this.salary = salary;
	}
	
	/*********************************************************************
	 *payments method 
	 *takes one double as the parameter 
	 *returns the dividend of this employees salary/24
	 *********************************************************************/
	public double payments(Double salary)
	{
		return (salary/24);
	}
	
	/********************************************************************
	 * toFile method 
	 * returns a String in comma separated format that is ready to be used 
	 * by the Database writeCommaSepertated method.
	 ********************************************************************/
	public String toFile()
	{
		return TYPE + "," + super.toFile() + "," + office + "," + salary; 
  	}
	
	/**********************************************************************
	 * prettyToFileMethod
	 * returns a String in a format that is easer to read than the String 
	 * returned by toFile. This string is ready to use by DatabaseStorage
	 *  write and prettyWritePerson methods.
	 **********************************************************************/
	public String prettyToFile()
	{
		return " " + TYPE + " " + super.toString() + String.format("%10s%15s\n%10s%15.2f\n",
				"Office: ", office, "Salary: ", salary);
	}
	
	/**********************************************************************
	 * Getter and setter methods 
	 * Post- these methods access or change private global fields 
	 **********************************************************************/
	public String getOffice()
	{
		return office; 
	}
	
	public double getSalary()
	{
		return salary; 
	}
	
	/*********************************************************************
	 * profile method 
	 * Post- returns a string object in pretty format 
	 *********************************************************************/
	public String profile()
	{
		return String.format("%11s%15s\n%11s%15d\n%11s%15s\n%11s%15.2f\n%11s%15.2f\n",
				"Name: ",getName(), "Age: " , getAge(),"Office: ", office,
				"Salary: ", salary, "Payments: ", payments(this.salary));
	}
	
	/*********************************************************************
	 * toString method 
	 * over rides parent classes toString method
	 * Post- returns a string object in pretty format
	 *********************************************************************/
	public String toString()
	{
		return super.toString() + String.format("%11s%15s\n%11s%15.2f\n%11s%15.2f\n",
				"Office: ", office, "Salary: ", salary, "Payments: ", payments(this.salary));
	}
}//end 
