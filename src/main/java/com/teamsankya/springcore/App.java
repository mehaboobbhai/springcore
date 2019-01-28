package com.teamsankya.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {

    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
    
         Car car=  applicationContext.getBean(Car.class);
//         System.out.println("mehaboob have " + car.getcName()  + " car");
//       car.getCarName();
         System.out.println(car);
         System.out.println("second commit is done.........");
         System.out.println(car.getTyres());
    }
}
