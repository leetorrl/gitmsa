package org.example;

import org.example.comporents.AA;
import org.example.conf.MyConf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConf.class);

        Arrays.stream(applicationContext.getBeanDefinitionNames())
                .forEach(System.out::println);

       AA aa1 = applicationContext.getBean(AA.class);
        AA aa2 = applicationContext.getBean(AA.class);

        AA aa3 = new AA();
        AA aa4 = new AA();

        System.out.println("aa1 = "+aa1);
        System.out.println("aa2 = "+aa2);
        System.out.println("aa3 = "+aa3);
        System.out.println("aa4 = "+aa4);

        aa1.setName("스프링통안에 있는 격채");

        System.out.println();
        System.out.println(aa1);
        System.out.println(aa2);
        System.out.println(aa3);
        System.out.println(aa4);

    }
}