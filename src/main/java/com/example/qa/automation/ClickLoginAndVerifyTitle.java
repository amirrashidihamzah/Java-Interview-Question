package com.example.qa.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Question: Write code to open a page and click a login button and verify title is Swag Labs
// URL : https://www.saucedemo.com/
//Username : standard_user, Password: secret_sauce
public class ClickLoginAndVerifyTitle{
    public static void main(String[] args){

        String expectedTitle = "Swag Labs";

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        driver.quit();
    }
}
