package com.example.test.demos.web.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.Map;

public class Selenium {
    public static void main(String[] args) {

        // 设置浏览器驱动路径
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\28304\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");

        // 1.创建webdriver驱动
        WebDriver driver = new ChromeDriver();
        // 2.打开百度首页
        driver.get("https://www.baidu.com");

        // 获取搜索框元素
        WebElement inputElem = driver.findElement(By.id("kw"));

        // clear()方法，清空输入框内容
        inputElem.clear();

        // sendKeys()方法，在搜索框中输入搜索内容
        inputElem.sendKeys("selenium");

        // 元素是否显示
        boolean displayed = inputElem.isDisplayed();
        System.out.println(displayed); // 输出true

        // 元素是否启用
        boolean enabled = inputElem.isEnabled();
        System.out.println(enabled); // 输出true

        // 判断元素是否被选中状态，一般用在Radio(单选),Checkbox（多选）,Select（下拉选）
        // 在输入框中使用无意义
        boolean selected = inputElem.isSelected();
        System.out.println(selected); // 输出fasle

        // 获取标签名
        String tagName = inputElem.getTagName();
        System.out.println(tagName); // 输出input

        // 获取属性名(name属性)
        String name = inputElem.getAttribute("name");
        System.out.println(name); // 输出wd

        // 获取文本值
        String text = inputElem.getText();
        System.out.println(text); // 输出selenium

        // 通过submit提交
        driver.findElement(By.id("su")).submit();

        // click()方法，点击百度一下按钮
        driver.findElement(By.id("su")).click();

        // 退出浏览器
//        driver.quit();

    }

}
