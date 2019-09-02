
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;


public class Tester extends TestBase {




    @Test
    public void test(){
        assertEquals("https://www.google.com/", session.getDriver().getCurrentUrl());
        nav.searchTerm("hjkhklhkl");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement element = session.getDriver().findElement(By.id("resultStats"));
        System.out.println(element.getText());

        int count = 1;
        Set resultSet = new HashSet<String>();
        Set resultElements = new HashSet<WebElement>();
        List<WebElement> resultsList = new ArrayList<WebElement>();
        for (int i = 1; i < 20; i++){
            if (i == 100 )break;
            try {
                WebElement ellies = session.getDriver().findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div/div[" + i + "]/div/div/div[1]/a[1]/h3/div"));
                System.out.println("\n\n'''''"+ellies.getText()+"\n\n'''''");


                WebElement result = session.getDriver().findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div/div[" + i + "]/div/div/div[1]/a[1]/h3/div"));
                resultSet.add(result.getText());
                if (resultElements.add(result)){
                    resultsList.add(result);
                }


            } catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("\nsout number: " + i);
            }

        }
        resultSet.size();
        resultElements.size();

        for (WebElement e: resultsList){
            assertTrue(resultElements.contains(e));
            if(resultElements.contains(e)){
                System.out.println("The Product list contains "+ e.getText() + "\n");
            }
        }
    }



}
