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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.com.au/')

WebUI.setText(findTestObject('Object Repository/amazon/Page_Amazon.com.au Shop online for Electron_18857a/input_All_field-keywords'), 
    'TV')

WebUI.click(findTestObject('Object Repository/amazon/Page_Amazon.com.au Shop online for Electron_18857a/input_All_nav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/amazon/Page_Amazon.com.au  TV/img_Audio__multi-card-creative-desktop_Imag_143b30'))

WebUI.click(findTestObject('Object Repository/amazon/Page_Yamaha Soundbar with Built-in Dual sub_a40239/a_Add to Wish List'))

