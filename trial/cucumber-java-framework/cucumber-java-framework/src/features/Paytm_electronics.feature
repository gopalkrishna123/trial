Feature: Verify the functionality of Paytm landing page and user is able to open all the link present in electonics section.


Scenario: Verify that paytm logo is present in Paytm landing page
Given I am on Paytm Landing page
Then I should verify Paytm Logo of the page

@page2
Scenario: Verify that use is able to open links present in electronics section 
Given I am on Paytm Landing page
When I click on ELECTRONICS link
Then I should verify ELECTRONICS page is opened




