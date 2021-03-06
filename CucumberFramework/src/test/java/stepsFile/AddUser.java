package stepsFile;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import database.CollegeDatabase;
import org.junit.Assert; 

public class AddUser 
{
	private CollegeDatabase db; 
	
	
	@Given("^User enters valid person object\\.$")
	public void user_enters_valid_person_object() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  Assert.assertEquals("test",3,3);
	}

	@And("^The persons name is unique to the database$")
	public void the_persons_name_is_unique_to_the_database() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Yellow Submarine");
	}

	@And("^The the database is not full, or the database is expanded correctly$")
	public void the_the_database_is_not_full_or_the_database_is_expanded_correctly() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Yellow Submarine");
	}

	@When("^User runs main\\(\\)$")
	public void user_runs_main() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Yellow Submarine");
	}

	@Then("^Person objects name field should be searchable useing search function$")
	public void person_objects_name_field_should_be_searchable_useing_search_function() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Yellow Submarine");
	}

}
