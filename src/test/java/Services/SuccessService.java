package Services;

import Driver.DriverActions;
import POM.PaymentPage;
import POM.SuccessPage;

public class SuccessService {

    private SuccessPage successPage;

    public SuccessService() {
        successPage = new SuccessPage();
    }


    public String get_txt_title(){
        return DriverActions.getText(successPage.getTxt_title());
    }

    public Boolean getBtn_createAnAccountVisible(){
        return DriverActions.isVisible(successPage.getBtn_createAnAccount());
    }


    public boolean getBtn_continueShoppingEnable(){
        return DriverActions.isEnabled((successPage.getBtn_continueShopping()));
    }

    public CharSequence getTxt_orderNumber(){
        return (CharSequence) DriverActions.getText(successPage.getTxt_orderNumber());
    }



}

