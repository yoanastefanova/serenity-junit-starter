//package starter.steps;
//
//import net.serenitybdd.core.pages.PageObject;
//import net.serenitybdd.core.pages.WebElementFacade;
//import net.thucydides.core.annotations.Step;
//import starter.basicsearch.Search;
//import starter.webelements.HomePage;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import static starter.webelements.HomePage.*;
//
//public class SearchSteps extends PageObject {
//
//    HomePage homePage;
//
//    @Step("Navigate to duckduckgo Home page")
//    public void navigateToHomePage() {
//        homePage.open();
//    }
//
//    @Step("Enter search criteria")
//    public void enterSearchCriteria(String searchCriteria){
//        $(SEARCH_BAR).clear();
//        $(SEARCH_BAR).sendKeys(searchCriteria);
//    }
//
//    @Step("Click on Search button")
//    public void clickSearchButton(){
//        $(SEARCH_BUTTON).click();
//    }
//
//    @Step("Got Result list")
//    public List<String> getResultList(){
//        homePage.waitForRenderedElements(SEARCH_RESULT);
//        return homePage.findAll(SEARCH_RESULT)
//                .stream()
//                .map(WebElementFacade::getTextContent)
//                .map(String::toLowerCase)
//                .collect(Collectors.toList());
//
//    }
//}


package starter.steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import starter.webelements.HomePage;

import java.util.List;
import java.util.stream.Collectors;

import static starter.webelements.HomePage.*;

public class SearchSteps extends PageObject {

    HomePage homePage;

    @Step("Navigate to Google Home page")
    public void navigateToHomePage() {
        homePage.open();
    }

    @Step("Accept pop up window")
    public void acceptTOS(){
        $(ACCEPT_TOS_BUTTON).click();
    }

    @Step("Enter Search criteria")
    public void enterSearchCriteria(String searchCriteria){
        $(SEARCH_BAR).clear();
        $(SEARCH_BAR).typeAndEnter(searchCriteria);
    }

    @Step("Get Result list")
    public List<String> getResultList(){
        homePage.waitForRenderedElements(SEARCH_RESULT);
        return findAll(SEARCH_RESULT)
                .stream()
                .map(WebElementFacade::getTextContent)
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }
}

