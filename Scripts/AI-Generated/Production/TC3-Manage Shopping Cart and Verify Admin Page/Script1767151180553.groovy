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
	WebUI.setViewPortSize(1223, 1163)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://main.d2rkndqh64e9mb.amplifyapp.com"

TrueTestScripts.navigate("/")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /login"

TrueTestScripts.navigate("login")

"Step 4: Click on button signInWithAzureAd3 -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_login/button_signInWithAzureAd3'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on button signInWithAzureAd3 - Navigate to page .png')

"Step 5: Click on button checkout -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_checkout'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on button checkout - Navigate to page checkout.png')

"Step 6: Click on span removeProduct"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/span_removeProduct'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on span removeProduct.png')

"Step 7: Click on button removeItem"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_removeItem'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on button removeItem.png')

"Step 8: Click on button checkoutActions (proceedToCheckout)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_checkout/button_checkoutActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_checkout/button_checkoutActions', ['button_checkoutActions_buttonInternalHasText_1': button_checkoutActions_buttonInternalHasText]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on button checkoutActions proceedToCheckout.png')

"Step 9: Click on button checkoutActions (proceedToCheckout)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_checkout/button_checkoutActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_checkout/button_checkoutActions', ['button_checkoutActions_buttonInternalHasText_1': button_checkoutActions_buttonInternalHasText_1]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on button checkoutActions proceedToCheckout.png')

"Step 10: Click on button proceedToCheckout2"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_proceedToCheckout2'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on button proceedToCheckout2.png')

"Step 11: Click on button proceedToCheckout3"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_proceedToCheckout2'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on button proceedToCheckout3.png')

"Step 12: Click on button continueShopping -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_continueShopping'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Click on button continueShopping - Navigate to page store.png')

"Step 13: Click on span newArrivals"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/span_newArrivals'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 13-Click on span newArrivals.png')

"Step 14: Click on span bestSeller"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/span_bestSeller'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 14-Click on span bestSeller.png')

"Step 15: Click on span productTypes (laptops)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/span_productTypes"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/span_productTypes', ['span_productTypes_divNthChild_1': span_productTypes_divNthChild]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 15-Click on span productTypes laptops.png')

"Step 16: Click on span productTypes (keyboards2)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/span_productTypes"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/span_productTypes', ['span_productTypes_divNthChild_1': span_productTypes_divNthChild_1]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 16-Click on span productTypes keyboards2.png')

"Step 17: Click on span productTypes (monitors2)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/span_productTypes"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/span_productTypes', ['span_productTypes_divNthChild_1': span_productTypes_divNthChild_2]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 17-Click on span productTypes monitors2.png')

"Step 18: Click on span productTypes (mice)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/span_productTypes"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/span_productTypes', ['span_productTypes_divNthChild_1': span_productTypes_divNthChild_3]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 18-Click on span productTypes mice.png')

"Step 19: Click on button clearFilters -> Navigate to page '/admin'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_clearFilters'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 19-Click on button clearFilters - Navigate to page admin.png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Manage Shopping Cart and Verify Admin Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}