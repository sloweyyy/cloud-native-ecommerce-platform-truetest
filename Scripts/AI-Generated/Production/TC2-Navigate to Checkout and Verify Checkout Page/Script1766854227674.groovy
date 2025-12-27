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
	WebUI.setViewPortSize(2056, 1163)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on button checkout"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_checkout'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on button checkout.png')

"Step 3: Click on div categories"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/div_categories'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on div categories.png')

"Step 4: Click on button userMenu"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_userMenu'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on button userMenu.png')

"Step 5: Click on button userMenu"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_userMenu'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on button userMenu.png')

"Step 6: Click on button store -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_store'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on button store - Navigate to page store.png')

"Step 7: Click on span newArrivals"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/span_newArrivals'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on span newArrivals.png')

"Step 8: Click on button checkout -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_checkout'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on button checkout - Navigate to page checkout.png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Navigate to Checkout and Verify Checkout Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}