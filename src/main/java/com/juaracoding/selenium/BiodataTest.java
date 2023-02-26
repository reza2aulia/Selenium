package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.concurrent.TimeUnit;

public class BiodataTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\juaracoding\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String url = "https://formy-project.herokuapp.com/form";
        driver.get(url);
        System.out.println("Get URL");
        driver.manage().window().maximize();
        System.out.println("Maximize Browser");

        //      Locator
        driver.findElement(By.id("first-name")).sendKeys("Reza");
        System.out.println("First name Sukses di sendkeys");
        driver.findElement(By.id("last-name")).sendKeys("Aulia");
        System.out.println("last name Sukses di sendkeys");
        driver.findElement(By.id("job-title")).sendKeys("Data Engineer");
        System.out.println("Job title berhasil di sendkeys");
        driver.findElement(By.id("radio-button-2")).click();
        System.out.println("Highest level of education berhasil di pilih");
        driver.findElement(By.id("checkbox-1")).click();
        System.out.println("checkbox sex berhasil di pilih");

        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.id("select-menu")).sendKeys("0");
        driver.findElement(By.id("datepicker")).sendKeys("09/19/2022");
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
        System.out.println("Data Berhasil disimpan");



        System.out.println("Delay 10 detik");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
        System.out.println("Quit Browser");
    }
}
