package Services;

import Driver.DriverActions;
import POM.ProductPage;

public class ProductService {
    private ProductPage productPage;

    public ProductService(){
        this.productPage = new ProductPage();

    }

    public void clickOn_txt_tallL (){
        DriverActions.click(productPage.getTxt_talleL());
    }

    public void clickOn_txt_colorBlue (){
        DriverActions.click(productPage.getTxt_colorBlue());
    }

    public void sendData_txt_qty (String text){
        DriverActions.insertText(productPage.getTxt_qty(),text);
    }

    public void clickOnAddToCart (){
        DriverActions.click(productPage.getBtn_addToCart());
    }

    public void clickLinkToCart (){
        DriverActions.click(productPage.getTxt_linkToCart());
    }
}
