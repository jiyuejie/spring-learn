package com.spring.test.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {


    @Pointcut("execution(* com.spring.test.service..*.* (..)) ")
    public void pointcut() {
    }

//    @Before("pointcut()")
//    public void before(JoinPoint point) {
//        System.out.println("---------------------------------------");
//        System.out.println("前置通知，方法名" + point.getSignature());
//        System.out.println("前置通知，入参" + point.getArgs().length);
//        System.out.println("---------------------------------------");
//    }
//
//    @After("pointcut()")
//    public void after(JoinPoint point) {
//        System.out.println("---------------------------------------");
//        System.out.println("后置通知" + point.getSignature());
//        System.out.println("---------------------------------------");
//    }
//
//    @AfterReturning(value = "pointcut()" , returning = "value")
//    public void afterReturn(JoinPoint point,Object value) {
//        System.out.println("---------------------------------------");
//        System.out.println("后置返回值通知,方法名" + point.getSignature());
//        System.out.println("后置返回值通知,返回值" + value);
//        System.out.println("---------------------------------------");
//    }
//
//    @AfterThrowing(value = "pointcut()",throwing = "ex")
//    public void afterThrow(JoinPoint point,Exception ex) {
//        System.out.println("---------------------------------------");
//        System.out.println("后置异常通知,方法名" + point.getSignature());
//        System.out.println("后置异常通知,异常" + ex.toString());
//        System.out.println("---------------------------------------");
//    }


    @Around(value = "pointcut()  && @annotation(logger)")
    public void around(ProceedingJoinPoint point,Logger logger) throws Throwable {
        System.out.println(logger.value());
        Object proceed = point.proceed();
    }
}
