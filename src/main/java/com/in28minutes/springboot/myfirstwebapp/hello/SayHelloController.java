package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHelloController {
    @RequestMapping("say-hello")
    @ResponseBody
    public  String SayHello(){
        return "Hello World";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public  String SayHelloHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>Hello World</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>Hello World</h1>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }


    //sayHello.jsp
    @RequestMapping("say-hello-jsp")

    public  String SayHelloJsp(){
        return "sayHello";
    }




}
