package com.cognizant.springlearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {

    public static void main(String[] args) {
        System.out.println("Main method started!");
        displayCountry();
    }

    public static void displayCountry() {
        System.out.println("Loading Spring context...");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        System.out.println("Country: " + country);
    }
}
