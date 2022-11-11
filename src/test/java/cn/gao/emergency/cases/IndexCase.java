package cn.gao.emergency.cases;


import cn.gao.emergency.api.BaseCase;
import cn.gao.emergency.entity.User;
import cn.gao.emergency.page.IndexPage;
import cn.gao.emergency.page.LoginPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
@Epic("华云供应链运营中心-应急管理系统 ")
@Feature("未登录首页")
public class IndexCase extends BaseCase {

    @Test
    @Story("未登录页")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("点击登录按钮：跳转至登录界面")
    @Description("点击未登录首页上的登录按钮")
    @Step("点击登录按钮")
    @Link(name="静态链接", url="https://www.baidu.com")
    public  void toLoginPage () throws InterruptedException {
        //driver.manage().window().setSize(new Dimension(2560, 1440));
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
        System.out.println(driver.getCurrentUrl());
       LoginPage login = new IndexPage(driver).login();
    }

}