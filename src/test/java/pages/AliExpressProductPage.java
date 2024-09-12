package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.forms.Form;
import aquality.selenium.elements.interfaces.*;
import org.openqa.selenium.By;

public class AliExpressProductPage extends Form {
    private IElementFactory elementFactory = AqualityServices.getElementFactory();
    private static final String PAGE_VERIFICATION = "Sort by";
    //private final By HEADER_TEXT = By.xpath("//*[contains(@class, 'pc-header--logoImg--mDbiT4k')]");
    private final By FIRST_PRODUCT = By.xpath("//*[@id=\"card-list\"]/div[1]/div/div/a/div[2]/div[1]/h3");


    //private ILabel headerText = elementFactory.getLabel(HEADER_TEXT, "Header for AliExpress main page");
    private ILabel firstProduct = elementFactory.getLabel(FIRST_PRODUCT, "First product on the page");


    public AliExpressProductPage() {
        super(By.xpath(String.format(LocatorConstants.PARTICULAR_TEXT_XPATH, PAGE_VERIFICATION)), PAGE_VERIFICATION);
    }
    public String getFirstProductText(){
        return firstProduct.getText();
    }

}
