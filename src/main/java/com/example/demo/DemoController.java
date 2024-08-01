package com.example.demo;


import com.example.demo.temp.Student;
import com.example.demo.temp.TempComponent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// 사용자의 요청을 응답하는 클래스 표시
@Controller
public class DemoController
{
    // home에서 tmpcomponent 쓰려면
    // new 통해서 만드면 그냥 만드는 코드가 되지만
    private TempComponent tempComponent;
    // 생성자를 통해 만들면 전달을 받아
    // Spring의 만든 bean객체가 된다(한번만 만들어진다)
    public DemoController(TempComponent tempComponent){
        this.tempComponent = tempComponent;
    }

    //연결을 시켜준다
    @RequestMapping("home")
    public String home(Model model){
//        tempComponent.sayHello();
        model.addAttribute("message","Hello Thymeleaf");
        model.addAttribute("name","Duc Diem");
        model.addAttribute("age",24);
        return "home.html";
    }

    @RequestMapping("profile")
    public String profile(){
        return  "profile.html";
    }

    @RequestMapping("주소")
    public String address(){
        return "address.html";
    }
}
