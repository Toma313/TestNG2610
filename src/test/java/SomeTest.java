package example;

import config.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SomeTest extends BaseClass {

    @BeforeClass
    public void beforeSomeTest(){
        System.out.println("start beforeSomeTest method");
        driver.get("https://ithillel.ua/");
    }
    @BeforeMethod
    public void beforeM(){
        System.out.println("start beforeM");
    }
    @Test(description = "first test on TestNG", groups = {"regression", "@Smoke"})
    public void test() throws Exception {
        System.out.println("TEST NAME TEST1");
        throw new Exception("ERROR");
    }
    @Test(dependsOnMethods = {"test"} )
    public void test1(){
        System.out.println("TEST NAME TEST2 "+driver.getCurrentUrl());
    }

}
