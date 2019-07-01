package day02;
//读取xml的配置接口
public interface BaseConfig {
	//根据提供的key,获取int类型的value值
	int getIntValue(String key);
	//根据提供的key,获取string类型的value值
	String getStringValue(String key);
}
