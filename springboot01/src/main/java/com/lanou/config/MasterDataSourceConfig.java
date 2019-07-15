package com.lanou.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSource;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;


/**
 * @program: springboot01
 * @description:
 * @author: hutingrong
 * @create: 2019-07-14 18:07
 */
@Configuration
@AutoConfigureAfter(MybatisAutoConfiguration.class)
@MapperScan(basePackages = {MasterDataSourceConfig.DAOPACKAGE,MasterDataSourceConfig.MAPPACKAGE},sqlSessionFactoryRef = "masterSqlSessionFactory")
public class MasterDataSourceConfig {
    static final String DAOPACKAGE = "com.lanou.mapper.master";
    static final String MAPPACKAGE = "classpath:mapper/master";
    static final String MAPPER_LOCATION = "classpath:mapper/master/*.xml";

    @Value("${spring.master.datasource.jdbcUrl}")
    private String url;

    @Value("${spring.master.datasource.username}")
    private String user;

    @Value("${spring.master.datasource.password}")
    private String password;

    @Value("${spring.master.datasource.driverClassName}")
    private String driverClassName;

    @Primary
    @Bean(name = "masterDataSource")
    public DataSource masterDataSource() {
        DataSource dataSource = new DataSource();
//        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }
    @Bean(name = "masterTransactionManager")
    @Primary
    public DataSourceTransactionManager masterTransactionManager() {
        return new DataSourceTransactionManager(masterDataSource());
    }

    @Bean(name = "masterSqlSessionFactory")
    @Primary
    public SqlSessionFactory masterSqlSessionFactory(@Qualifier("masterDataSource") DataSource masterDataSource)
            throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        System.err.println("master开始");
        sessionFactory.setDataSource(masterDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(MAPPER_LOCATION));
        return sessionFactory.getObject();
    }

}
