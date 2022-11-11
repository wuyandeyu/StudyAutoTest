package cn.gao.emergency.api;


import org.junit.jupiter.api.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;

/*
 *
 * 初始化方法
 * 查找元素方法
 * 点击元素方法
 * 输入框方法
 * 获取文本方法
 * 截图方法
 * */
public class BaseCase {

    public  WebDriver driver;
    public  JavascriptExecutor js;

    @BeforeAll
    public static void initAll(){

    }


    @BeforeEach
    public void setUp() throws MalformedURLException {
        //System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=2560,1440");
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //driver = new RemoteWebDriver(new URL("http://192.168.1.58:4444"), chromeOptions);
        driver = new ChromeDriver(chromeOptions);
        js = (JavascriptExecutor) driver;
        driver.get("http://192.168.1.149:8080/wztppt-web/login");
    }


    @AfterEach
    public void tearDown() {
        //driver.quit();
    }

    @AfterAll
    public static void endAll(){

    }
}