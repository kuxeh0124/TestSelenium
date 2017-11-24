package testCases;

import org.testng.annotations.Test;
import frameworkCommons.*;

public class SampleConcurrentTest {
  @Test
  public void test() {
	  DSL.sln_launchBrowser("chrome", "http://toolsqa.com/automation-practice-form/");
	  DSL.sln_testFillUpln();
  }
}
