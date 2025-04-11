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

WebUI.navigateToUrl('https://sweetshop.netlify.app/sweets')

WebUI.verifyElementClickable(findTestObject('Buttons/Page_Sweet Shop/a_Add to Basket'))

WebUI.click(findTestObject('Object Repository/Buttons/Page_Sweet Shop/a_Add to Basket_1'))

WebUI.verifyElementClickable(findTestObject('Buttons/Page_Sweet Shop/a_Add to Basket_1'))

WebUI.click(findTestObject('Object Repository/Buttons/Page_Sweet Shop/a_Add to Basket_1_2'))

WebUI.verifyElementClickable(findTestObject('Buttons/Page_Sweet Shop/a_Add to Basket_1_2'))

WebUI.click(findTestObject('Object Repository/Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3'))

WebUI.verifyElementClickable(findTestObject('Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3'))

WebUI.click(findTestObject('Object Repository/Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4'))

WebUI.verifyElementClickable(findTestObject('Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4_5'))

WebUI.verifyElementClickable(findTestObject('Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4_5_6'))

WebUI.verifyElementClickable(findTestObject('Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4_5_6_7'))

WebUI.verifyElementClickable(findTestObject('Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4_5_6_7_8'))

WebUI.verifyElementClickable(findTestObject('Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4_5_6_7_8'))

WebUI.click(findTestObject('Object Repository/Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4_5_6_7_8_9'))

WebUI.verifyElementClickable(findTestObject('Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4_5_6_7_8_9'))

WebUI.click(findTestObject('Object Repository/Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4_5_6_7_8_9_10'))

WebUI.verifyElementClickable(findTestObject('Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4_5_6_7_8_9_10'))

WebUI.click(findTestObject('Object Repository/Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4_5_6_7_8_9_10_11'))

WebUI.verifyElementClickable(findTestObject('Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4_5_6_7_8_9_10_11'))

WebUI.click(findTestObject('Object Repository/Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4_5_6_7_8_9_10_11_12'))

WebUI.verifyElementClickable(findTestObject('Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4_5_6_7_8_9_10_11_12'))

WebUI.click(findTestObject('Object Repository/Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4_5_6_7_8_9_10_11_12_13'))

WebUI.verifyElementClickable(findTestObject('Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4_5_6_7_8_9_10_11_12_13'))

WebUI.click(findTestObject('Object Repository/Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4_5_6_7_8_9_10_11_12_13_14'))

WebUI.verifyElementClickable(findTestObject('Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4_5_6_7_8_9_10_11_12_13_14'))

WebUI.click(findTestObject('Object Repository/Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15'))

WebUI.verifyElementClickable(findTestObject('Buttons/Page_Sweet Shop/a_Add to Basket_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15'))

WebUI.click(findTestObject('Object Repository/Buttons/Page_Sweet Shop/a_16 Basket'))

WebUI.closeBrowser()

