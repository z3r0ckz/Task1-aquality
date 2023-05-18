package tests.TestCases;

import aquality.selenium.forms.Pages.FirstGamePage;
import aquality.selenium.forms.Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class TestCase1 extends BaseTest {
    @Test(priority = 1)
    public void MainPageLoad(){
        MainPage objMainPage = new MainPage();
        FirstGamePage objFirstGamePage = new FirstGamePage();
        Assert.assertTrue(objMainPage.state().isDisplayed(),"Main page did not load");
        objMainPage.clickLinkToNextPage();
        Assert.assertTrue(objFirstGamePage.state().isDisplayed(),"The Form page did not load");
        objFirstGamePage.fillForm();
        objFirstGamePage.acceptTermsBox();
        objFirstGamePage.clickNextStep();

    }
    @Test
    public void hideHelpBox(){
        MainPage objMainPage = new MainPage();
        FirstGamePage objFirstGamePage = new FirstGamePage();
        Assert.assertTrue(objMainPage.state().isDisplayed(),"Main page did not load");
        objMainPage.clickLinkToNextPage();
        Assert.assertTrue(objFirstGamePage.state().isDisplayed(),"The Form page did not load");
        Assert.assertTrue(objFirstGamePage.hideHelpBox(),"The Help box is Visible");
    }

    @Test
    public void acceptCookies(){
        MainPage objMainPage = new MainPage();
        FirstGamePage objFirstGamePage = new FirstGamePage();
        Assert.assertTrue(objMainPage.state().isDisplayed(),"Main page did not load");
        objMainPage.clickLinkToNextPage();
        Assert.assertTrue(objFirstGamePage.state().isDisplayed(),"The Form page did not load");
        objFirstGamePage.acceptCookies();
        Assert.assertTrue(objFirstGamePage.cookiesNotExist(),"The cookies not accepted");

    }
    @Test
    public void Timer(){
        MainPage objMainPage = new MainPage();
        FirstGamePage objFirstGamePage = new FirstGamePage();
        Assert.assertTrue(objMainPage.state().isDisplayed(),"Main page did not load");
        objMainPage.clickLinkToNextPage();
        Assert.assertTrue(objFirstGamePage.state().isDisplayed(),"The Form page did not load");
        Assert.assertEquals(objFirstGamePage.validateTimer(),"00:00:00","The Timer isn´t 00:00:00");

    }
}
