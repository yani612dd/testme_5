Feature: TestMeApp Scenario

Scenario: Test Registration with valid test data

Given user launches browser And navigates to application url
When user enter SignIn And clicks on Register Here
When user enters username as "Yani19988" in username field
When user enters firstname as "Priyanka" in firstname field
When user enters lastname as "Kumar" in lastname field
When user enters Password as "riya123" in password field
When user enters confirm password as "riya123" in confirm password field
When user enters gender as "female" in gender field
When user enters email as "riya123@gmail.com" in email field
When user enters mobile number as "7885612347" in mobile number
When user enters DOB as "12/07/1997" in DOB
When user enters address as "pune, kothrud, 38" in address
When user enters security question as "What is your favor color" in security question
When user enters answer as "yellow" in answer
And clicks Register
Then validates Registration success