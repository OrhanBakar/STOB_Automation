package stepdefinitions;
import utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before //runs before each cucumber scenario
    public void setUp(){
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @After//runs after each scenario. It always runs no matter if the scenario passes or fails
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()){

            final byte[] screenshot=((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot,"image/png","screenshot");
        }

        Driver.closeDriver();

    }
    @Before("@db")   //cucumber e ait olani sec
    public void setUpDb(){

        System.out.println("\tConnecting to database...");
    }
    @After("@db")
    public void closeDb(){

        System.out.println("\tDisconnecting to database...");

    }
}

