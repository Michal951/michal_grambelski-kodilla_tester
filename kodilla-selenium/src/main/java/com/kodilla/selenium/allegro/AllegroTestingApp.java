package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");

        WebElement category = driver.findElement(By.xpath("//select[1]"));
        Select categorySelect = new Select(category);
        categorySelect.selectByIndex(3);

        WebElement inputField = driver.findElement(By.xpath("//input[1]"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();
    }
}