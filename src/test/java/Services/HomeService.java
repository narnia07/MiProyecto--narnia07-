package Services;

import Driver.DriverActions;
import POM.HomePage;

public class HomeService {
    private HomePage homePage;

    public String Get_urlHome(){
        return homePage.getUrlHome();
    }
    public HomeService(){
        this.homePage = new HomePage();
    }

    public void clikOntxt_product (){
        DriverActions.click(homePage.getTxt_product());

    }




}
