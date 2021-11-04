package linkedinlearning.cucumbercourse.testrunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/java/linkedinlearning/cucumbercourse/features"},
        glue = {"linkedinlearning.cucumbercourse.stepdefinitions"},
        plugin={"pretty"}
)
public class MenuManagementTest {
}
