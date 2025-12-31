import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Production.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1269, 1204)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://main.d2rkndqh64e9mb.amplifyapp.com"

TrueTestScripts.navigate("/")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /"

TrueTestScripts.navigate("/")

"Step 4: Click on div nextTechStoreCart"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/div_nextTechStoreCart'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 4-Click on div nextTechStoreCart.png')

"Step 5: Click on button store2 -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_store2'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 5-Click on button store2 - Navigate to page store.png')

"Step 6: Click on button allCategories"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_allCategories'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 6-Click on button allCategories.png')

"Step 7: Click on button allCategories2 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_allCategories'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 7-Click on button allCategories2 - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC23-Login and Navigate to Home and Store_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}