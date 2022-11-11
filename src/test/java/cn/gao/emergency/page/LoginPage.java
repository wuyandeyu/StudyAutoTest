package cn.gao.emergency.page;




import cn.gao.emergency.entity.User;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"loginForm\"]/button[2]")
    WebElement inputButtonLogin ;
    @FindBy(xpath = "//*[@id=\"username\"]")
    WebElement inputUserName ;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement inputPassword ;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public HomePage login( String username,String password){
        inputUserName.sendKeys(username);
        inputPassword.sendKeys(password);
        inputButtonLogin.click();
        HomePage homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        return  homePage;
    }


    public HomePage login(User user){
        inputUserName.sendKeys(user.getUsername());
        inputPassword.sendKeys(user.getPassword());
        inputButtonLogin.click();
        HomePage homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        return  homePage;
    }

}
