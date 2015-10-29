package com.junit.practice;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ConcateTest.class, JunitClass.class })
public class JunitTestSuite {
	

}
