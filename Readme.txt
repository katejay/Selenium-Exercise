					Selenium-Exercise


------------Basics of Selenium------------

 If you want to create robust, browser-based regression automation suites and tests,
scale and distribute scripts across many environments, then you want to use Selenium WebDriver,
a collection of language specific bindings to drive a browser - the way it is meant to be driven.

Get Started
	• Initialize
	• Title
	• Methods
	• Locators
	• XpathAndCSS	(Advanced)

Web Element
	• StaticDropdown
	• UpdatedStaticDropdown
	• DynamicDropdown
	• AutosuggestiveDropdown
	• Checkbox
	• CheckboxAssignment
	• RadioButton
	• CurrentDate
	• EndToEnd
	• HandlingAlertPopup
	• Assignment2
	• Calendar
	• Calendar1
	• AutosuggestiveDropdownAdvance		(Using getAttribute method)
	• AutosuggestiveDropdownAdvance1	(Using JavascriptExecutor)
	• Assignment8

Functional Testing
	• ListElement
	• ArrayList
	• ArrayList1
	• ArrayList2

Synchronization
	• ImplicitWait
	• ExplicitWait
	• FluentWait
	• Assignment3

Actions
	• MouseInteractions
	• KeyboardInteractions

Window (Window/tab Swtich)
	• WindowMethod
	• WindowSwitch
	• Assignment4

Frame
	• Frame
	• DragAndDrop 				(Used with Action Class)
	• Assignment5

Exercise
	• ScopeLimiting
	• ChildWindowTitle 			(Get title of all child window)
	• Assignment6

Table
	• Table
	• Table1
	• Assignment7
	• AscendingList		SortTable	(Using Array list & Collection Framework)
	• DescendingList	SortTable	(Using Array list & Collection Framework)	

Miscellaneous
	• HandlingCookie
	• HandlingSSLCertification 		HTTP/HTTPS (DesiredCapabilities + ChromeOptions)
	• TakesScreenshot			getScreenshotAs(OutputType.FILE);



------------Grid------------

 If you want to scale by distributing and running tests on several machines and manage multiple environments 
from a central point, making it easy to run the tests against a vast combination of browsers/OS, 
then you want to use Selenium Grid.	

Steps

	• Setup for Hub

	Download Selenium Server (Grid) jar
	Link ->  https://www.selenium.dev/downloads/

	Open cmd and start the Hub
	Command ->  C:\Selenium>java -jar selenium-server-standalone-3.141.59.jar -role hub
			(path>java -jar jarfilename.jar -role rolename)

	Get ip address of Hub so Nodes can register with Hub

	Open Browser and enter in search box
	Enter ->  ipaddress/grid/console
	e.g   -> (http://192.168.0.100:4444/grid/console)
	to check configuration


	• Setup for Node

	*Make sure java is install in Node machine

	Download Selenium Server (Grid) jar
	Link ->  https://www.selenium.dev/downloads/

	Open cmd and register it as Node for Hub
	Command ->  C:\Selenium>java -Dwebdriver.chrome.driver="C:\Selenium\chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://192.168.0.100:4444/grid/register -port 5566
			(path>java -dwebdriver.chrome.driver="chromedriverpath" -jar jarfilename.jar -role rolename -hub hubipaddress -port portno)


	• Code Setup

	DesiredCapabilities dc = DesiredCapabilities.chrome();	//Use DesiredCapabilities to set property.
	dc.setBrowserName("chrome");				//Set browser name
	dc.setPlatform(Platform.WINDOWS);			//Set platform name
			
	WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.100:4444/wd/hub"),dc);
	driver.get("https://www.google.com");



------------Framework------------

 Selenium Framework is a code structure that helps to make code maintenance easy.
Without frameworks, we will place the “code” as well as “data” in the same place which is neither re-usable nor readable. 
Using Frameworks, produce beneficial outcomes like increased code re-usage, higher portability, reduced script maintenance cost, higher code readability, etc.

	• TestNG
		Importance of TestNG
			Run multiple test cases
			The order of execution of different tests. User can put all the tests together in one testng.xml file 
			or can create separate testng.xml files for different based on the requirement.
	
	• Maven - Build Management Tool
		Apache Maven is a software project management and build management tool for Java Frameworks.
		Why Maven?
			Central repository to get dependencies
			Maintaining common structure across the organization
			Flexibility in Integrating with CI tools
			Plugins for Test framework execution

	• Ant - Build Management Tool
		Apache Ant is a software project management and build management tool for Java Frameworks.
		Why Ant?
			Ant creates the application life cycle i.e. clean, compile, set dependency, execute, report, etc.
			Third party API dependency can be set by Ant i.e. other Jar file's class path is set by Ant build file.
			A complete application is created for End to End delivery and deployment.
			It is a simple build tool where all configurations can be done using XML file and which can be executed from the command line.
			It makes your code clean as configuration is separate from actual application logic.

	• Data Driven	
		Drive the Global Environmental values from external files i.e (data.properties) to test file in java i.e (Test.java).
			Properties
			Excel

	• Extent Report
		Extent Report used to create report for test cases.
		ExtentSparkReporter & ExtentReports are most important class in Extent Report
		ExtentSparkReporter : Used to customize the report file	
		ExtentReports 	    : Used to create report file
		
	• Log4j	
		Log4j is a fast, flexible and reliable logging framework (APIS) written in Java.
		Why Log4j
			It is an open source.
			With Log4j, it is possible to store the flow details of our Selenium Automation in a file or database.
			Log4j is used for large as well as small projects

	• Jenkins - Continues Integration Tool (CI)
		Importance of Jenkins
			Most important tool
			Continues integration tool for automation

	• PageObjectModel
		Page Object Model is a design pattern, popularly used in test automation 
		that creates Object Repository for web UI elements. 
		The advantage of the model is that it reduces code duplication and improves test maintenance.
		
		With Page Factory						Without Page Factory
		By()									@FindBy()
		No package import needed				import package : PageFactory
		
	• Cucumber - Behavior Driven Development (BDD)
		It explains the behavior of the application in a simple English text using Gherkin language.
			Feature file (.feature)			[Scenario, Given, When, Then, And]
			Step Definition file (.java)	[Methods]
			Test Runner file (.java)		[CucumberOptions (features, glue)]
	
	• Xslt	



------------Database------------

 Selenium Webdriver is limited to Testing your applications using Browser.
To use Selenium Webdriver for Database Verification you need to use the JDBC ("Java Database Connectivity").
JDBC (Java Database Connectivity) is a SQL level API that allows you to execute SQL statements. 
It is responsible for the connectivity between the Java Programming language and a wide range of databases. 



------------EndToEnd------------

	EndToEndProject
	• EndToEnd + Ant
	• EndToEnd + Cucumber	
	• EndToEnd + Maven



------------Sauce Labs------------

 Sauce Labs allows users to run their test cases in the cloud for different browsers, operating systems and device combinations. 
	
	• Imp Links : 
	https://wiki.saucelabs.com/display/DOCS/Platform+Configurator#/
	https://wiki.saucelabs.com/display/DOCS/Getting+Started+with+Selenium+for+Automated+Website+Testing



------------AutoIt------------

 AutoIt is a freeware scripting language designed for automating windows GUI and general scripting.
It uses a combination of mouse movement, keystrokes and window control manipulation to automate a task which is not possible by selenium webdriver.

	• Imp Links :
	https://www.autoitscript.com/site/autoit/downloads/


