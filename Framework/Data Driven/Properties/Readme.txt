
---------------Data Driven---------------

• Drive the Global Environmental values from external files i.e (data.properties) to test file in java i.e (Test.java).

----------------------------

test.java
	Properties prop = new Properties();			//Properties class used to get data from file which has .properties extensions
	FileInputStream ip = new FileInputStream("C:\\Selenium\\Project\\Selenium-Exercise\\datadriven\\data.properties");	//Locate properties file to read data
	prop.load(ip);						//Load FileInputStream object into Properties class object i.e, prop.
	System.out.println(prop.getProperty("browser"));	//Get properties from file
	System.out.println(prop.getProperty("url"));
		
		
	FileOutputStream op = new FileOutputStream("C:\\Selenium\\Project\\Selenium-Exercise\\datadriven\\data.properties"); //Locate properties file to write data
	prop.store(op, "New comment");				//Store FileOutputStream object into Properties class object i.e, prop.
	prop.setProperty("os", "Windows");			//Set property by key value pair
	System.out.println(prop.getProperty("os"));		//Get properties from file

data.properties
	#New comment
	#Sun May 10 18:53:50 IST 2020
	os=Windows
	browser=Chrome
	url=https\://www.google.com
