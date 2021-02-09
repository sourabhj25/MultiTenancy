package com.example.demo;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.master.MasterService;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "com.example.demo")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.example.demo")
public class MultiTenancyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiTenancyApplication.class, args);
	}

	
	@Bean
    public DataSource dataSource(){
        CustomRoutingDataSource customDataSource=new CustomRoutingDataSource();
        customDataSource.setTargetDataSources(MasterService.getDataSourceHashMap());
        return customDataSource;
    }
}
