<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
                           http://www.springframework.org/schema/beans/spring-beans.xsd
                           http://www.springframework.org/schema/context
                           http://www.springframework.org/schema/context/spring-context-4.3.xsd
                           http://www.springframework.org/schema/aop
                           http://www.springframework.org/schema/aop/spring-aop-4.3.xsd">
       <context:component-scan base-package="com.atgui.spring.aopxml"></context:component-scan>
       <aop:config>
           <aop:aspect ref="myLogger">
               <aop:pointcut expression="execution(* com.atguigu.spring.aop.*.*(..))" id="cut"/>
               <!--<aop:before method="before" pointcut="execution(* com.atguigu.spring.aop.*.*(..))"/>-->
               <aop:before method="before" pointcut-ref="cut"/>
           </aop:aspect>

       </aop:config>


</beans>
