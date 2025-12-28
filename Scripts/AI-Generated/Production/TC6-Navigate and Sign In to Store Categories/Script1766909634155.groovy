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

"Step 4: Click on button signIn"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_signIn'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on button signIn.png')

"Step 5: Click on item signIn -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/item_signIn'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on item signIn - Navigate to page login.png')

"Step 6: Click on button signInWithAzureAd -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_login/button_signInWithAzureAd'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on button signInWithAzureAd - Navigate to page .png')

"Step 7: Click on button allCategories"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_allCategories'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Click on button allCategories.png')

"Step 8: Click on div homeNavigation"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/div_homeNavigation'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Click on div homeNavigation.png')

"Step 9: Click on main homeContent"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/main_homeContent'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Click on main homeContent.png')

"Step 10: Click on div homeCategories"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/div_homeCategories'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 10-Click on div homeCategories.png')

"Step 11: Click on div homeCategories"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/div_homeCategories'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 11-Click on div homeCategories.png')

"Step 12: Click on div homeNavigation"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/div_homeNavigation'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 12-Click on div homeNavigation.png')

"Step 13: Click on button store -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_store'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 13-Click on button store - Navigate to page store.png')

"Step 14: Click on button home -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_home'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 14-Click on button home - Navigate to page .png')

"Step 15: Click on div homeNavigation"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/div_homeNavigation'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 15-Click on div homeNavigation.png')

"Step 16: Click on button store -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_store'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 16-Click on button store - Navigate to page store.png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Navigate and Sign In to Store Categories_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}