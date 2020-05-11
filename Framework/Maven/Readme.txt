		Maven

----------------------------

• Apache Maven is a software project management and build management tool for Java Frameworks.

----------------------------

• Why Maven?
	Central repository to get dependencies
	Maintaining common structure across the organization
	Flexibility in Integrating with CI tools
	Plugins for Test framework execution.

----------------------------

• Download and Setup Maven
  	Link -> https://maven.apache.org/download.cgi

----------------------------

• Set System variables to recognize Maven

----------------------------

• Check is maven successfully setup
  	command -> mvn --version

----------------------------

• Understanding Maven terminologies
 	GroupId:   GroupId will identify your project uniquely across all projects,
	Artifact:  An artifact is a file, usually a JAR, that gets deployed to a Maven repository.
 	archetype: generate ; Generates a new project from an archetype

----------------------------

• Integrate Maven with Eclipse
	Create new project
	Select Maven project
	Select maven-archetype-quickstart
	Provide Group id, Artifact id, package name.
	Write test cases in (src/test/java) and javafile name must end by Test name, like SeleniumTest.java, AppiumTest.java, etc.

----------------------------

• Understanding POM.xml file dependencies..
	Add dependencies in pom.xml from Maven Repository
	Link -> https://mvnrepository.com/

----------------------------

• How to find the dependencies of the Softwares?
	Search for dependencies which is required
	Link -> https://mvnrepository.com/
	
----------------------------

• Importance of Maven Sure fire plugin
	Maven Sure fire plugin is used to excute all test cases in Maven project
	Add Maven Sure fire plugin in pom.xml file
	Link -> https://maven.apache.org/surefire/maven-surefire-plugin/usage.html

----------------------------

• Running Tests with Surefireplugin
  Clean, Compile, Test commands
	Open CMD and enter the following commands		
	mvn clean   : Clean previous build / project
	mvn compile : Checking syntax error
	mvn test    : Trigger test execution

  If its showing error like
  [ERROR] Source option 5 is no longer supported. Use 7 or later.
  
  then add below 2 lines in properties of pom.xml

  	<properties>
   	  <maven.compiler.source>1.7</maven.compiler.source>
   	  <maven.compiler.target>1.7</maven.compiler.target>
  	</properties>

----------------------------

• Integrating Testng into Maven
	Convert project into TestNG

----------------------------

• Testng xml files configuration in POM file
	Link -> https://maven.apache.org/surefire/maven-surefire-plugin/examples/testng.html
	Copy configuration into build maven-surefire-plugin

----------------------------

• Running selected Tests only with Maven commands
	Link -> https://maven.apache.org/surefire/maven-surefire-plugin/examples/single-test.html
	
	Open CMD and enter the following command
	Command -> mvn -Dtest=LoginTest test		(Where LoginTest is Javafilename)
	(syntax -> mvn -Dtest=Javafilename test)

----------------------------

• Setting up Profiles in POM.xml file
	Build Profiles by profiles tag
	<Profiles>
	  <Profile>
	    <id>
	
	Open CMD and enter the following command
	Command -> mvn test -PSmoke			(Where Smoke is profile id name)
	syntax -> mvn test -Pprofileidname

----------------------------
