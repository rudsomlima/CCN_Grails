package ccn

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

class BuscadorService {

    public static void main(String [] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudsom.lima\\Downloads\\chromedriver_win32\\chromedriver.exe");
        String site_ccn = "http://www.sysca.com.br/ver_boleto.php?cod=53127";
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get(site_ccn);
        def nome = driver.findElement(By.xpath("//*[@id=\"boleto\"]/table[6]/tbody/tr[2]/td"));
        String strPageTitle = driver.getTitle();
        System.out.println("Page title: - "+strPageTitle);
        System.out.println("Nome: - "+nome2);








    }
}
