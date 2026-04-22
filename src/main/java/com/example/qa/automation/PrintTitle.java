package com.example.qa.automation;

//Question: Write a Selenium program to open a browser and print the page title.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTitle {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        System.out.println("title is: " + driver.getTitle());

        driver.quit();
    }
}
