Feature: Dress Purchase Functionality

Scenario: #Home Page

Given user Launch The Application URL
Then user Click The Sigin Button

Scenario: #Login Page

When user Enter The MailId #jiya11@gmail.com
Then user Click The Create An Account Button

Scenario: #Personal Info Page

When user Select The Gender Button
When user Enter The First Name
When user Enter The Last Name
When user Enter The Password
When user Select The Date From MultipleDropDown
When user Select The Month From MultipleDropDown
When user Select The Year From MultipleDropDown
When user Enter The Address
When user Enter The City
When user Enter The State
When user Enter The ZipCode
#When user Select The Country From MultipleDropDown
When user Enter The Mobile Phone
When user Enter The MyAddress
Then user Click The Register Button



