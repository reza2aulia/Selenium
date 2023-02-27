package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UjianTiga {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\juaracoding\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String url = "https://shop.demoqa.com";
        driver.get(url);
        System.out.println("Get URL");
        driver.manage().window().maximize();
        System.out.println("Maximize Browser");

        //      Locator
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.xpath("//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[2]/a")).click();
        driver.findElement(By.id("username")).sendKeys("reza2aulia");
        System.out.println("Username Sukses di sendkeys");
        driver.findElement(By.id("password")).sendKeys("aulia280195");
        System.out.println("Password Sukses di sendkeys");
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")).click();
        System.out.println("Data Berhasil login");
        driver.findElement(By.xpath("//*[@id=\"noo-site\"]/header/div[2]/div/div/div/div/a/img")).click();
        js.executeScript("window.scrollBy(0,600)");
        driver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[1]/div/h3/a")).click();
        System.out.println("memilih barang");
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.id("pa_color")).sendKeys("pink");
        System.out.println("memilih warna");
        driver.findElement(By.id("pa_size")).sendKeys("37");
        System.out.println("memilih size");
        driver.findElement(By.xpath("//*[@id=\"product-1497\"]/div[1]/div[2]/form/div/div[2]/button")).click();
        System.out.println("Barang Berhasil ditambahkan");


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
