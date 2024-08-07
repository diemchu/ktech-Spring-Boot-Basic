package com.example.demo.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FormController {

    @RequestMapping("send")
    public String getForm(){
        return "form/send.html";
    }
    @RequestMapping("receive")
    public String receiveData(
            @RequestParam("form") String form,
            @RequestParam("message") String message,
            @RequestParam("user-age") int age,
            Model model){
        model.addAttribute("message",message);
        model.addAttribute("form",form);
        model.addAttribute("age",age);
        return "form/receive.html";
    }

    @RequestMapping("save-todo")
    public String saveTodo(){

        return "form/save-todo.html";
    }

    private List<String> todos = new ArrayList<>();
    @PostMapping("get-saved-todos")
    public  String  getSavedTodos(@RequestParam("todo") String todo,
                                  Model model){

        todos.add(todo);
        model.addAttribute("todos",todos);
        model.addAttribute("todo",todo);
        return "form/get-saved-todos.html";
    }

    @RequestMapping("로그인")
    public String  userInfo(){
        return  "form/user-info.html";
    }

    private  List<User> users = new ArrayList<>();
    @PostMapping("read-users-info")
    public  String showInfo(@RequestParam("username") String userName,
                            @RequestParam("userpassword") String password,
                            @RequestParam("userage") String age,
                            Model model){
        users.add(new User(userName,password,age));
        model.addAttribute("userName",userName);
        model.addAttribute("users",users);
        return "form/read-users-info.html";
    }
}
