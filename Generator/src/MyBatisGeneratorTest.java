

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

public class MyBatisGeneratorTest {
	public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
		List<String> list = new ArrayList<>();
		boolean b = true;
		File file = new File("mbg.xml");
		ConfigurationParser cp = new ConfigurationParser(list);
		Configuration configuration = cp.parseConfiguration(file);
		DefaultShellCallback dsCallback = new DefaultShellCallback(b);
		MyBatisGenerator mbg = new MyBatisGenerator(configuration, dsCallback, list);
		mbg.generate(null);
	}
}
