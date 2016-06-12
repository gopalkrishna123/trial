Feature: Verify the functionality of Paytm landing page and user able to login with appropriate login details



Background:
Given I am on Paytm Landing page


@test1
Scenario: Verify that paytm logo is present in Paytm landing page
Given I am on Paytm Landing page
Then I should verify Paytm Logo of the page

Scenario: Verify that the user is able to open DTH Mode in Paytm Landing page
Given I am on Paytm Landing page
Then I should see DTH link on page
When I click on DTH link on page
Then I should see DTH mode is opened

Scenario: Verify that the user is able to open DataCard Mode in Paytm Landing page
Given I am on Paytm Landing page
Then I should see DataCard link on page
When I click on DataCard link on page
Then I should see DataCard mode is opened

@test1
Scenario: Verify that the user is able open login window 
Given I am on Paytm Landing page
#Then I should see Log in/Sign Up link on page
When I click on Log in/Sign Up link on page
And I enters '7659083721' as username and 'kranthi216' as password on login page

Scenario: Verify user logged in with paytm 
Given user logged in with paytm
When user clicks on 'Login' button
And user enters '7659083721' as username and 'kranthi216' as password on login page
When user clicks submit button on login page
Then should sees the 'Hello Janga' message as a page header

@page1
Scenario: Verify that the user is able to open DataCard in Paytm Landing page
Given I am on Paytm Landing page
Then I should see DataCard link on page
When I click on DataCard link on page


#Scenario: Verify that the user is able to open Send Money to friends in Paytm Landing page
#Given I am on Paytm Landing link on page
#Then I should see Send Money to friends link on page
#When I click on Send Money to friends on page

@page1
Scenario: Verify that the user is able to open Bus Tickets in Paytm Landing page
Given I am on Paytm Landing page
Then I should see Bus Tickets link on page
When I click on Bus Tickets link on page

@page1
Scenario: Verify that the user is able to open Gas in Paytm Landing page
Given I am on Paytm Landing page
Then I should see Gas link on page
When I click on Gas link on page



