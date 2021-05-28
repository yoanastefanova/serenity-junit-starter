//package starter.webelements;
//
//import net.thucydides.core.annotations.DefaultUrl;
//import net.thucydides.core.pages.PageObject;
//import org.openqa.selenium.By;
//
//@DefaultUrl("https://start.duckduckgo.com/")
//public class HomePage extends PageObject {
//
//    public static By SEARCH_BAR = By.id("search_form_input_homepage");
//    public static By SEARCH_BUTTON = By.className("search__button");
//
//    public static By SEARCH_RESULT = By.cssSelector(".js-result-title");
//
//
//}


package starter.webelements;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.google.com/")
public class HomePage extends PageObject {

    public static By ACCEPT_TOS_BUTTON = By.cssSelector("button#L2AGLb > div[role='none']");
    public static By SEARCH_BAR = By.cssSelector(".a4bIc > input[role='combobox']");

    public static By SEARCH_RESULT = By.className("yuRUbf");
}
