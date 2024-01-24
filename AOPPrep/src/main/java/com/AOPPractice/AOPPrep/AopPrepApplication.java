package com.AOPPractice.AOPPrep;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;


@SpringBootApplication
public class AopPrepApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	FilteringTechnique1 filteringTechnique1;
	@Autowired
	FilteringTechnique2 filteringTechnique2;
	public static void main(String[] args) {
		SpringApplication.run(AopPrepApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("{}", filteringTechnique1.contentBasedFiltering());
		logger.info("{}",filteringTechnique2.collaborativeBased());

	}
}
