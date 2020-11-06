package com.spring.test.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:JYJ
 * @DATE : 2020/10/16
 **/
@Controller
public class ParamTestController {


    @RequestMapping("/param1")
    public String param1(String name) {
        System.out.println(name);
        return "index.jsp";
    }

    @RequestMapping("/param2")
    public String param2(String name) {
        System.out.println(name);
        return "index.jsp";
    }

    @RequestMapping("/param3")
    public String param3(String name) {
        System.out.println(name);
        return "index.jsp";
    }


    @RequestMapping("/param4")
    public String param4(String name) {
        System.out.println(name);
        return "index.jsp";
    }


    @RequestMapping("/param5")
    public String param5(String name) {
        System.out.println(name);
        return "index.jsp";
    }



    @RequestMapping("/param6")
    public String param6(String name) {
        System.out.println(name);
        return "index.jsp";
    }

}
