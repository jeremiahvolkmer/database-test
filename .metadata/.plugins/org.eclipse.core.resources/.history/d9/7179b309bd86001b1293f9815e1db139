package database;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import people.*;

/******************************************************************
* DatabaseStorage Class
* Represents A DatabaseStorage object with a file and CollegeDatabase 
* type value. 
* Stores a CollegeDatabase and manages the file I/O of a Database object.
*******************************************************************/
public class DatabaseStorage   
{
	/****************************************************************
	 * Global fields
	 ****************************************************************/
	 private File file;
	 private CollegeDatabase db;
	 
    /***************************************************************
	  * TODO throw io exception 
	  ***************************************************************/
	 public DatabaseStorage(String path) 
	 {
		 try
		 {
			 if (new File(path).canRead())
			 {
			     file = new File(path);
			 }
			 else
			 {
				 file = new File(path);
				 throw new IOException();
			 }
		 }
		 catch (IOException e) 
		 {
			 System.out.println("Dude your file was not found: " + e);
		 }
		 
	 }
	 
	 /***************************************************************
	  * parsePerson method 
	  * Takes string as a parameter. The comma is used to separate the 
	  * string into elements. Elements are placed into an array of strings. 
	  * Each element is parsed to matching type.
	  * Post- if array element 0 equals "Student" Person object is returned
	  * else Employee object is returned.  
	  ***************************************************************/
	 public Person parsePerson(String line)
	 { 
		 String[] dataLine = line.split(",");
		 Status status = null; 
         String name = dataLine[1];
         int age = Integer.parseInt(dataLine[2]);
         for (Status s : Status.values()) 
         {
             if (s.name().equals(dataLine[3])) 
             {
            	 status = Status.valueOf(dataLine[3]);
             }
         }
         String room = dataLine[3];
         double gpa = Double.parseDouble(dataLine[4]);
         double salary = Double.parseDouble(dataLine[4]);
    
         if (dataLine[0].equals("Student"))
         {
        	 return new Student(name, age, status, gpa);
         }
       
         return new Employee(name, age, room, salary);
	 }
	 
	 /***************************************************************
	  * read method
	  * Scans each line of the input file. Each line is passed to parsePerson 
	  * method and a person object is returned and added to the current database.
	  * Post- returns a CollegeDatabase 
	  ***************************************************************/
	 public CollegeDatabase read() 
	 {
		db = new CollegeDatabase();
		Scanner input;
		try
		{
			input = new Scanner(file);
			while(input.hasNextLine())
			 {
				 String line = input.nextLine();
				 Person person = parsePerson(line);
				 db.add(person);
			 }
			 input.close(); 
			 return db;
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("Your file was not found: " + e);
		}
		catch (NullPointerException e)
		{
			System.out.println("not found: " + e);
		}
		
		return db; 
		 
		
	 }
	 
	 /***************************************************************
	  * setFile method 
	  * updates private file field to follow new path.
	  ***************************************************************/
	 public void setFile(String path)
	 {
		 file = new File(path); 
	 }
	 
	 /****************************************************************
	  * write method
	  * Takes a college database as only parameter
	  * Post- writes entire database to file in pretty format.
	  ***************************************************************/
	 public void write(CollegeDatabase data) 
	 {
		 PrintStream output;
		try
		{
			 output = new PrintStream(file);
			 Person[] entries = data.getDatabase();
			 for (int i = 0; i < data.getSize(); i++)
			 {
				 String holder = entries[i].prettyToFile();
				 output.println(holder);
			 }
			 output.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Your file was not found: " + e);
		}
		
	 }
	 
	 /***************************************************************
	  * writeCommaSeperated method
	  * Takes a CollegeDatabase as only parameter 
	  * Post- writes entire database to file in comma separated format
	  * to a file.
	  ***************************************************************/
	 public void writeCommaSeperated(CollegeDatabase data)
	 {
		 PrintStream output;
		try
		{
			 output = new PrintStream(file);
			 Person[] entries = data.getDatabase();
			 for (int i = 0; i < data.getSize(); i++)
			 {
				 String holder = entries[i].toFile();
				 output.println(holder);
			 }
			 output.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Your file was not found: " + e);
		}
		
	 }
	 
	 /***************************************************************
	  * writePerson method
	  * Takes person object as only parameter
	  * Post- writes single person object to file in comma separated format. 
	  ***************************************************************/
	 public void writePerson(Person person) 
	 {
		 PrintStream output;
		try
		{
			output = new PrintStream(file);
			String holder = person.toFile();
			output.println(holder);
			output.close();
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("Your file was not found: " + e);
		}
		 
	 }
	 
	 /***************************************************************
	  * prettyWritePerson method 
	  * Takes person object as only parameter 
	  * Post- writes single person object to file in presentation format. 
	  ***************************************************************/
	 public void prettyWritePerson(Person person)  
	 {
		 PrintStream output;
		try
		{
			output = new PrintStream(file);
			String holder = person.prettyToFile();
			output.println(holder);
			
			output.close();
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("Your file was not found: " + e);
		}
	}
}//end 
