package testLog4j;

import org.apache.log4j.Logger;

public class TestCase {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(TestCase.class);
		//���debug��Ϣ
		logger.debug("debug");
		//���info
		logger.info("infor");
		//���warn
		logger.warn("warn");
		//���error
		logger.error("error");
	}

}
