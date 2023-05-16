package by.itacademy.melnichenko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CWTest {
    @Test
    public void testFillFormWithCorrectMale(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://svyatoslav.biz/testlab/wt/");
        WebElement inputName = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/" +
                "table/tbody/tr[2]/td[2]/input"));
        inputName.sendKeys("Алекс");

        WebElement inputHeight = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form" +
                "/table/tbody/tr[3]/td[2]/input"));
        inputHeight.sendKeys("180");

        WebElement inputWeight = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form" +
                "/table/tbody/tr[4]/td[2]/input"));
        inputWeight.sendKeys("300");

        WebElement inputFemale = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form" +
                "/table/tbody/tr[5]/td[2]/input[1]"));
        inputFemale.click();

        WebElement buttonSubmit = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/" +
                "table/tbody/tr[6]/td/input"));
        buttonSubmit.click();

        WebElement actualMassage = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]"));
        String actualMassageText = actualMassage.getText();
        Assertions.assertEquals("Значительный избыток массы тела, тучность", actualMassageText);
    }
}
