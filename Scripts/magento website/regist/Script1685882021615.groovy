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

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_First Name_firstname'), 'amina')

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_Last Name_lastname'), 'namina')

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_Email_email'), 'amina@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create New Customer Account/input_Password_password'), 'fzqqY0qJjYRnzxZcb13UdA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create New Customer Account/input_Confirm Password_password_confirmation'), 
    'fzqqY0qJjYRnzxZcb13UdA==')

WebUI.click(findTestObject('Object Repository/Page_Create New Customer Account/button_Create an Account'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Account/div_Thank you for registering with Main Web_e69dd7'))

WebUI.click(findTestObject('Object Repository/Page_My Account/a_Sign Out'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create New Customer Account/div_warningFirstName'), 
    'This is a required field.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create New Customer Account/div_warningLastName'), 
    'This is a required field.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create New Customer Account/div_warningEmail'), 
    'This is a required field.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create New Customer Account/div_warningConfirmPassword'), 
    'This is a required field.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create New Customer Account/div_Please enter a valid email address (Ex _bf576d'), 
    'Please enter a valid email address (Ex: johndoe@domain.com).')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create New Customer Account/div_Minimum length of this field must be eq_a255c3'), 
    'Minimum length of this field must be equal or greater than 8 symbols. Leading and trailing spaces will be ignored.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create New Customer Account/div_Minimum of different classes of charact_5e3ddb'), 
    'Minimum of different classes of characters in password is 3. Classes of characters: Lower Case, Upper Case, Digits, Special Characters.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create New Customer Account/div_Please enter the same value again'), 
    'Please enter the same value again.')

