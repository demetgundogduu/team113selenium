package ders03_locators_Relatıve_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Relatıve_XpathSorusu {
    public static void main(String[] args) throws InterruptedException {

        //Relative Xpath Soru
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        driver.findElement(By.xpath("(//button[@onclick='addElement()'])[1]")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButtonElementı= driver.findElement(By.xpath("(//button[@class='added-manually'])[1]"));
           if (deleteButtonElementı.isDisplayed()){
               System.out.println("delete butonu gorunur test ,PASSED");
           }else {
               System.out.println("delete butonu gorunmez test ,FAILED");
           }
        //4- Delete tusuna basin
        deleteButtonElementı.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin/
        WebElement addElementElementi= driver.findElement(By.tagName("h3"));
        if (addElementElementi.isDisplayed()){
            System.out.println("add /Remove  element elementı gorunur test ,PASSED");
        }else{
            System.out.println("add /Remove  element elementı gorunmez test ,Faıled");
        }

        Thread.sleep(3000);
        driver.close();
    }
}
