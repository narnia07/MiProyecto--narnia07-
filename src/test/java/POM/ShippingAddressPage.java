package POM;

import Driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ShippingAddressPage {
    private By txt_email = By.id("customer-email");

    private By txt_firstName = By.name("firstname");

    private By txt_lastName = By.name("lastname");

    private By txt_company = By.name("company");

    private By txt_address = By.name("street[0]");

    private By txt_city = By.name("city");

    private By txt_state = By.name("region_id");

    private By txt_postalCode = By.name("postcode");


    private By txt_country = By.name("country_id");

    private By txt_telephone = By.name("telephone");

    private By txt_shippingMethod = By.name("ko_unique_1");

    private By btn_next = By.cssSelector(".button > span");

    private By txt_elementosShippingMethod = By.id("checkout-shipping-method-load");

    public By getTxt_email(){
        return txt_email;
    }

    public By getTxt_firstName(){
        return txt_firstName;
    }

    public By getTxt_lastName(){
        return txt_lastName;
    }

    public By getTxt_company(){
        return txt_company;
    }

    public By getTxt_address(){
        return txt_address;
    }

    public By getTxt_city(){
        return txt_city;
    }

    public By getTxt_state(){
        return txt_state;
    }

    public By getTxt_postalCode(){
        return txt_postalCode;
    }

    public By getTxt_country(){
        return txt_country;
    }

    public By getTxt_telephone(){
        return txt_telephone;
    }

    public By getTxt_shippingMethod(){
        return txt_shippingMethod;
    }

    public By getBtn_next(){
        return btn_next;
    }

    public By getTxt_elementosShippingMethod(){
        return txt_elementosShippingMethod;
    }
}
