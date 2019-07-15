package com.lanou.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
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
@MapperScan(basePackages = {ClusterDataSourceConfig.DAOPACKAGE,ClusterDataSourceConfig.MAPPACKAGE},sqlSessionFactoryRef = "clusterSqlSessionFactory")
public class ClusterDataSourceConfig {
    static final String DAOPACKAGE = "com.lanou.mapper.cluster";
    static final String MAPPACKAGE = "classpath:mapper/cluster";
    static final String MAPPER_LOCATION = "classpath:mapper/cluster/*.xml";

    @Value("${spring.cluster.datasource.jdbcUrl}")
    private String url;

    @Value("${spring.cluster.datasource.username}")
    private String user;

    @Value("${spring.cluster.datasource.password}")
    private String password;

    @Value("${spring.cluster.datasource.driverClassName}")
    private String driverClassName;

    @Primary
    @Bean(name = "clusterDataSource")
    public DataSource clusterDataSource() {

        DataSource dataSource = new DataSource();
//        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }
    @Bean(name = "clusterTransactionManager")
    public DataSourceTransactionManager clusterTransactionManager() {
        return new DataSourceTransactionManager(clusterDataSource());
    }

    @Bean(name = "clusterSqlSessionFactory")
    public SqlSessionFactory clusterSqlSessionFactory(@Qualifier("clusterDataSource") DataSource clusterDataSource)
            throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        System.err.println("cluster开始");
        sessionFactory.setDataSource(clusterDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(MAPPER_LOCATION));
        return sessionFactory.getObject();
    }

}
