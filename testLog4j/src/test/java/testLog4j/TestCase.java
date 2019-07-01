package testLog4j;

import org.apache.log4j.Logger;

public class TestCase {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(TestCase.class);
		//输出debug信息
		logger.debug("debug");
		//输出info
		logger.info("infor");
		//输出warn
		logger.warn("warn");
		//输出error
		logger.error("error");
	}

}
