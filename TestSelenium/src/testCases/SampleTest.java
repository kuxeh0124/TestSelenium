package testCases;
import java.util.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frameworkCommons.DSL;
import interFace.i_tp_FillUpForm;
import testProcedures.tp_FillUpForm;

public class SampleTest {	

    @DataProvider(name = "Test")
    public Object[][] credentials() {
    	//call to read excel and save to map
    	Map<String, String> test = DSL.readExcel("Test Data/SampleTestData.xlsx");    	
        return new Object[][] { { test }};    
    }    
    
    @Test(dataProvider = "Test")
    public void test(HashMap<String, String> a) throws Exception {
		i_tp_FillUpForm tfuf = new tp_FillUpForm(a);
		DSL.ExecuteProcedure(tfuf);
    }	
}
