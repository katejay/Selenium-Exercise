
    	TestNG

----------------------------

• Importance of TestNG
  Run multiple test cases
  The order of execution of different tests. User can put all the tests together in one testng.xml file 
  or can create separate testng.xml files for different based on the requirement.

----------------------------

• Installation and configuration of TestNG in Eclipse
  Link -> https://testng.org/doc/eclipse.html

----------------------------

• TestNG XML Structure
  <Suite>
    <Test>
      <Package>
        <class>
          <Method>

----------------------------

• Include-Exclude Mechanism

----------------------------

• Regular Expression
  partial-methodname.*

----------------------------

• TestNG Annotations
  @BeforeSuite	: Run before suite
  @AfterSuite	: Run after suite

  @BeforeTest	: Run before test
  @AfterTest	: Run after test

  @BeforeClass	: Run before class file (Test suite file)
  @AfterClass	: Run after class file 

  @BeforeMethod	: Run before every method present in class file
  @AfterMethod	: Run after every method present in class file

----------------------------

• Groups
  .java (Test Suites file)
	@Test(groups={"group-name"})	

  .xml (TestNG xml file)
	<groups>
  	   <run>
     	      <include name = "group-name"/>
  	   </run>
	</groups>

----------------------------

• Annotation Helper Attributes
  @Test(enabled=false)
  @Test(dependsOnMethods = {"method-name"})
  @Test(timeOut=2000)

----------------------------

• Parameterization in TestNG
  .xml
	<parameter name="url" value="valueforurl"/>
  
  .java
	@Parameters({"url"})

----------------------------

• Data Provider Annotation
  .java
	@DataProvider
	public Object[][] getData(){}

	@Test(dataProvider="getData")

----------------------------

• TestNG Listeners	
 .xml
	<listeners> 
 	       <listener class-name="test.Listeners"/>
	</listeners>

 .java
	public class Listeners implements ITestListener{}

----------------------------

• Running Test in parallel with TestNG ()
  .xml
	<suite name="Suite" parallel="tests" thread-count="3">

----------------------------
