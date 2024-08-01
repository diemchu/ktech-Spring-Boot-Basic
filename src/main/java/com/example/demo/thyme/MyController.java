package com.example.demo.thyme;

import com.example.demo.temp.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
