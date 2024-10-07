package com.example.weatherapp


import android.content.Intent
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry

import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.RuleChain

/**
 * Instrumented Test on [LoginActivity].
 *
 * @
 */
class LoginActivityTest {

    // 1. Get the Application Context
    private val appContext = InstrumentationRegistry.getInstrumentation().targetContext

    /**
     * [org.junit.rules.TestRule] for Dagger setup.
     */
    @Rule
    @JvmField
    //2. ActivityScenarioRule
    var mActivityScenarioRule = ActivityScenarioRule(LoginActivity::class.java)


    /**
     * [ActivityScenarioRule] for [LoginActivity] setup, which launches LoginActivity
     * for every test method.
     */
    //3.  Connecting with context scenario
    private val loginActivityScenarioRule =
        ActivityScenarioRule<LoginActivity>(Intent(appContext, LoginActivity::class.java))

    /**
     * Getter for the [org.junit.rules.TestRule], which returns the [RuleChain] of TestRules
     * to be applied in the order of [componentRule], followed by [loginActivityScenarioRule].
     */
    @Before
    fun setUp() {
        // No-op
    }

    @After
    fun tearDown() {
        // No-op
    }

    //4.1 test cases - check the views
    @Test
    fun testCheckViewsDisplay() {
        // Check if the Email Field is displayed
        Espresso.onView(ViewMatchers.withId(R.id.username))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        // Check if the Password Field is displayed
        Espresso.onView(ViewMatchers.withId(R.id.password))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        // Check if the Login Button is displayed
        Espresso.onView(ViewMatchers.withId(R.id.login_button))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))


    }

    //2 test case - valid credentials scenario
    @Test
    fun givenValidCredentials_whenLogin_shouldLaunchHomeActivity() {
        // Create User "User_10" for Login testing

        // Type in the email of the user in the TextInputEditText field of email
        Espresso.onView(ViewMatchers.withId(R.id.username))
            .perform(ViewActions.typeText("testUser"), ViewActions.closeSoftKeyboard())

        // Type in the email hash of the user in the TextInputEditText field of password
        Espresso.onView(ViewMatchers.withId(R.id.password))
            .perform(
                ViewActions.typeText("password123"),
                ViewActions.closeSoftKeyboard()
            )

        // Click on the Login Button to start the Login process
        Espresso.onView(ViewMatchers.withId(R.id.login_button))
            .perform(ViewActions.click())

        Espresso.onView(ViewMatchers.withId(R.id.home_text))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))


    }


    //3 test case - invalid credentials scenario
    @Test
    fun givenInValidCredentials_whenLogin_shouldStaysInSameScreen() {

        // Type in the email of the user in the TextInputEditText field of email
        Espresso.onView(ViewMatchers.withId(R.id.username))
            .perform(ViewActions.typeText("user"), ViewActions.closeSoftKeyboard())

        // Type in the email hash of the user in the TextInputEditText field of password
        Espresso.onView(ViewMatchers.withId(R.id.password))
            .perform(
                ViewActions.typeText("123"),
                ViewActions.closeSoftKeyboard()
            )

        // Click on the Login Button to start the Login process
        Espresso.onView(ViewMatchers.withId(R.id.login_button))
            .perform(ViewActions.click())

        // At this moment, For invalid Credentials , it wont redirect , should stay in the LoginActivity
        // Assert it by checking if the login  button view is displayed or not
        Espresso.onView(ViewMatchers.withId(R.id.login_button))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }




}