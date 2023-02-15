import data.WIKILanguage;
import org.testng.annotations.DataProvider;

public class Wikidata {
    @DataProvider
    public  Object[][] getLanguages(){
    return new Object[][]{
            {"en"},
            {"es"},
            {"fr"}
    };
    }
}
