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

"Step 1: Navigate to /login"

TrueTestScripts.navigate("login")

"Step 2: Click on button signInWithAzureAd -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_login/button_signInWithAzureAd'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on button signInWithAzureAd - Navigate to page .png')

"Step 3: Click on button checkout -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_checkout'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on button checkout - Navigate to page checkout.png')

"Step 4: Click on span removeProduct"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/span_removeProduct'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on span removeProduct.png')

"Step 5: Click on button removeItem"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_removeItem'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on button removeItem.png')

"Step 6: Click on button checkoutOptions (proceedToCheckout)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_checkout/button_checkoutOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_checkout/button_checkoutOptions', ['button_checkoutOptions_buttonInternalHasText_1': button_checkoutOptions_buttonInternalHasText]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on button checkoutOptions proceedToCheckout.png')

"Step 7: Click on button checkoutOptions (proceedToCheckout)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_checkout/button_checkoutOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_checkout/button_checkoutOptions', ['button_checkoutOptions_buttonInternalHasText_1': button_checkoutOptions_buttonInternalHasText_1]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on button checkoutOptions proceedToCheckout.png')

"Step 8: Click on button proceedToCheckout2"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_proceedToCheckout2'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on button proceedToCheckout2.png')

"Step 9: Click on button proceedToCheckout3"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_proceedToCheckout2'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on button proceedToCheckout3.png')

"Step 10: Click on button continueShopping -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_continueShopping'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on button continueShopping - Navigate to page store.png')

"Step 11: Click on span newArrivals"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/span_newArrivals'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on span newArrivals.png')

"Step 12: Click on span bestSeller"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/span_bestSeller'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Click on span bestSeller.png')

"Step 13: Click on span productCategories (laptops)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/span_productCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/span_productCategories', ['span_productCategories_divNthChild_1': span_productCategories_divNthChild]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 13-Click on span productCategories laptops.png')

"Step 14: Click on span productCategories (keyboards)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/span_productCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/span_productCategories', ['span_productCategories_divNthChild_1': span_productCategories_divNthChild_1]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 14-Click on span productCategories keyboards.png')

"Step 15: Click on span productCategories (monitors)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/span_productCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/span_productCategories', ['span_productCategories_divNthChild_1': span_productCategories_divNthChild_2]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 15-Click on span productCategories monitors.png')

"Step 16: Click on span productCategories (mice)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/span_productCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/span_productCategories', ['span_productCategories_divNthChild_1': span_productCategories_divNthChild_3]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 16-Click on span productCategories mice.png')

"Step 17: Click on button clearFilters -> Navigate to page '/admin'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_clearFilters'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 17-Click on button clearFilters - Navigate to page admin.png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Sign In and Manage Checkout Options_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}