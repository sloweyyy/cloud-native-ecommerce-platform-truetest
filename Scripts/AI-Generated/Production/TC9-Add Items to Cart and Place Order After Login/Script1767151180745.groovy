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

"Step 4: Click on button store -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_store'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on button store - Navigate to page store.png')

"Step 5: Click on button addToCart (addToCart6)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart_1', ['button_addToCart_nth_1': button_addToCart_nth]))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on button addToCart addToCart6.png')

"Step 6: Click on button checkout2 -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_checkout2'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on button checkout2 - Navigate to page login.png')

"Step 7: Click on button signInWithAzureAd4 -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_login/button_signInWithAzureAd4'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Click on button signInWithAzureAd4 - Navigate to page .png')

"Step 8: Click on button store -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_store'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on button store - Navigate to page store.png')

"Step 9: Click on button addToCart (addToCart6)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart_1', ['button_addToCart_nth_1': button_addToCart_nth_1]))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Click on button addToCart addToCart6.png')

"Step 10: Click on button checkout3 -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_checkout3'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Click on button checkout3 - Navigate to page checkout.png')

"Step 11: Click on button placeOrder"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_placeOrder'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 11-Click on button placeOrder.png')

"Step 12: Click on button backToCart2"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_backToCart2'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 12-Click on button backToCart2.png')

"Step 13: Click on button store -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_store'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 13-Click on button store - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Add Items to Cart and Place Order After Login_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}