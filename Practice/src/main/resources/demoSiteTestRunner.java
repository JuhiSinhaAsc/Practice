import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/demoSite.feature",
		glue={"C:\\Users\\juhi.sinha\\eclipse-workspace\\Practice\\src\\main\\java\\DemoSiteStepsImpl.java"},
		tags = "@sanity",
		dryRun=true,		
		plugin= {"pretty"},
		monochrome = true
		)
public class demoSiteTestRunner {

}
