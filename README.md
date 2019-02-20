# TestTaskChallenge

Insly Challenge:

I have to completed all the  Tasks mentioned in the Challenge,I have created a partial Automation Framework comprise of (Selenium+JAVA+Page Object Model+TestNG+MAVEN+Extent Report).

Main code is in :src/main/java/insly.TestChallenge/insly.TestChallenge/application/applicationPage.java
Test code is in :src/test/java/insly.TestChallenge/insly.TestChallenge/applicationPageTest.java

Prerequisites – SYSTEM SETUP
Java: v1.8 v)(if not installed use: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

Eclipse

Maven:Apache Maven 3.5.4 , if its not installed please install from "https://maven.apache.org/install.html"

STEPS TO FOLLOW FOR EXECUTION OF CODE:
Clone the code by using below command at your folder destination where you want the code.
https://github.com/manushray/TestTaskChallenge.git

Open the Eclipse follow the below steps:
Click on the "File > Import " Navigate to Maven > Existing Maven Projects & click on "Next". Browse to the location of folder where you have clone the code & click on "Finish" I have created a partial Automation Framework comprise of (Selenium+JAVA+Page Object Model+TestNG+Extent Report) where my "Base" class is Parent of all the classes which is present under package name "insly.TestChallenge.insly.TestChallenge.codeBase" Reading of config.properties , driver , selection of browser type all these activities are done in "Base" Class As I have made my code dynamic from where you can change the parameter and data set/Test Scneario by changing in the config.properties file which is present under package name "/src/main/java/insly/TestChallenge/insly/TestChallenge/properties"

You dont have to do any changes , just run the project as mention below(The full script runs for couple of min so please dont kill the browser if it takes time to identify/load the page.

If you want to re-run the project again & again then please do change the parameter "company_name" & "admin_mail_id" in "config.properties" 

Command Line Command:
go to the project folder and run the below command: 
mvn clean install

Eclipse:
Click on "Project > Run As > Maven test/Maven build....(goal > clean install)/Maven build"

Once Code will run , please refresh the project so that you can view the result either on eclipse console or in

FinalExtentReport.html(this you have to view in Browser)this is for better reporting purpose.
