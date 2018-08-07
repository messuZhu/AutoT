package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testProvider(String name,int age) {
        System.out.println("name="+name+";  age="+age); }
    //数据来源，dataprovider对象参数传递方法
    //name=data同上面的name=data,通过DataProvider()把object参数传进去,
    @DataProvider(name="data")
    public Object[][] providerData(){
        //定义了参数
        Object[][] n = new Object[][]{
                {"zhangsan", 20},
                {"zhangsi", 25},
                {"zhangwu", 30},};
        return n;
    };
//怎么去测试呢？
    @Test(dataProvider ="methodData")
    public void test1(String name,int age){System.out.println("test1方法 name="+name+";  age"+age); }
    @Test(dataProvider ="methodData")
    public void test2(String name,int age){System.out.println("test2方法 name="+name+";  age"+age); }

    @DataProvider(name = "methodData")//Method可以自动把方法名test1、test2传进来
    public  Object[][] methodDataTest(Method method){
        Object[][] result = null;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan",25},
                    {"zhangsi", 30},
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"zhangwu", 40},
                    {"zhangliu", 50},
            };
        }
        return result;
    }
}
