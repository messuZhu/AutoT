package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //这是最基本的的注解，用来吧方法标记成测试的一部分
    @Test
    public void testCase1() {
        System.out.printf("Thread Id:%s%n", Thread.currentThread().getId());
        System.out.println("这是测试用例1"); }
    @Test
    public void testCase2(){
        System.out.printf("Thread Id:%s%n", Thread.currentThread().getId());
        System.out.println("这是测试用例2"); }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod在这个方法前运行的"); }
    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod在这个方法之后运行的"); }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass在这个类之前运行的"); }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass在这个类之前运行的"); }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite在测试套件之前运行的"); }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite在测试套件之后运行的"); }

}
