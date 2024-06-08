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

WebUI.callTestCase(findTestCase('Mobile Automation Test/TC01-Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button - Add'), 0)

Mobile.setText(findTestObject('android.widget.EditText - Input Name'), Name, 0)

Mobile.tap(findTestObject('android.widget.EditText - Choose Type'), 0, FailureHandling.STOP_ON_FAILURE)

switch (Type) {
    case 'Primary':
        Mobile.tap(findTestObject('android.widget.TextView - Primary'), 0)

        break
    case 'Secondary':
        Mobile.tap(findTestObject('android.widget.TextView - Secondary'), 0)

        break
    case 'Other':
        Mobile.tap(findTestObject('android.widget.TextView - Other'), 0)

        break
}

Mobile.setText(findTestObject('android.widget.EditText - Input Description'), Description, 0)

Mobile.tap(findTestObject('android.widget.TextView - Upload Image'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.ImageView - Image Selected'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button - AddToDo'), 0)

Mobile.tap(findTestObject('android.widget.TextView - LogOut'), 0)
