package cn.gao.emergency.page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"systemLogin\"]/div[3]/div/div[2]/div[1]/div")
    WebElement inputButtonLogin;

    public IndexPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public LoginPage login(){
        inputButtonLogin.click();
        return new LoginPage(driver);
    }


}
