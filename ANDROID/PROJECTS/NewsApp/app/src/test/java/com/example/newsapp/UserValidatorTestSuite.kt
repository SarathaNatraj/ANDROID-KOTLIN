package com.example.newsapp

import org.junit.runner.RunWith
import org.junit.runners.Suite

// Define a test suite that includes all validator test classes
@RunWith(Suite::class)
@Suite.SuiteClasses(
    EmailValidatorTest::class,
    PasswordValidatorTest::class,
    UserValidateTest::class
)
class UserValidatorTestSuite
