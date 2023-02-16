import config.BaseClass;
import data.DataProviderUsers;
import data.User;
import lesson0402.MyLisenerForFormConsultation;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners (MyLisenerForFormConsultation.class)
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
    public void test1() throws Exception {
        System.out.println("TEST NAME TEST1");
        // throw new Exception("ERROR");
    }
    @Test(dependsOnMethods = {"test1"}, alwaysRun = true )
    public void test2(){
        System.out.println("TEST NAME TEST2 "+driver.getCurrentUrl());
    }
    @Test(dataProvider= "getUsersList",dataProviderClass = DataProviderUsers.class)
    public void paramTest(String arg, String arg2){
        System.out.println(arg);
        System.out.println(arg2);

    }

}
