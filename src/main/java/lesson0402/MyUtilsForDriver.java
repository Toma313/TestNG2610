package lesson0402;

import config.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class MyUtilsForDriver extends BaseClass {
    public static void takeSnapShot(String name) throws Exception {
//Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
//Call getScreenshotAs method to create image file
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
//Move image file to new destination
        File DestFile = new File("screenShotsFormPage/"+name);
//Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);
    }
}
