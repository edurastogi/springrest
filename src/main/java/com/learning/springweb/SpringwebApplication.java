package com.learning.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringwebApplication{


    public static void main(String[] args){
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringwebApplication.class, args);

        /*for(String name : applicationContext.getBeanDefinitionNames()){
			System.out.println(name);
		}**/
    }
}
