package com.kcdhawan.utri.eco.app.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.datatables.repository.DataTablesRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(repositoryFactoryBeanClass = DataTablesRepositoryFactoryBean.class,basePackages = "com.kcdhawan.utri.eco.app.repositories")
public class DataTablesConfiguration {}
