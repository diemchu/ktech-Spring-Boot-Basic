package com.example.demo.thyme;

import com.example.demo.temp.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class MyController {
    @RequestMapping("학생정보")
    public String student(Model model){
        model.addAttribute("school","가톨릭관동대학교");
        model.addAttribute("major","SW ");
       model.addAttribute("student",
               new Student("박지훈","jihoon@naver.com"));
        return  "student.html";
    }
    @RequestMapping("students")
    public String textObj(Model model){
       Student alex =new Student("Alex","alex@gmail.com");
       model.addAttribute("student",alex);
        return "text-object.html";
    }
    @RequestMapping("/is-logged-in")
    public String isLoggedIn(Model model){
        model.addAttribute("isLoggedIn",isLoggedIn());
        return  "if-unless.html";
    }

    private boolean isLoggedIn(){
        return (new Random().nextInt() % 2 == 0);
    }

    @RequestMapping("each")
    public String eachNames(Model model){
        List<String> names = List.of("Alex","Brad","Dave","Eric");
        model.addAttribute("names",names);
        List<Student> students = List.of(new Student("brad","brad@gmail.com"),
                new Student("dave","dave@gmail.com"),
                new Student("alex","alex@gmail.com"));
        model.addAttribute("students",students);
        return "each.html";
    }
}
