package Services;

import Driver.DriverActions;
import Driver.DriverManager;
import POM.ShippingAddressPage;
import org.openqa.selenium.support.ui.Select;

public class ShippingAddressService {

    private ShippingAddressPage shippingAddressPage;

    public ShippingAddressService() {
        shippingAddressPage = new ShippingAddressPage();

    }

    public void sendKeys_txt_email(String email){
        DriverActions.insertText(shippingAddressPage.getTxt_email(),email);
    }

    public void sendKeys_txt_firstName(String firstName){
        DriverActions.insertText(shippingAddressPage.getTxt_firstName(),firstName);
    }

    public void sendKeys_txt_lastName(String lastName){
        DriverActions.insertText(shippingAddressPage.getTxt_lastName(),lastName);
    }

    public void sendKeys_txt_company(String company){
        DriverActions.insertText(shippingAddressPage.getTxt_company(),company);
    }

    public void sendKeys_txt_address(String address){
        DriverActions.insertText(shippingAddressPage.getTxt_address(),address);
    }

    public void sendKeys_txt_city(String city){
        DriverActions.insertText(shippingAddressPage.getTxt_city(),city);
    }

    public void select_txt_country(String option){
        Select select = new Select(DriverManager.getDriver().findElement(shippingAddressPage.getTxt_country()));
        select.selectByValue(option);
    }

    public void sendKeys_txt_state(String state){
        DriverActions.insertText(shippingAddressPage.getTxt_state(),state);
    }

    public void semdKeys_txt_state(String telephone){
        DriverActions.insertText(shippingAddressPage.getTxt_telephone(),telephone);
    }

    public void sendKeys_txt_postalCode(String postalCode){
        DriverActions.insertText(shippingAddressPage.getTxt_postalCode(),postalCode);
    }

    public void click_txt_shippingMethod(){
        DriverActions.click(shippingAddressPage.getTxt_shippingMethod());
    }

    public void click_btn_next(){
        DriverActions.click(shippingAddressPage.getBtn_next());
    }
}
