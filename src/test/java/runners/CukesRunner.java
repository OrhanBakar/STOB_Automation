package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={
                "html:target/cucumber-report.html",//raporlama icin kac test gecti, kac test kaldi percentage
                "html:target/failed-html-report",
                "rerun:target/rerun.txt",//failed testleri tekrar calistirmak icin
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "pretty"//more statistical data reporting
        },
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        tags = "@spartans"

)
public class CukesRunner {

}
