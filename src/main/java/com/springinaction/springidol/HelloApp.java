package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Tkachenko on 21.04.2017.
 */
public class HelloApp {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-idol.xml");
        Performer performer = (Performer) ctx.getBean("duke");
        performer.perform();
    }
}
