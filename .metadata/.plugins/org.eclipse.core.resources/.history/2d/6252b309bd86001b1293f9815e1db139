package database;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import people.*;
 

public class DataClient
{
	 public static void main(String[] args) throws FileNotFoundException
     {
		 /**************************************************************************
		  * Initiates a DatabaseStorage object and reads in a file of person objects.   
		  **************************************************************************/
		 DatabaseStorage test = new DatabaseStorage(File.separator + "home" + File.separator
				 									+ "dog" + File.separator + "College.txt");
		 CollegeDatabase db = test.read();
		 
		 /**************************************************************************
		  * Testing CollegeDatabase with invalid constructor.  
		  **************************************************************************/
		 System.out.println();
		 System.out.println("Invalid case for array size: ");
		 CollegeDatabase personArrayLengthZero = new CollegeDatabase(0);
		 CollegeDatabase personArrayLengthNegitive = new CollegeDatabase(-1);
		 extraLine();
		 
		 /**************************************************************************
		  * Testing if array was created and a Person object is added correctly.
		  **************************************************************************/
		 System.out.println("Adding one person to db: ");
		 Person validPerson = new Student("Desk Lamp", 100, Status.SOPHOMORE, 2.6);
		 db.add(validPerson);
		 System.out.println(db.search("Desk Lamp"));
		 extraLine();
		 
		 /**************************************************************************
		  * Testing CollegeDatabase Search method. 
		  **************************************************************************/
		 System.out.println("Searching database: ");
		 System.out.println(db.search("Virginia Alcott")); 
		 System.out.println(db.search("Henry Nyguen")); 
		 System.out.println(db.search("Wilbur Grant"));
		 extraLine();
		 
		 /**************************************************************************
		  * Testing CollegeDatabase Search method with a person not in the array. 
		  **************************************************************************/
		 System.out.println("Searching for a person not in the array: ");
		 System.out.println(db.search("Monty Python"));
		 extraLine();
		 
		 /**************************************************************************
		  * Testing CollegeDatabase delete method. Returns true if person was deleted
		  **************************************************************************/
		 System.out.println("Deleting persons in array: ");
		 System.out.println(db.delete("Virginia Alcott"));
		 System.out.println(db.delete("Henry Nyguen"));
		 System.out.println(db.delete("Wilbur Grant"));
		 extraLine();
		 
		 /**************************************************************************
		  * Testing CollegeDatabase separation methods.
		  **************************************************************************/
		 Student[] studentDB = db.separateStudent();
		 Employee[] employeeDB = db.separateEmployee();
		 
		 Student[] lessThan2 = gpaSeparation(studentDB, 2);
		 System.out.println("Testing Student gpa separation 2.0: ");
		 System.out.println(Arrays.toString(lessThan2));
		 extraLine();
		 
		 Student[] lessThan3 = gpaSeparation(studentDB, 3);
		 System.out.println("Testing Student gpa separation 3.0: ");
		 System.out.println(Arrays.toString(lessThan3));
		 extraLine();
		 
		 Employee[] moreThan55 = salarySeparation(employeeDB);
		 System.out.println("Testing Employee salary separation 55,000: ");
		 System.out.println(Arrays.toString(moreThan55));
		 extraLine();
		 
		 Person[] empMoreThan40 = ageSeparation(employeeDB);
		 System.out.println("Testing Employee age separation over 40: ");
		 System.out.println(Arrays.toString(empMoreThan40));
		 extraLine();
		 
		 Person[] stuLessThan25 = ageSeparation(studentDB);
		 System.out.println("Testing Student age separation under 25: ");
		 System.out.println(Arrays.toString(stuLessThan25));
		 extraLine();
	 }
	 
	 /******************************************************************************
	  * extraLine method 
	  * Post- prints two lines for formating purposes.
	  ******************************************************************************/
	 public static void extraLine()
	 {
		 for(int i = 0; i < 2; i++)
		 {
			 System.out.println();
		 }
	 }
	 
	 /*****************************************************************************
	  * static gpaSeparation method
	  * Takes array of students and a double as parameters, and adds any student 
	  * with a gpa under the parameter Double gpa to a temporary array.
	  * Post- returns temporary array. 
	  *****************************************************************************/
	 public static Student[] gpaSeparation(Student[] student, double gpa)
	 {
		 Student[] holder = new Student[student.length];
		 int j = 0;
		 for (int i = 0; i < student.length; i ++)
		 {
			 if(student[i] != null && student[i].getGpa() < gpa)
			 {
				 holder[j] = student[i];
				 j++;
			 }
		 }
		 holder = Arrays.copyOfRange(holder, 0, j);
		 return holder; 
	 }
	 
	 /*****************************************************************************
	  * static salarySeparation method
	  * Takes array of employees as only parameter, and adds any employee with salary 
	  * over 55k to a temporary array.
	  * Post- returns temporary array. 
	  *****************************************************************************/
	 public static Employee[] salarySeparation(Employee[] employee)
	 {
		 Employee[] holder = new Employee[employee.length];
		 int j = 0;
		 for (int i = 0; i < employee.length; i ++)
		 {
			 if(employee[i] != null && employee[i].getSalary() > 55000.00)
			 {
				 holder[j] = employee[i];
				 j++;
			 }
		 }
		 holder = Arrays.copyOfRange(holder, 0, j);
		 return holder; 
	 }
	 
	 /*****************************************************************************
	  * static ageSeparation method
	  * Pre- Only works if actual parameter is an array of only Students or only Employees.  
	  * Takes an array of type person as only parameter, and adds all employees over 
	  * the age of 40 or adds all students under age of 25 to a temporary array 
	  * Post- returns temporary array
	  *****************************************************************************/
	 public static Person[] ageSeparation(Person[] person)
	 {
		 int j = 0; 
		 Person[] holder = new Person[person.length];
		 for (int i = 0; i < person.length; i++)
		 {
			 if (person[i] instanceof Employee && person[i].getAge() > 40)
			 {
				 holder[j] = person[i];
				 j++;
			 }
			 else if(person[i] instanceof Student && person[i].getAge() < 25)
			 {
				 holder[j] = person[i];
				 j++;
			 }
			 continue; 
		 }
		 holder = Arrays.copyOfRange(holder, 0, j);
		 return holder;
	 }
}//end
