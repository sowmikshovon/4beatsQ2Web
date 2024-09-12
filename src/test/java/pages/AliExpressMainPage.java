package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class AliExpressMainPage extends Form {
    private IElementFactory elementFactory = AqualityServices.getElementFactory();
    private static final String PAGE_NAME = "AliExpress - Affordable Prices on Top Brands with Free Shipping";
    private final By HEADER_TEXT = By.xpath("//*[contains(@class, 'pc-header--logoImg--mDbiT4k')]");
    private final By SEARCH_INPUT_FIELD = By.xpath("//*[contains(@id, 'search-words')]");
    private final By SEARCH_BUTTON = By.xpath("//*[contains(@class, 'search--submit--2VTbd-T')]");

    private ILabel headerText = elementFactory.getLabel(HEADER_TEXT, "Header for AliExpress main page");
    private ITextBox searchInputField = elementFactory.getTextBox(SEARCH_INPUT_FIELD, "Input for Search");
    private IButton searchButton = elementFactory.getButton(SEARCH_BUTTON, "Click for search");


    public AliExpressMainPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, PAGE_NAME)), PAGE_NAME);
    }
    public void searchInput(String SEARCH_INPUT){
        searchInputField.sendKeys(SEARCH_INPUT);
    }
    public void clickSearchButton(){
        searchButton.click();
    }
    public String getHeaderText(){return headerText.getText();}
}
