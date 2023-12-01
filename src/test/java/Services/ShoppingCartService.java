package Services;

import Driver.DriverActions;
import POM.ProductPage;
import POM.ShoppingCartPage;

public class ShoppingCartService {
    private ShoppingCartPage shoppingCartPage;

    public ShoppingCartService(){
        this.shoppingCartPage = new ShoppingCartPage();


    }

    public void clickOn_btn_proceedToCheckOut(){
        DriverActions.click(shoppingCartPage.clickOnProceedToCheckOut());

    }

}
