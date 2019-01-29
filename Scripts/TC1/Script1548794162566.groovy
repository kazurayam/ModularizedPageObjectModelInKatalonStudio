import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/strong_CURA Healthcare Service'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Atlanta 550 Pharr Road NE Su'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/li_(678) 813-1KMS'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_infokatalon.com'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_CURA Healthcare Service'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_CURA Healthcare Service   _1'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_CURA Healthcare Service   _2'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h1_CURA Healthcare Service'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h3_We Care About Your Health'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare C'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Apply for hospital readm'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Medicaid_programs'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Visit Date (Required)_vi'), '01/01/2020')

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_Comment_comment'), 'This is a comment')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/section_Make Appointment'))

WebUI.closeBrowser()

