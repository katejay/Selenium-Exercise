
    -------------Steps-------------


-------------Setup for Hub-------------

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



-------------Setup for Node-------------

*Make sure java is install in Node machine

Download Selenium Server (Grid) jar
Link ->  https://www.selenium.dev/downloads/

Open cmd and register it as Node for Hub
Command ->  C:\Selenium>java -Dwebdriver.chrome.driver="C:\Selenium\chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://192.168.0.100:4444/grid/register -port 5566
		(path>java -dwebdriver.chrome.driver="chromedriverpath" -jar jarfilename.jar -role rolename -hub hubipaddress -port portno)



-------------Code Setup-------------

DesiredCapabilities dc = DesiredCapabilities.chrome();	//Use DesiredCapabilities to set property.
dc.setBrowserName("chrome");				//Set browser name
dc.setPlatform(Platform.WINDOWS);			//Set platform name
		
WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.100:4444/wd/hub"),dc);
driver.get("https://www.google.com");
