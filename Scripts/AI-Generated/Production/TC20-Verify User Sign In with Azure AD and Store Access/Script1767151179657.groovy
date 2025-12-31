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
	WebUI.setViewPortSize(1058, 945)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://main.d2rkndqh64e9mb.amplifyapp.com"

TrueTestScripts.navigate("/")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /"

TrueTestScripts.navigate("/")

"Step 4: Click on button signIn2"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_signIn'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 4-Click on button signIn2.png')

"Step 5: Click on item signIn2 -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/item_signIn'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 5-Click on item signIn2 - Navigate to page login.png')

"Step 6: Click on button signInWithAzureAd2 -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_login/button_signInWithAzureAd2'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 6-Click on button signInWithAzureAd2 - Navigate to page .png')

"Step 7: Click on button store -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_store'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 7-Click on button store - Navigate to page store.png')

"Step 8: Click on button signIn"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_signIn'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 8-Click on button signIn.png')

"Step 9: Click on item signIn -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/item_signIn'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 9-Click on item signIn - Navigate to page login.png')

"Step 10: Click on button signInWithAzureAd2 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_login/button_signInWithAzureAd2'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 10-Click on button signInWithAzureAd2 - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC20-Verify User Sign In with Azure AD and Store Access_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}