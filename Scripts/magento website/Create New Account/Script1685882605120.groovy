import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/customer/account/create/')

if (firstName != 'none') {
    WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_First Name_firstname'), firstName)
}

if (lastName != 'none') {
    WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_Last Name_lastname'), lastName)
}

if (email != 'none') {
    WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_Email_email'), email)
}

if (password != 'none') {
    WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_Password_password'), password)
}

if (confirmPassword != 'none') {
    WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_Confirm Password_password_confirmation'), 
        confirmPassword)
}

WebUI.click(findTestObject('Object Repository/Page_Create New Customer Account/button_Create an Account'))

if (testType == 'P') {
    WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Account/div_Thank you for registering with Main Web_e69dd7'))

    WebUI.closeBrowser()
} else {
    if (warningFirstName != 'none') {
        WebUI.verifyElementText(findTestObject('Object Repository/Page_Create New Customer Account/div_warningFirstName'), 
            warningFirstName)
		WebUI.closeBrowser()
    }
    
    if (warningLastName != 'none') {
        WebUI.verifyElementText(findTestObject('Object Repository/Page_Create New Customer Account/div_warningLastName'), 
            warningLastName)
		WebUI.closeBrowser()
    }
    
    if (warningEmail != 'none') {
        WebUI.verifyElementText(findTestObject('Object Repository/Page_Create New Customer Account/div_warningEmail'), warningEmail)
		WebUI.closeBrowser()
	}
    
    if (warningPassword != 'none') {
        WebUI.verifyElementText(findTestObject('Object Repository/div_warningPassword'), warningPassword)
		WebUI.closeBrowser()
    }
    
    if (warningConfirmPassword != 'none') {
        WebUI.verifyElementText(findTestObject('Object Repository/Page_Create New Customer Account/div_warningConfirmPassword'), 
            warningConfirmPassword)
		WebUI.closeBrowser()
    }
}

