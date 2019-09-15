# SeleniumAutomation
Testing automated website using selenium webdriver

In order to have the test environment configured properly, you should take in consideration the systems requirements and install the followings drivers:

- Enable the latest java JDK version on your PC, set the environment variables accordingly.
    To set JAVA_HOME variable:
    1- Locate your Java installation directory.
    2- Right click My Computer and select Properties -> Advanced.
    3- Go to Control Panel -> System -> Advanced System Settings.
    4- Search for Environment Variables then select Edit the system environment variables.
    5- Click the Environment Variables button.
    6- Under System Variables, click New.
    7. In the Variable Name field, enter JAVA_HOME, in the Variable Value field, enter your JDK installation path.
    8- Click OK and Apply Changes as prompted.
- Download Eclipse or any other IDE of your preference.   
- Install Apache Maven and set the environment variables path MAVEN_HOME as mentioned above. Apache Maven is a dependency management         system that allows to distribute the libreries easier and customizabled plugin creation, hence you do not need to add manually any java   far files into build path.  
  Dependencies and plugins to be added into the maven project:
    - TestNG
    - Selenium
    - Maven compiler plugin
    - Maven surefire plugin
 
 - Create a Maven Project to run the test
   Click on file -> over New -> click on Project -> extend Maven folder and select Maven Project -> Select create a simple project -> Next
   Fill the Group Id and Artfact Id fields, and add a project name -> Finish
   
   On the src/main/resources -> add the browser drivers that you need to automate the website.
   On the src/test/java -> you will keep the test files
   
  - To run tests, you need to extend the path src/test/java, and click right over the class test created -> select Run as -> Run               configurations -> double click on Maven Build -> add a name -> select base directory from workspace -> enter clean test -> Apply ->       Run to start a test.
  

