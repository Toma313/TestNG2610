import config.BaseClass;
import data.DataProviderUsers;
import data.User;
import jdk.jfr.Name;
import lesson0402.CourseNames;
import lesson0402.FormPage;
import lesson0402.Massengers;
import lesson0402.MyLisenerForFormConsultation;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

import javax.annotation.processing.Messager;
import java.util.List;
@Listeners(MyLisenerForFormConsultation.class)
public class TestFormConsult extends BaseClass {

    @DataProvider
    public static Object[][] getUsers() {
        List<User> usersList = DataProviderUsers.getUsersList();
        Object[][] obj = new Object[usersList.size()][1];
        for (int i = 0; i < usersList.size(); i++) obj[i][0] = usersList.get(i);
        return obj;
    }

    @BeforeMethod
    public void befor(){
        driver.get("https://dnipro.ithillel.ua/");
        driver.findElement(By.id("btn-consultation-hero")).click();
    }


    @Test(dataProvider = "getUsers", testName = "TestFormDataProvider"
            , description = "Parametrics test form consultation")

        public void testform(User user) throws InterruptedException {
            FormPage formPage = new FormPage(driver);
            formPage.sentForm(user, Massengers.TELEGRAM, CourseNames.FRONTENDBASIC, true);
        System.out.println(user);

        Thread.sleep(1000);
            Assert.assertTrue(formPage.isButtonConfirmEnabled());
        }
}
