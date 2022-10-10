import Pages.GoogleMainPage;
import com.codeborne.selenide.Selenide;
import com.google.j2objc.annotations.Property;
import org.junit.Test;

public class AppleTest extends BaseTest {
    private static final String GOOOGLE_MAIN= "https://www.google.com/";



    @Test
    public void checkHref() {
        //GoogleMainPage googleMainPage = new GoogleMainPage();
        Selenide.open(GOOOGLE_MAIN);






    }


}
