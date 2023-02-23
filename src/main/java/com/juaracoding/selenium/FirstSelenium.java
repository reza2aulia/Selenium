package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstSelenium {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\juaracoding\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String url = "https://demoqa.com/text-box";
        String url2 = "https://demoqa.com/checkbox";
        driver.get(url);
        System.out.println("Get URL");
        driver.manage().window().maximize();
        System.out.println("Maximize Browser");

        //Locator
        String title = driver.findElement(By.className("main-header")).getText();
        System.out.println(title);
        driver.findElement(By.id("userName")).sendKeys("JuaraCoding");
        driver.findElement(By.id("userEmail")).sendKeys("info@juaracoding.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Jakarta");
        driver.findElement(By.id("permanentAddress")).sendKeys("Jakarta");
        //scroll page
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.id("submit")).click();
        System.out.println("Data Berhasil disimpan");


        //Check Box
        driver.get(url2);
        driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button")).click();
        driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[3]")).click();
        String txtDownload = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]")).getText();
        System.out.println(txtDownload);

        System.out.println("Delay 3 detik");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
        System.out.println("Quit Browser");
    }
}