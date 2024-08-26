package com.in28minutes.springboot.myfirstwebapp.login;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")
public class LoginController {
    private  AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    //    private Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping(value="login", method = RequestMethod.GET)
    public  String gotoLoginPage(){
        return "login";

    }

    @RequestMapping("HELLO")
    @ResponseBody
    public String HELLO(){
        return "안녕하세요 저의 이름은 최태영입니다";
    }
    @RequestMapping(value="login", method = RequestMethod.POST)
    public  String gotoWelcompage(@RequestParam String name, @RequestParam String password, ModelMap model){
        if(authenticationService.authenticate(name, password)){
            model.put("name", name);
            model.put("password", password);
            return "welcom";
        }
        model.put("errorMessage", "Invalid username or password");
        return "login";

    }
}
