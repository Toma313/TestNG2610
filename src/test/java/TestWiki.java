import com.fasterxml.jackson.databind.ser.Serializers;
import config.BaseClass;
import data.WIKILanguage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ResourceBundle;

public class TestWiki extends BaseClass {
    WikiPage wikiPage;
@Test(dataProvider = "getLanguages",dataProviderClass = Wikidata.class)
    public void testWikiLang(String lang){
    ResourceBundle bundle = ResourceBundle.getBundle(lang);
    driver.get("https://"+lang+".wikipedia.org");
    wikiPage = PageFactory.initElements(driver, WikiPage.class);
    Assert.assertEquals(wikiPage.getMenuTab1text(),bundle.getString("menutab1"));



}
}
