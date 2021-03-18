Feature: Create, Read, Update and Delete a user from the database.
	User should be able to perform basic database inquires. 
	
	Scenario: Add new user to database. 
		Given User enters valid person object.
		And The persons name is unique to the database
		And The the database is not full, or the database is expanded correctly
		When User runs main()
		Then Person objects name field should be searchable useing search function 
