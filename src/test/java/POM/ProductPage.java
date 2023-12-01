package POM;

import org.openqa.selenium.By;

public class ProductPage {

    private By txt_talleL = By.id("option-label-size-143-item-169");

    private By txt_colorBlue = By.id("option-label-color-93-item-50");

    private By txt_qty = By.id("qty");

    private By btn_addToCart = By.id("product-addtocart-button");

    private By txt_linkToCart = By.cssSelector(".message-success a");
    public By getTxt_talleL() {
        return txt_talleL;
    }

    public By getTxt_colorBlue() {
        return txt_colorBlue;
    }

    public By getTxt_qty() {
        return txt_qty;
    }

    public By getBtn_addToCart() {
        return btn_addToCart;
    }

    public By getTxt_linkToCart(){
        return txt_linkToCart;
    }
}
