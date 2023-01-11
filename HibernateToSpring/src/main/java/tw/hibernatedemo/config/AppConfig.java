package tw.hibernatedemo.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement
public class AppConfig {

	@Bean
	public HikariDataSource datasource() {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:sqlserver://localhost:1433;databaseName=hibernateDB;trustServerCertificate=true");
		config.setUsername("sa");
		config.setPassword("sa123456");
		config.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		config.setMaximumPoolSize(5);
		config.setAutoCommit(false);
		return new HikariDataSource(config);
	}
	
	@Bean
	public HibernateTransactionManager transactonManager() {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory().getObject());
		return txManager;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(datasource());
		sessionFactory.setHibernateProperties(hibernateProperties());
		sessionFactory.setPackagesToScan("tw.hibernatedemo");
		return sessionFactory;
	}
	
	public Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.SQLServer2016Dialect");
		properties.put("hibernate.show_sql", Boolean.TRUE);
		properties.put("hibernate.format_sql", Boolean.TRUE);
		return properties;
	}

}
