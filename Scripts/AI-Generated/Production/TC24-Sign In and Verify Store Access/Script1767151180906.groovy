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

"Step 1: Navigate to https://main.d2rkndqh64e9mb.amplifyapp.com"

TrueTestScripts.navigate("/")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /"

TrueTestScripts.navigate("/")

"Step 4: Click on button store2 -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_store2'))

// WebUI.takeScreenshot(reportLocation + '/TC24/Step 4-Click on button store2 - Navigate to page store.png')

"Step 5: Click on button userMenu"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_userMenu'))

// WebUI.takeScreenshot(reportLocation + '/TC24/Step 5-Click on button userMenu.png')

"Step 6: Click on item signOut -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/item_signOut'))

// WebUI.takeScreenshot(reportLocation + '/TC24/Step 6-Click on item signOut - Navigate to page .png')

"Step 7: Click on button userMenu"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_userMenu'))

// WebUI.takeScreenshot(reportLocation + '/TC24/Step 7-Click on button userMenu.png')

"Step 8: Click on item signIn5 -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/item_signIn5'))

// WebUI.takeScreenshot(reportLocation + '/TC24/Step 8-Click on item signIn5 - Navigate to page login.png')

"Step 9: Click on button signInWithAzureAd3 -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_login/button_signInWithAzureAd3'))

// WebUI.takeScreenshot(reportLocation + '/TC24/Step 9-Click on button signInWithAzureAd3 - Navigate to page .png')

"Step 10: Click on button store2 -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_store2'))

// WebUI.takeScreenshot(reportLocation + '/TC24/Step 10-Click on button store2 - Navigate to page store.png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC24-Sign In and Verify Store Access_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}