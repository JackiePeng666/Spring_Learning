package com.atgui.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect//标注当前类为切面
public class MyloggerAspect {
    /*
    * @将方法指定为前置通知
    * 必须设置value,其值为切入点表达式
    * */
    @Before(value = "execution(public int com.atgui.spring.aop.MathImpl.add(int,int))")
    public void beforeMethod(){
        System.out.println("方法执行之前");
    }

}
