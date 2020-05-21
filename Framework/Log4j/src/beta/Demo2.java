package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo2 {

	
	private static Logger log = LogManager.getLogger(Demo2.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("Click on button");
		log.info("Button is displayed");
		log.error("Button is not display");
		log.fatal("Button is missing");
	}

}
