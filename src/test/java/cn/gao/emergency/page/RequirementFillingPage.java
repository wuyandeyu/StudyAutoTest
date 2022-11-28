package cn.gao.emergency.page;

import cn.gao.emergency.api.Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequirementFillingPage implements Page {

    public JavascriptExecutor js;
    @FindBy(id = "myviewIframe")
    public WebElement myviewiframeIframe;
    @FindBy(css ="#materials > div > div.el-card.m-content-container.is-always-shadow > div > div.m-actions > div:nth-child(1) > button:nth-child(1) > span")
    public WebElement addButton;
    WebDriver driver;
    public RequirementFillingPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        js = (JavascriptExecutor) driver;
        driver.switchTo().frame(myviewiframeIframe);
    }
}
