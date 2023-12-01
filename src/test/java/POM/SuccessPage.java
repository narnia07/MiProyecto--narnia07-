package POM;

import org.openqa.selenium.By;

public class SuccessPage {

    private By txt_title = By.xpath("//h1/span");

    private By btn_continueShopping = By.cssSelector(".continue");

    private By btn_createAnAccount = By.cssSelector("#registration");

    private By txt_orderNumber = By.cssSelector(".checkout-success p span");


    public By getTxt_title() {
        return txt_title;
    }

    public By getBtn_continueShopping() {
        return btn_continueShopping;
    }

    public By getBtn_createAnAccount() {
        return btn_createAnAccount;
    }

    public By getTxt_orderNumber() {
        return txt_orderNumber;
    }



}
