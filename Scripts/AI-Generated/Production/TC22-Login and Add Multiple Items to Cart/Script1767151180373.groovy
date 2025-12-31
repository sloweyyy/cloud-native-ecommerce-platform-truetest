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
	WebUI.setViewPortSize(1122, 926)
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

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 4-Click on button userMenu.png')

"Step 5: Click on item signIn3 -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/item_signIn3'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 5-Click on item signIn3 - Navigate to page login.png')

"Step 6: Click on button signInWithAzureAd3 -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_login/button_signInWithAzureAd3'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 6-Click on button signInWithAzureAd3 - Navigate to page store.png')

"Step 7: Click on button addToCart (addToCart)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart', ['button_addToCart_nth_1': button_addToCart_nth]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 7-Click on button addToCart addToCart.png')

"Step 8: Click on button addToCart (addToCart2)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart', ['button_addToCart_nth_1': button_addToCart_nth_1]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 8-Click on button addToCart addToCart2.png')

"Step 9: Click on button addToCart (addToCart3)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart', ['button_addToCart_nth_1': button_addToCart_nth_2]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 9-Click on button addToCart addToCart3.png')

"Step 10: Click on button addToCart4 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_addToCart4'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 10-Click on button addToCart4 - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC22-Login and Add Multiple Items to Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}