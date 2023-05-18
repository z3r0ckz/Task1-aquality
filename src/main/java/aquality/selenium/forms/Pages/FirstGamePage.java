package aquality.selenium.forms.Pages;
import aquality.selenium.elements.interfaces.*;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class FirstGamePage extends Form {
    public FirstGamePage() {
        super(By.xpath("//button[normalize-space()='1']"), "Button 1 Form Page");
    }


    //-------------Locators----------------------//
    private final ITextBox txbPassword = getElementFactory().getTextBox(By.xpath("//input[@placeholder='Choose Password']"), "Password Text Box");
    private final ITextBox txbEmail = getElementFactory().getTextBox(By.xpath("//input[@placeholder='Your email']"), "Email text box");
    private final ITextBox txbDomain = getElementFactory().getTextBox(By.xpath("//input[@placeholder='Domain']"), "Domain text box");
    private final IComboBox cbxDropDown = getElementFactory().getComboBox(By.xpath("//div[@class='dropdown__field']"),"Dropdown domain List");
    private final ICheckBox chbxTerms = getElementFactory().getCheckBox(By.xpath("//span[@class='icon icon-check checkbox__check']"),"Enable Check Box");
    private final ILink linkNext = getElementFactory().getLink(By.xpath("//a[@class='button--secondary']"),"Link Next Step");
    private final IComboBox cbxItem = getElementFactory().getComboBox(By.xpath("//div[contains(@class, 'dropdown__list-item') and text()='.org']"),".org");
    private final IButton btnHelpBox = getElementFactory().getButton(By.xpath("//button[@class='button button--solid button--blue help-form__send-to-bottom-button']"),"HelpBox");
    private final ILabel lblHelpBox = getElementFactory().getLabel(By.xpath(""),"How can i help? - Label");
    private final ILabel lblTimer = getElementFactory().getLabel(By.xpath("//div[@class='timer timer--white timer--center']"),"Timer");
    private final IButton btnAcceptCookies = getElementFactory().getButton(By.xpath("//button[normalize-space()='Not really, no']"),"Accept cookies button");
    //-------------Methods ----------------
    private void inputTxbPassword(){
        //String email = txbEmail.getText();
        String email = "gmail";
        txbPassword.clearAndType(utils.RandomStrings.generatePassword(email));
    }
    private void inputTxbDomain(){
        txbDomain.clearAndType(utils.RandomStrings.generateDomain());
    }
    private void inputTxbEmail(){
        txbEmail.clearAndType(utils.RandomStrings.generateEmail());
    }
    private void inputCbxDropdown(){
        cbxDropDown.click();
        cbxItem.getJsActions().click();
    }
    public void acceptTermsBox(){
        chbxTerms.check();
    }
    public void clickNextStep(){
        linkNext.click();
    }

    public void fillForm(){
        inputTxbEmail();
        inputTxbDomain();
        inputCbxDropdown();
        inputTxbPassword();
    }

    public boolean hideHelpBox(){
        btnHelpBox.clickAndWait();
        lblHelpBox.state().waitForNotExist();
        return true;
    }


    public void acceptCookies() {
        btnAcceptCookies.clickAndWait();

    }

    public boolean cookiesNotExist(){
        btnAcceptCookies.state().waitForNotExist();
        return true;
    }
    public String validateTimer(){
        return lblTimer.getText();
    }
}