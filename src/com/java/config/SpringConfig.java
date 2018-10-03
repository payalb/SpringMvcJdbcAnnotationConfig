package com.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.java")
public class SpringConfig {

	/*By-default also it is BaneNameUrlHandlerMapping*/
/*	@Bean
	@Scope("singleton")
	public BeanNameUrlHandlerMapping getHandlerMapping() {
		return new BeanNameUrlHandlerMapping();
	}*/
	
	/*@Bean(name= {"/addStudent","/updateStudent"})
	public StudentController getStudentController() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return new StudentController(getService());
	}
*//*
	@Bean(value="service")
	public StudentService getService() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return new StudentServiceImpl(getRepository());
	}*/
/*
	@Bean("repository")
	public StudentRepository getRepository() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<StudentRepositoryImplOne> obj=StudentRepositoryImplOne.class;
		Constructor<StudentRepositoryImplOne> cons=obj.getDeclaredConstructor();
		cons.setAccessible(true);
		return  cons.newInstance();
	//	return new StudentRepositoryImplOne(getUtil());
	}*/

	/*@Bean("util")
	public DatabaseUtil getUtil() {
		DatabaseUtil util= new DatabaseUtil();
		return util;
	}
	*/
	
	@Bean
	public PropertySourcesPlaceholderConfigurer getConfigurer() {
		PropertySourcesPlaceholderConfigurer cfg= new PropertySourcesPlaceholderConfigurer();
		cfg.setLocation(new ClassPathResource("database.properties"));
		return cfg;
	}
	
	@Bean
	public ViewResolver getResolver() {
		return new InternalResourceViewResolver("/WEB-INF/views/",".jsp");
	}
	
	/*@Bean
	@Scope("prototype")
	public ConnectionUtil getConnection() throws DatabaseException {
		ConnectionUtil util= new ConnectionUtil();
		return util;
	}*/
}
