package aquality.selenium.forms.Pages;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;


public class SecondGamePage extends Form {
    public SecondGamePage() {
        super(By.xpath("//button[normalize-space()='2']"), "Button 2 Upload Page");
    }

    //---------------------Locators---------------------
   // private final List<ICheckBox> interestCheckBoxes = getElementFactory().findElements(By.xpath(""),"Check boxes",List<ICheckBox>);
}
