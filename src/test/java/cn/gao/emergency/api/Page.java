package cn.gao.emergency.api;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface Page {
    WebDriver driver = null;
    default boolean isPresent(String location){
        WebElement element = driver.findElement(By.cssSelector(location));
        return element != null;
    }
}
