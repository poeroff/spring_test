package com.in28minutes.springboot.myfirstwebapp.todo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {
    private TodoServcie todoServcie;

    public TodoController(TodoServcie todoServcie) {
        super();
        this.todoServcie = todoServcie;
    }


    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model) {
        List<Todo> todos = todoServcie.findByUsername("in28minutes");
        model.addAttribute("todos", todos);
        return "listTodos";
    }

}
