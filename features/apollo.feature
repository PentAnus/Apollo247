Feature: Apollo 24/7 application

#Background: Apollo 24/7 app login page
    #Given I am on login page with credentials
    #When Enter the mobile number as "9059088020"
    #And OTP is entered
    #Then Login is successful
Background: On consult page
		Given I am on home page
    When I clicked on consult module
    And Navigated to consult page
@cardDoc   
Scenario: Clicking on cardiology Module
    When Clicked on the cardiology specialist
    Then Heart speacialists details is shown
@cardOn   
Scenario: Opting doctor for online session
    When Clicked on the cardiology specialist
    Then Heart speacialists details is shown
		Given Available doctors are shown
		When The online and offline consulting is given
		And Switch off the checkbox for visit doctor
		And Click on a profile with Trpti Deb
		And Click on digital consult
		Then Appointment schedule is shown
@dermDoc		
Scenario: Clicking on dermotology Module
    When Clicked on the dermotology specialist
    Then skin speacialists details is shown
@dermOn   
Scenario: Opting derm doctor for online session
    When Clicked on the dermotology specialist
    Then skin speacialists details is shown
		Given Available doctors are shown
		When The online and offline consulting is given
		And Switch off the checkbox for visit doctor
		And Click on a profile with Dr. Bhavya Swarnkar
		And Click on digital consult
		Then Appointment schedule is shown
#@entDoc	
#Scenario: Clicking on ENT Module
    #When Clicked on the ENT specialist
    #Then skin speacialists details is shown
#@entOn
#Scenario: Opting ent doctor for online session
    #When Clicked on the ENT specialist
    #Then skin speacialists details is shown
#		Given Available doctors are shown
#		When The online and offline consulting is given
#		And Switch off the checkbox for visit doctor
#		And Click on a profile with Dr. Arijit Das
#		And Click on digital consult
#		Then Appointment schedule is shown
@neg	
Scenario Outline: Doctor NotAvailable
		When clicked on Neurology module
		And doctors list is shown
		And Switch off the checkbox for visit doctor
		And enter the doctor name <name> and enter
		Then it shows doctor not available
		
Examples:
		|name|
		|"xyz"|