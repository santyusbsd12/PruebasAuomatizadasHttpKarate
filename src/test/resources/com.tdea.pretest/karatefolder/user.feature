Feature: userTest

	Scenario: Create User Test
	Given url 'http://localhost:8080/user' 
	And request {username: "admin", password: "1234"}
	When method post
	Then status 200