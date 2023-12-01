package POM;

import org.openqa.selenium.By;

public class ShoppingCartPage {



    private By btn_proceedToCheckOut = By.cssSelector(".checkout > span");


    public By clickOnProceedToCheckOut(){
        return btn_proceedToCheckOut;
    }
}
