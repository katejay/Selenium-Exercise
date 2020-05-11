		Jenkins
	  For Automation Testing

----------------------------

• Importance of Jenkins
  Most important tool
  Continues integration tool for automation

----------------------------

• Download and Setup Jenkins
	Link -> https://www.jenkins.io/download/
	
	Open CMD and enter the command
	Command -> java -jar jenkins.war -httpPort=8080	//You can change port noif it already in used

	If it showing error like java version not supported then used below command
	Command -> java -jar jenkins.war --enable-future-java

	Once Jenkins is fully up and running then
	Open browser and enter below url in seach box
	Url -> localhoast:8080
	Provide Credentials

----------------------------

• Set System variables to recognize Jenkins  (JENKINS_HOME)

----------------------------

• Global tool configuration setting in Jenkins (Java + Maven Path)
	Mange Jenkins -> Global tool configuration
    For Java
	Click on Jdk Installation and provide name and path of java
    For Maven
	Click on Maven Installation and provide name and path of maven
    Click apply and save

----------------------------

• Understanding Jenkins Workspace
	New Item -> Enter the Project name -> Select FreeStyle Project -> Click on Ok
    Move Project in .jenkins Folder
	Advance -> Use Custom Workspace -> Enter project path in Directory ($(JENKINS_HOME)/Maven)
	Build -> Invoke top-level Maven targets -> Select Meven Version & Enter mvn test run command in Goals field, mvn commands like (test -PSmoke)
    Click apply and save
	Successfully created Maven project in Jenkins
    To run project
	Click on Build Now

----------------------------

• TestNg plugin into Jenkins
	Manage Jenkins -> Manage Plugins -> Search TestNG -> Select TestNG Result -> Click on install without restart
    For TestNg Report
	Open Project -> configure -> Post-build Actions- > Publish TestNG Result	

----------------------------

• Scheduling Project / Test
	Open Project -> configure -> Build Periodically -> Provide 5 parameter (minute, hour, date, month, dayweek ) eg-> 0 6 * * *

----------------------------	
