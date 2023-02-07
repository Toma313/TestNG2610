package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WikiPage {
    @FindBy(id = "ca-view")
    WebElement menutab1;
    @FindBy(id="ca-edit")
    WebElement menutab2;
    @FindBy(id="ca-history")
    WebElement menutab3;
    public String getMenuTab1text(){
        return menutab1.getText();
    }
    public String getMenuTab2text(){
        return menutab2.getText();
    }
    public String getMenuTab3text(){
        return menutab3.getText();
    }
}
