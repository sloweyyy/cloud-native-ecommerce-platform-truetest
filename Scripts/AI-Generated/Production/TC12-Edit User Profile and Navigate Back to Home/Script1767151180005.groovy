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
	WebUI.setViewPortSize(1800, 930)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://main.d2rkndqh64e9mb.amplifyapp.com"

TrueTestScripts.navigate("/")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /"

TrueTestScripts.navigate("/")

"Step 4: Click on button userMenu2"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_userMenu2'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 4-Click on button userMenu2.png')

"Step 5: Click on item myAccount -> Navigate to page '/account'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/item_myAccount'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 5-Click on item myAccount - Navigate to page account.png')

"Step 6: Click on button editProfile"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_account/button_editProfile'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 6-Click on button editProfile.png')

"Step 7: Click on button home -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_account/button_home'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 7-Click on button home - Navigate to page .png')

"Step 8: Click on button allCategories"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_allCategories'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 8-Click on button allCategories.png')

"Step 9: Click on button nextTechHome -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_nextTechHome'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 9-Click on button nextTechHome - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Edit User Profile and Navigate Back to Home_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}