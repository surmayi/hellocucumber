package hellocucumber;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Unit test for simple App.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefinitions",tags="@PortalTest",monochrome=true,strict=true,
		plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/reportjunit.xml"})
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	System.out.println("Running test");
        assertTrue( true );
    }
}
