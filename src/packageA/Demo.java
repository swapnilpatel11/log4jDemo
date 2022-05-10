package packageA;

import org.apache.logging.log4j.*;

public class Demo {

	// Initialized log object LogManager API to call function getLogger
	// class name should be correct
	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {

		log.debug("I am debugging");
		log.info("object is present");
		log.fatal("this is fatal");
		log.error("object is not present");

	}

}
