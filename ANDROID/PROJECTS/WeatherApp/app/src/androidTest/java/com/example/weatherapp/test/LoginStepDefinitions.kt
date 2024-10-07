package com.example.weatherapp.test

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText

import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed


import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class LoginStepDefinitions {

    @Given("^the user is on the login screen$")
    fun userIsOnLoginScreen() {
        // In real scenarios, you may launch the login activity if needed
        // Here, Espresso is used to check if login screen is visible
        //LoginScreen -> with Login Button -> check
        onView(withId(com.example.weatherapp.R.id.login_button)).check(matches(isDisplayed()))
    }

    @When("^the user enters valid username and password$")
    fun userEntersValidCredentials() {
        // Using Espresso to input the username and password
        onView(withId(com.example.weatherapp.R.id.username)).perform(ViewActions.typeText("testUser"))
        onView(withId(com.example.weatherapp.R.id.password)).perform(ViewActions.typeText("password123"))
    }

    @When("^the user taps the login button$")
    fun userTapsLoginButton() {
        // Using Espresso to click the login button
        onView(withId(com.example.weatherapp.R.id.login_button)).perform(ViewActions.click())
    }

    @Then("^the user should see the home screen$")
    fun userSeesHomeScreen() {
        // Check if the home screen is displayed after successful login
        onView(withId(com.example.weatherapp.R.id.home_text)).check(matches(isDisplayed()))
    }
}
