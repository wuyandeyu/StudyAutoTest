package cn.gao.emergency.cases;

import cn.gao.emergency.api.BaseCase;
import cn.gao.emergency.page.HomePage;
import cn.gao.emergency.page.IndexPage;
import cn.gao.emergency.page.LoginPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

@Epic("华云供应链运营中心-应急管理系统 ")
@Feature("登录后首页")
public class HomeCase  extends BaseCase {

    @Test
    @Story("跳转登录页")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("用例名称：子功能1")
    @Description("点击未登录首页上的登录按钮")
    @Step("点击登录按钮")

    @Link(name="静态链接", url="https://www.baidu.com")

    public  void openHome () throws InterruptedException {
        Allure.description("动态用例描述");
        Allure.link("动态链接", "https://www.baidu.com");
        Allure.step("动态用例步骤1：断言");
        //Assertions.assertTrue(1+1==2);
        Allure.step("动态用例步骤2：添加附件");
        // 添加文本展示
        Allure.addAttachment("My attachment", "My attachment content");
        // 添加截图展示
        try {
            Allure.addAttachment("add picture", "image/png",
                    new FileInputStream("C:\\Users\\Administrator\\Desktop\\gao\\image\\1111.jpg"), ".jpg");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        LoginPage login = new IndexPage(driver).login();
        HomePage homePage = login.login("zj_chaiqiaoyan", "Wuzixt0571@");

    }
}
