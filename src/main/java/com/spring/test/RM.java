package com.spring.test;

import com.spring.test.pojo.Student;
import com.spring.test.service.UserService;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class RM {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("service.xml");

//        GenericApplicationContext genericApplicationContext = new GenericApplicationContext();
//        new XmlBeanDefinitionReader(genericApplicationContext).loadBeanDefinitions("service.xml");
//        genericApplicationContext.refresh();

        UserService project = context.getBean( UserService.class);
        System.out.println("RM测试" + project.update("1"));
        System.out.println("RM测试" + project.getStudent());




    }
}
