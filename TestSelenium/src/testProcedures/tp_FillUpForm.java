package testProcedures;

import java.util.HashMap;

import frameworkCommons.DSL;
import interFace.i_tp_FillUpForm;
import pageObjects.automationPracticeForm;

public class tp_FillUpForm implements i_tp_FillUpForm {
	public HashMap<String, String> a; 
	
	public tp_FillUpForm(HashMap<String, String> dic){
		a=dic;
	}	
	
	@Override
	public void  tfuf_LaunchBrowser(){
		DSL.sln_launchBrowser(a.get("BrowserName"), a.get("URL"));
	}
		
	@Override
	public void tfuf_inputFirstName(){
		DSL.setValues(automationPracticeForm.textfirstName(), a.get("FirstName"), 30);		
	}
	
	@Override
	public void tfuf_inputLastName(){
		DSL.setValues(automationPracticeForm.textlastName(), a.get("LastName"), 30);
	}
	
	@Override
	public void tfuf_selectGender(){
		DSL.clickObject(automationPracticeForm.selectGender(a.get("Gender")), 30);
	}	
	
	@Override
	public void tfuf_selectCommand(){
		DSL.selectFromList(automationPracticeForm.selectSeleniumCommands(), "Browser Commands", "V", 30);
	}
}
