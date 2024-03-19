package com.co.PruebaAccenture.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/",
        tags = "@Regresion",
        glue = "com.co.PruebaAccenture.stepsDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class DemoBlazeRunner {

}
