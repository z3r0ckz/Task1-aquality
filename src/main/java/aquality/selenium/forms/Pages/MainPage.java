package aquality.selenium.forms.Pages;

import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {

    public MainPage(){
        super(By.xpath("//p[contains(text(),'Hi and welcome to User Inyerface,')]"), "Welcome Text");
    }
    //------------Locators----------------
     private final ILink linkClickHere = getElementFactory().getLink(By.xpath("//a[@class='start__link']"),"Link to next page");



    //-------------Methods ----------------
    public void clickLinkToNextPage(){
        linkClickHere.clickAndWait();
    }

}
