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
	WebUI.setViewPortSize(1122, 1134)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://main.d2rkndqh64e9mb.amplifyapp.com"

TrueTestScripts.navigate("/")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /store"

TrueTestScripts.navigate("store")

"Step 4: Click on button addToCart (addToCart)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart', ['button_addToCart_nth_1': button_addToCart_nth]))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on button addToCart addToCart.png')

"Step 5: Click on button addToCart (addToCart3)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart', ['button_addToCart_nth_1': button_addToCart_nth_1]))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on button addToCart addToCart3.png')

"Step 6: Click on button addToCart (addToCart2)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart', ['button_addToCart_nth_1': button_addToCart_nth_2]))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on button addToCart addToCart2.png')

"Step 7: Click on button addToCart (addToCart)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart', ['button_addToCart_nth_1': button_addToCart_nth_3]))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Click on button addToCart addToCart.png')

"Step 8: Click on button cartActions (cart2) -> Navigate to page '/checkout'"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_cartActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_cartActions', ['button_cartActions_internalLabel_1': button_cartActions_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on button cartActions cart2 - Navigate to page checkout.png')

"Step 9: Click on button quantityAdjust (plus)"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_checkout/button_quantityAdjust'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Click on button quantityAdjust plus.png')

"Step 10: Click on span checkoutButton"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/span_checkoutButton'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Click on span checkoutButton.png')

"Step 11: Click on span increaseValue"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/span_increaseValue'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 11-Click on span increaseValue.png')

"Step 12: Enter input value in input object"

WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout/input_object'), input_object)

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 12-Enter input value in input object.png')

"Step 13: Click on button quantityAdjust (plus2)"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_checkout/button_quantityAdjust'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 13-Click on button quantityAdjust plus2.png')

"Step 14: Click on span checkoutProceedButton"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/span_checkoutProceedButton'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 14-Click on span checkoutProceedButton.png')

"Step 15: Click on span space"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/span_space'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 15-Click on span space.png')

"Step 16: Click on span checkoutProceedButton"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/span_checkoutProceedButton'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 16-Click on span checkoutProceedButton.png')

"Step 17: Click on span checkoutButton2"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/span_checkoutButton2'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 17-Click on span checkoutButton2.png')

"Step 18: Click on button backToCart"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_backToCart'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 18-Click on button backToCart.png')

"Step 19: Click on button backToCart"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_backToCart'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 19-Click on button backToCart.png')

"Step 20: Click on button store -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_store'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 20-Click on button store - Navigate to page store.png')

"Step 21: Click on button addToCart (addToCart)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart', ['button_addToCart_nth_1': button_addToCart_nth_4]))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 21-Click on button addToCart addToCart.png')

"Step 22: Click on span shoppingCartLabel -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/span_shoppingCartLabel'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 22-Click on span shoppingCartLabel - Navigate to page checkout.png')

"Step 23: Click on div checkoutInfo"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/div_checkoutInfo'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 23-Click on div checkoutInfo.png')

"Step 24: Click on span checkoutAction"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/span_checkoutAction'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 24-Click on span checkoutAction.png')

"Step 25: Click on button store -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_store'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 25-Click on button store - Navigate to page store.png')

"Step 26: Click on button addToCart (addToCart4)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart', ['button_addToCart_nth_1': button_addToCart_nth_5]))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 26-Click on button addToCart addToCart4.png')

"Step 27: Click on button addToCart (addToCart5)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart', ['button_addToCart_nth_1': button_addToCart_nth_6]))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 27-Click on button addToCart addToCart5.png')

"Step 28: Click on div productList -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/div_productList'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 28-Click on div productList - Navigate to page .png')

"Step 29: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Manage Shopping Cart and Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}