package Services;

import Driver.DriverActions;
import Driver.DriverManager;
import POM.PaymentPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PaymentService {
    private PaymentPage paymentPage;

    public PaymentService(){
        this.paymentPage = new PaymentPage();

    }

    public void click_btn_placeOrder(){
        DriverActions.isVisible(paymentPage.getTxt_addressDetails());
        DriverActions.click(paymentPage.getBtn_placeOrder());
    }


}
