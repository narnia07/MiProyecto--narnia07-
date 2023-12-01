package POM;

import org.openqa.selenium.By;

public class PaymentPage {

    private By btn_placeOrder = By.cssSelector(".primary .checkout");

    private By txt_addressDetails = By.cssSelector(".billing-address-details");


    public By getBtn_placeOrder() {
        return btn_placeOrder;

    }

    public By getTxt_addressDetails(){
        return txt_addressDetails;
    }
}
