import Driver.DriverManager;
import POM.HomePage;
import POM.ShippingAddressPage;
import Services.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.apache.commons.lang3.StringUtils.isNumeric;


public class Pruebas {
    HomeService homeService = new HomeService();
    ProductService productService = new ProductService();

    ShoppingCartService shoppingCartService = new ShoppingCartService();

    ShippingAddressService shippingAddressService = new ShippingAddressService();

    PaymentService paymentService= new PaymentService();

    SuccessService successService = new SuccessService();

    @BeforeMethod
    public void setup(){
        DriverManager.create("chrome");


    }

    @Test
    public void pruebaCompra(){
        DriverManager.goSite(homeService.Get_urlHome());
        homeService.clikOntxt_product();
        productService.clickOn_txt_tallL();
        productService.clickOn_txt_colorBlue();
        productService.sendData_txt_qty("2");
        productService.clickOnAddToCart();
        productService.clickLinkToCart();
        shoppingCartService.clickOn_btn_proceedToCheckOut();
        shippingAddressService.sendKeys_txt_email("prueba@email.com");
        shippingAddressService.sendKeys_txt_firstName("Nerina");
        shippingAddressService.sendKeys_txt_lastName("Raga");
        shippingAddressService.sendKeys_txt_company("Empresa");
        shippingAddressService.sendKeys_txt_address("Calle");
        shippingAddressService.sendKeys_txt_city("Concordia");
        shippingAddressService.select_txt_country("AR");
        shippingAddressService.semdKeys_txt_state("Entre Ríos");
        shippingAddressService.sendKeys_txt_postalCode("3200");
        shippingAddressService.click_txt_shippingMethod();
        shippingAddressService.click_btn_next();
        paymentService.click_btn_placeOrder();
        successService.getBtn_createAnAccountVisible();
        Assert.assertEquals(successService.get_txt_title(),"Thank you for your purchase!", "El texto no es el esperado");
        Assert.assertTrue(successService.getBtn_continueShoppingEnable());
        Assert.assertTrue(successService.getBtn_createAnAccountVisible());
        Assert.assertTrue(isNumeric(successService.getTxt_orderNumber()));



    }

}
