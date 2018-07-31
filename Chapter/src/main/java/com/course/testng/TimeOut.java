package com.course.testng;
import org.testng.annotations.Test;
//超时测试
public class TimeOut{
    @Test(timeOut = 3000)//单位为毫秒
    public void testSucess() throws  InterruptedException{
        Thread.sleep(2000);
    }
    @Test(timeOut = 2000)//单位为毫秒
    public void testfailed() throws  InterruptedException{
        Thread.sleep(23000);//实际等待时间超过设定时间2000
    }
}

