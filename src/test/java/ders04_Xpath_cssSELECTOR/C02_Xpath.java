package ders04_Xpath_cssSELECTOR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- "https://the-internet.herokuapp.com/add_remove_elements/" adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();

        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deletebutonugorunurMu= driver.findElement(By.className("added-manually"));

        if (deletebutonugorunurMu.isDisplayed()){
            System.out.println("test PASSED");
        }else {
            System.out.println("test FAİLED");
        }
        //4- Delete tusuna basin
        deletebutonugorunurMu.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edi//
        WebElement addElement=driver.findElement(By.xpath("//h3"));
        if (addElement.isDisplayed()){
            System.out.println("test PASSED");
        }else {
            System.out.println("test FAİLED");
        }
        Thread.sleep(3000);
        driver.close();
    }
}
