package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before("@SmokeTest")
	public void beforeSmokeTest() {
		System.out.println(" Before Smoke Test");
	}
	
	@After("@SmokeTest")
	public void afterSomkeTest() {
		System.out.println(" After Smoke Test");	
	}

	@Before("@RegTest")
	public void beforeRegTest() {
		System.out.println(" Before Reg Test");
	}
	
	@After("@RegTest")
	public void afterRegTest() {
		System.out.println(" After Reg Test");	
	}
	
	@Before
	public void aftereachTest() {
		System.out.println(" Before Test");
	}
	
	@After
	public void afterTest() {
		System.out.println(" After Test");	
	}

}
