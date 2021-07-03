package com.example.cases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class DemoTest {
    @Test
    public void demoTest1(){
        System.out.println("这是一个测试用例");
    }
    @Test
    public void demoTest2(){

        System.out.println("这是第二个测试用例");
    }
    @BeforeTest
    public void demoTest3(){
        System.out.println("这是第三个测试用例");
    }
    @AfterTest
    public void AfterTest4(){
        System.out.println("AfterTest测试用例");
    }
}
