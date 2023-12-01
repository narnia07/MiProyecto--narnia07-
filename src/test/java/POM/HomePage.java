package POM;

import org.openqa.selenium.By;

public class HomePage {

        private String urlHome = "https://magento.softwaretestingboard.com/";

        private By txt_product = By.xpath("//img[@alt= 'Radiant Tee']");

        public By getTxt_product(){
                return txt_product;
        }

        public String getUrlHome(){
                return urlHome;
        }



}
