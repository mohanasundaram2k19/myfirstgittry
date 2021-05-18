package com.testing.moduleone;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.testing.module.utilities.ExcelMethods;
import com.testing.module.utilities.ExtentListeners;
//import com.testing.module.baseTest.BaseTest;
import com.testing.module.helper.UtilitiesFile;


public class Mymoduleone  {
	
//	static UtilitiesFile ut;
	static Properties myProp = UtilitiesFile.loadProperty("./src/test/resources/properties/config.properties");

	@BeforeMethod()
	public void testobject() {
	//	ut = new UtilitiesFile();
		System.out.println("objet is created");
		//log.debug("Config file loaded !!!");
	}
	
	
	@Test()
	public void verification() {
		Reporter.log("hello",true);
	//	ut.click();
	//	ut.type();
	}
	
	@Test()
	public void verifytwo() {
		Reporter.log("hellotwo",true);
	//	ut.click();
	//	ut.type();
	}
	
//	@Test()
//	public void verifythree() {
//		Reporter.log("hellothree",true);
//		ut.click();
//		ut.type();
//		Assert.assertFalse(true);
//	}
	
	@Test()
	public void verifyfour() throws IOException {
		System.out.println("i am from proprties file");
		String checkProp=myProp.getProperty("URL");
		System.out.println(checkProp);		
		String testdataon="D:\\workspaces\\trydatadriven\\src\\test\\resources\\excel\\testdata.xlsx";
		String testdat=UtilitiesFile.ExcelRead(testdataon, "letsgive", "smog");
	    System.out.println(testdat);		
		//String getteestata=ExcelMethods.getDataone("letsgive", "username", 4);
		//System.out.println(getteestata);
	}
	
//	@Test()
//	public void verifyfive() {
//		System.out.println("i am writing to excel");
//		ExcelMethods.putDataone("letsgive", "username", 3,"mysoreanmyseelf");
//		System.out.println("i am DONE writing to excel");
//		String getteestata=ExcelMethods.getDataone("letsgive", "username", 3);
//		System.out.println(getteestata);
//	}
	
	
	@Test()
	public void verifysix() {
		
//		log.debug("launching website");
//		log.debug("edtited website");
//		log.debug("saved bwebsite");
//		log.debug("quit website");
		
		System.out.println("teest");
		
	}
	
	
	@AfterTest()
	public void end() {
		System.out.println("The browser is quit");
	}
	
	
}


 