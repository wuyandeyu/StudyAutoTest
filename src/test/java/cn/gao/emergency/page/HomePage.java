package cn.gao.emergency.page;




import cn.gao.emergency.api.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage implements Page{
    public WebDriver driver;
    //运营中心
    @FindBy(css = "#toggleSubMenuBtn > span.title")
    public WebElement textSpan;
    @FindBy(css = "#menuSearch")
    public WebElement inputText;

    @FindBy(css = "#wztppt-navbarCollapse > ul > li.search.menuInput > div > ul > li > a > span")
    public WebElement menuSelect;

    //private Map<String, Page> pageMap;
    public HomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public Page clickMenu(String menuName){
        this.inputText.sendKeys(menuName);
        this.menuSelect.click();
        Page page=null;
        switch (menuName){
            case "物资类型管理" :  page =new MaterialTypeManagementPage(driver); break;
            case "设备模型管理" : page =new MaterialTypeManagementPage(driver); break;
            case "替换策略管理" :  page =new MaterialTypeManagementPage(driver); break;
            case "应急抢修任务管理" :  page =new MaterialTypeManagementPage(driver); break;
            case "应急队伍管理" :  page =new MaterialTypeManagementPage(driver);break;
            case "应急保障通讯录" :  page =new MaterialTypeManagementPage(driver);break;
            case "应急任务填报管理" :  page =new MaterialTypeManagementPage(driver);break;
            default:page=new HomePage(driver);
        }
        return page;

    }

   /* public MaterialTypeManagementPage clickMenu(String menuName){
        this.inputText.sendKeys(menuName);
        this.menuSelect.click();
        MaterialTypeManagementPage materialTypeManagementPage = new MaterialTypeManagementPage(driver);
        return materialTypeManagementPage;

    }*/

}
