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
	WebUI.setViewPortSize(1800, 964)
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

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on button signIn.png')

"Step 5: Click on item signIn -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/item_signIn'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on item signIn - Navigate to page login.png')

"Step 6: Click on button signInWithAzureAd2 -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_login/button_signInWithAzureAd2'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on button signInWithAzureAd2 - Navigate to page .png')

"Step 7: Click on button store -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_store'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on button store - Navigate to page store.png')

"Step 8: Click on button addToCart (addToCart2)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart', ['button_addToCart_nth_1': button_addToCart_nth]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on button addToCart addToCart2.png')

"Step 9: Click on button checkout -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_checkout'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Click on button checkout - Navigate to page checkout.png')

"Step 10: Click on button checkoutOptions (continueShopping2)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_checkout/button_checkoutOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_checkout/button_checkoutOptions', ['button_checkoutOptions_buttonInternalHasText_1': button_checkoutOptions_buttonInternalHasText]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 10-Click on button checkoutOptions continueShopping2.png')

"Step 11: Click on button checkoutOptions (proceedToCheckout)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_checkout/button_checkoutOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_checkout/button_checkoutOptions', ['button_checkoutOptions_buttonInternalHasText_1': button_checkoutOptions_buttonInternalHasText_1]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 11-Click on button checkoutOptions proceedToCheckout.png')

"Step 12: Click on button checkoutOptions (proceedToCheckout)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_checkout/button_checkoutOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_checkout/button_checkoutOptions', ['button_checkoutOptions_buttonInternalHasText_1': button_checkoutOptions_buttonInternalHasText_2]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 12-Click on button checkoutOptions proceedToCheckout.png')

"Step 13: Click on div checkoutSummary"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/div_checkoutSummary'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 13-Click on div checkoutSummary.png')

"Step 14: Click on main orderSummary"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/main_orderSummary'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 14-Click on main orderSummary.png')

"Step 15: Click on button nextTechHome -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_nextTechHome'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 15-Click on button nextTechHome - Navigate to page .png')

"Step 16: Click on button store -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_store'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 16-Click on button store - Navigate to page store.png')

"Step 17: Click on button addToCart (addToCart3)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart', ['button_addToCart_nth_1': button_addToCart_nth_1]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 17-Click on button addToCart addToCart3.png')

"Step 18: Click on button cartActions (cart) -> Navigate to page '/checkout'"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_cartActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_cartActions', ['button_cartActions_internalLabel_1': button_cartActions_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 18-Click on button cartActions cart - Navigate to page checkout.png')

"Step 19: Click on button checkoutOptions (proceedToCheckout) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_checkout/button_checkoutOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_checkout/button_checkoutOptions', ['button_checkoutOptions_buttonInternalHasText_1': button_checkoutOptions_buttonInternalHasText_3]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 19-Click on button checkoutOptions proceedToCheckout - Navigate to page .png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Checkout Process with Multiple Items in Store_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}