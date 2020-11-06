package com.spring.test.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:JYJ
 * @DATE : 2020/10/16
 **/
@Controller
public class HelloWorldController {


    @RequestMapping("/hello")
    public String helloWorldHandler(String name) {
        System.out.println(name + ": hello world");
        return "index.jsp";
    }

    public static void main(String[] args) {
        String str = "姬跃杰" ;
        String key = "key";
        byte[] pwd = str.getBytes();
        byte[] b = key.getBytes();

        byte[] bytes = new byte[pwd.length];
        for (int i = 0; i < pwd.length; i++) {
            bytes[i] = (byte) (pwd[i] ^ b[i%b.length]);
        }
        String s = new String(bytes);
        System.out.println(s);

        byte[] bytes1 = new byte[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            bytes1[i] = (byte) (bytes[i] ^ b[i%b.length]);
        }
        System.out.println(new String(bytes1));

    }

}
