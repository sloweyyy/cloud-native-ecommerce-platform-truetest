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
	WebUI.setViewPortSize(2056, 926)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://main.d2rkndqh64e9mb.amplifyapp.com"

TrueTestScripts.navigate("/")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /"

TrueTestScripts.navigate("/")

"Step 4: Click on button userMenu"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_userMenu'))

// WebUI.takeScreenshot(reportLocation + '/TC26/Step 4-Click on button userMenu.png')

"Step 5: Click on item signIn3 -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/item_signIn3'))

// WebUI.takeScreenshot(reportLocation + '/TC26/Step 5-Click on item signIn3 - Navigate to page login.png')

"Step 6: Click on button signInWithAzureAd3 -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_login/button_signInWithAzureAd3'))

// WebUI.takeScreenshot(reportLocation + '/TC26/Step 6-Click on button signInWithAzureAd3 - Navigate to page .png')

"Step 7: Click on button cart -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_cart'))

// WebUI.takeScreenshot(reportLocation + '/TC26/Step 7-Click on button cart - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC26-Login and Access Cart from Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}