package com.example.demo.temp;

import org.springframework.stereotype.Component;

//가장 기본적인 BEAN 객체로 만들어주는
//에노테이션 - Bean 객체로 등록한다
@Component
public class TempComponent {
    public  void sayHello(){
        System.out.println("Hello Spring Boot!!");
    }
}
