import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestNavegador {
    private WebDriver driver;

    // Inicializar metodos base
    @BeforeMethod
    public void iniciar(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aluno\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

    }

}
