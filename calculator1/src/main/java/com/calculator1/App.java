package com.calculator1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.calculator1.config.AnnotationConfig;
import com.calculator1.controller.HomeController;

public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext container= new  AnnotationConfigApplicationContext(AnnotationConfig.class);
   HomeController hc= container.getBean(HomeController.class);
   hc.control();
     
    }
}
