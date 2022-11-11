package cn.gao.emergency.page;


import cn.gao.emergency.api.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

// page_url = http://192.168.1.149:8080/wztppt-web/center/newVueComponent?vue-emergency-materialGroupType
public class MaterialTypeManagementPage implements Page {

    JavascriptExecutor js;
    @FindBy(id = "myviewIframe")
    public WebElement myviewiframeIframe;

    @FindBy(css = "#materials > div > div.m-content-container.g-layout > div.el-card.g-left-card.is-always-shadow > div > div.m-action-container > span")
    public WebElement textLabel;

    public WebElement createClassButton;
    @FindBy(css = "#materials > div > div.m-content-container.g-layout > div.el-card.g-left-card.is-always-shadow > div > div.m-action-container > div > input")
    public WebElement searchClassInput;
    @FindBy(css = "#materials > div > div.m-content-container.g-layout > div.el-card.g-left-card.is-always-shadow > div > div.m-action-container > div > div > button")
    public WebElement searchClassButton;
    @FindBy()
    public WebElement popupClassWindow;

    //类型数据集
    @FindBys({
            @FindBy(css = "#materials > div > div.m-content-container.g-layout > div.el-card.g-left-card.is-always-shadow > div > div.m-type-box"),
            @FindBy(css = "#materials > div > div.m-content-container.g-layout > div.el-card.g-left-card.is-always-shadow > div > div.m-type-box > div")})
    public List <WebElement> classDateItem;
    @FindBy(css = "#materials > div > div.m-content-container.g-layout > div.el-card.g-left-card.is-always-shadow > div > div.m-action-container > button")
    public WebElement addTypeButton;

    public WebElement searchTypeInput;

    public WebElement searchTypeButton;

    @FindBy(css = "#materials > div > div.el-dialog__wrapper > div")
    public WebElement popupTypeWindow;

    public List TypeData;

    public WebElement paging;


    public MaterialTypeManagementPage AddType(WebDriver driver,WebElement addTypeButton){
        js.executeScript("arguments[0].click()",addTypeButton);
        PageFactory.initElements(driver, this);
        System.out.println(this.popupTypeWindow.getAttribute("style"));

        return new MaterialTypeManagementPage(driver);
    }

    public MaterialTypeManagementPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor) driver;
        driver.switchTo().frame(myviewiframeIframe);
    }

    public List <WebElement> queryDateSet(String classNameAndTypeName,WebDriver driver) throws InterruptedException {
        this.searchClassInput.sendKeys(classNameAndTypeName);
        js.executeScript("return arguments[0].click()",this.searchClassButton);
        TimeUnit.SECONDS.sleep(3);
        return this.classDateItem;
    }
}