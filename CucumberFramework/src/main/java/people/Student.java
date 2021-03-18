package people;
/**************************************************************************
 * Student Class 
 * Extends Person
 * Represents a Student object with a status, gpa and type value. 
 **************************************************************************/

public class Student extends Person 
{
	/*********************************************************************
	 *Global Fields
	 *********************************************************************/
	private Status status; 
	private double gpa;
	public final String TYPE = "Student"; 
	
	/*********************************************************************
	 * Constructor takes four arguments 
	 * age and name are passed to the superclass constructor person.
	 * status and gpa instance variables and initiated 
	 *********************************************************************/
	public Student(String name, int age, Status status, double gpa)
	{ 
		super(name, age);
		this.status = status; 
		this.gpa = gpa; 
	}
	
	/*********************************************************************
	 * Constructor takes three arguments 
	 * The first argument person is used to initiate name and age fields of this
	 * Students super constructor Person.
	 * status and gpa instance variables and initiated 
	 *********************************************************************/
	public Student(Person person, double gpa, Status status)
	{
		super(person.getName(), person.getAge());
		this.status = status; 
		this.gpa = gpa;
	}
	
	/*********************************************************************
	 * isOnProbation method 
	 * checks if students gpa is less than 2.0  
	 * -Post if less than 2.0 returns true else returns false.  
	 *********************************************************************/
	public boolean isOnProbation(double gpa)
	{
		return ((gpa < 2.0) ? true:false);
	}
	
	/********************************************************************
	 * toFile method 
	 * returns a String in comma separated format that is ready to be used 
	 * by the Database writeCommaSepertated method.
	 ********************************************************************/
	public String toFile()
	{
		return TYPE + "," + super.toFile() + "," + status + "," + gpa; 
  	}
	
	/**********************************************************************
	 * prettyToFileMethod
	 * returns a String in a format that is easer to read than the String 
	 * returned by toFile. This string is ready to use by DatabaseStorage
	 *  write and prettyWritePerson methods.
	 **********************************************************************/
	public String prettyToFile()
	{
		return "  " + TYPE + " " + super.toString() + String.format("%10s%15s\n%10s%15.2f\n",
				"Status: ", status, "Gpa: ", gpa);
	}
	
	/**********************************************************************
	 * Getter and setter methods 
	 * Post- these methods access or change private global fields
	 **********************************************************************/
	public Status getStatus()
	{
		return status;
	}

	public void setStatus(Status status)
	{
		this.status = status;
	}

	public double getGpa()
	{
		return gpa;
	}

	public void setGpa(double gpa)
	{
		this.gpa = gpa;
	}
	
	/*********************************************************************
	 * profile method 
	 * Post- returns a string object in pretty format 
	 *********************************************************************/
	public String profile()
	{
		return String.format("%11s%15s\n%11s%15d\n%11s%15s\n%11s%15.2f\n%11s%15s\n","Name: ",getName(), "Age: " , getAge(),
				"Status: ", status, "Gpa: ", gpa ,"Probation: ", isOnProbation(this.gpa));
	}
	
	/*********************************************************************
	 * toString method 
	 * over rides parent classes toString method
	 * Post- returns a string object in pretty format
	 *********************************************************************/
	public String toString()
	{
		return super.toString() + String.format("%11s%15s\n%11s%15.2f\n%11s%15s\n",
				"Status: ", status, "Gpa: ", gpa ,"Probation: ", isOnProbation(this.gpa));
	}
}//end
