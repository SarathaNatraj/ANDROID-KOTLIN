package com.example.weatherapp.test




import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(
    features = ["classpath:features"], // Update this path if necessary
    glue = ["com.example.weatherapp.test"],
    dryRun = true,
    plugin = ["pretty", "html:build/reports/cucumber/cucumber.html"] // Generates an HTML report

)
class CucumberTestRunner


