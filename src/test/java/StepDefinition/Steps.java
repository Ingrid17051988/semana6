package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Steps {
	WebDriver driver;
	@Given("Abrir Chrome")
	public void abrir_Chrome() {
		//Write code here turns the place above into concrete actions
		System.out.println("En este paso abre el navegador google chrome");
		System.setProperty("com.mysql.jdbc.Driver", "C:\\Users\\Alumno\\eclipse-workspace\\inicio\\libreria");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Alumno\\eclipse-workspace\\petSmile1\\src\\formularios\\inicio.java");
	}
	
    @When("ingresa Username {string} y Password {string}")
    public void ingresa_nombreUsuario_y_Password(String string, String string2) {
    	//Write code here that turns the phrase above into concrete actions
    	System.out.println("En este paso ingresa las credenciale de usuario");
    	System.out.println("En este paso ingresa el nombre de usuario y contraseña en la pagina de login");
    	driver.findElement(By.id("username")).sendKeys(string); 
    	driver.findElement(By.id("password")).sendKeys(string2);
    }
    

    @Then("inicia sesion")
    public void inicia_sesion() {
    	//Write code here that turns the phrase above into concrete actions
    	System.out.println("En este paso inicia sesion con los datos ingresados desde nuestro archivo Mytest.feature");
    	driver.findElement(By.id("loginbtn")).click();
    }
}
