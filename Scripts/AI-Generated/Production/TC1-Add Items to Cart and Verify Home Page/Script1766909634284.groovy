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

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button signIn.png')

"Step 5: Click on button store -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_store'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on button store - Navigate to page store.png')

"Step 6: Click on button signIn"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_signIn'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on button signIn.png')

"Step 7: Click on item signIn2 -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/item_signIn2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on item signIn2 - Navigate to page login.png')

"Step 8: Click on button signInWithAzureAd"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_login/button_signInWithAzureAd'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on button signInWithAzureAd.png')

"Step 9: Click on button signInWithAzureAd -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_login/button_signInWithAzureAd'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on button signInWithAzureAd - Navigate to page .png')

"Step 10: Click on button cart -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_cart'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on button cart - Navigate to page checkout.png')

"Step 11: Click on div productDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/div_productDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on div productDetails.png')

"Step 12: Click on button store -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_store'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on button store - Navigate to page store.png')

"Step 13: Click on button addToCart (addToCart)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart', ['button_addToCart_nth_1': button_addToCart_nth_1]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on button addToCart addToCart.png')

"Step 14: Click on span productCardButton"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/span_productCardButton'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on span productCardButton.png')

"Step 15: Click on button checkout -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_checkout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on button checkout - Navigate to page checkout.png')

"Step 16: Click on div productDetails2 -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/div_productDetails2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on div productDetails2 - Navigate to page store.png')

"Step 17: Click on span productCategories (mice) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/span_productCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/span_productCategories', ['span_productCategories_divNthChild_1': span_productCategories_divNthChild_1]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on span productCategories mice - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Add Items to Cart and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}