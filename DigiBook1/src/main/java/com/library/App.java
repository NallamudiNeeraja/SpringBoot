
package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.library.config.JavaConfig;
import com.library.controller.HomeController;
import com.library.repository.BookCURD;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext container= new AnnotationConfigApplicationContext(JavaConfig.class);
    	BookCURD b=container.getBean(BookCURD.class);
    	b.connection();
    	HomeController hc = container.getBean(HomeController.class);
    	hc.userLogin();
    	
    }
}
