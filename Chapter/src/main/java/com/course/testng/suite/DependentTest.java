package com.course.testng.suite;

import org.testng.annotations.Test;

public class DependentTest {

    @Test
    public void test1(){
        System.out.println("test1 run");
        //throw new RuntimeException();   第一个抛出异常，第二个test就不会运行
    }
    /*登录后再买卖*/
    @Test(dependsOnMethods = {"test1"})  //对应上一个test1（）
    public void test2(){
        System.out.println("test2 run");
    }

}

