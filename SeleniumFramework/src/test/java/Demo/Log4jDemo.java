package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n Hello World ...! \n");

		logger.trace("Das ist eine Spur");
		logger.info("Das ist eine Information");
		logger.error("Das ist eine Fehler");
		logger.warn("Das ist eine Warnung");
		logger.fatal("Das ist ein fataler Fehler");

		System.out.println("\n Completed");

	}

}
