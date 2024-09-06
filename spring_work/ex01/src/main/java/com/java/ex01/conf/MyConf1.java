package com.java.ex01.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//스프링 객체 담는 통 정의...
@Configuration
//어떤 디렉토리를 읽어서 객채주입
@ComponentScan(basePackages = "com.java.ex01.user")
public class MyConf1 {
}
