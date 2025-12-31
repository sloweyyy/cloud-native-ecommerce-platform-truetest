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
	WebUI.setViewPortSize(2056, 1145)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://main.d2rkndqh64e9mb.amplifyapp.com"

TrueTestScripts.navigate("/")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /store"

TrueTestScripts.navigate("store")

"Step 4: Click on button signIn2"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_signIn2'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 4-Click on button signIn2.png')

"Step 5: Click on list welcomeMessage"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/list_welcomeMessage'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 5-Click on list welcomeMessage.png')

"Step 6: Click on item signIn2 -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/item_signIn2'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 6-Click on item signIn2 - Navigate to page login.png')

"Step 7: Click on button signInWithAzureAd3 -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_login/button_signInWithAzureAd3'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 7-Click on button signInWithAzureAd3 - Navigate to page .png')

"Step 8: Click on button store2 -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_store2'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 8-Click on button store2 - Navigate to page store.png')

"Step 9: Click on span productCardButton"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/span_productCardButton'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 9-Click on span productCardButton.png')

"Step 10: Click on button addToCart (addToCart10)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart_1', ['button_addToCart_nth_1': button_addToCart_nth]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 10-Click on button addToCart addToCart10.png')

"Step 11: Click on button addToCart (addToCart11)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart_1', ['button_addToCart_nth_1': button_addToCart_nth_1]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 11-Click on button addToCart addToCart11.png')

"Step 12: Click on button checkout3 -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_checkout3'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 12-Click on button checkout3 - Navigate to page checkout.png')

"Step 13: Click on button delete"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_delete'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 13-Click on button delete.png')

"Step 14: Click on button delete"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_delete'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 14-Click on button delete.png')

"Step 15: Click on button delete2"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_delete2'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 15-Click on button delete2.png')

"Step 16: Click on div cartEmptyMessage"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/div_cartEmptyMessage'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 16-Click on div cartEmptyMessage.png')

"Step 17: Click on button backToShopping -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_backToShopping'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 17-Click on button backToShopping - Navigate to page store.png')

"Step 18: Click on button addToCart (addToCart12)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart_1', ['button_addToCart_nth_1': button_addToCart_nth_2]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 18-Click on button addToCart addToCart12.png')

"Step 19: Click on button addToCart (addToCart10)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart_1', ['button_addToCart_nth_1': button_addToCart_nth_3]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 19-Click on button addToCart addToCart10.png')

"Step 20: Click on button checkout3 -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_checkout3'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 20-Click on button checkout3 - Navigate to page checkout.png')

"Step 21: Click on span deleteIcon"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/span_deleteIcon'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 21-Click on span deleteIcon.png')

"Step 22: Click on span deleteIcon"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/span_deleteIcon'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 22-Click on span deleteIcon.png')

"Step 23: Click on span deleteIcon"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/span_deleteIcon'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 23-Click on span deleteIcon.png')

"Step 24: Click on span deleteIcons (delete)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_checkout/span_deleteIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_checkout/span_deleteIcons', ['span_deleteIcons_mfeCheckout_1': span_deleteIcons_mfeCheckout]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 24-Click on span deleteIcons delete.png')

"Step 25: Click on button backToShopping -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_backToShopping'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 25-Click on button backToShopping - Navigate to page store.png')

"Step 26: Click on button addToCart (addToCart12)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart_1', ['button_addToCart_nth_1': button_addToCart_nth_4]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 26-Click on button addToCart addToCart12.png')

"Step 27: Click on div subtotalCheckout"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/div_subtotalCheckout'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 27-Click on div subtotalCheckout.png')

"Step 28: Click on button checkout3 -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_checkout3'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 28-Click on button checkout3 - Navigate to page checkout.png')

"Step 29: Click on span deleteIcon"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/span_deleteIcon'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 29-Click on span deleteIcon.png')

"Step 30: Click on span deleteIcon"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/span_deleteIcon'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 30-Click on span deleteIcon.png')

"Step 31: Click on span deleteIcons (deleteIcon2)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_checkout/span_deleteIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_checkout/span_deleteIcons', ['span_deleteIcons_mfeCheckout_1': span_deleteIcons_mfeCheckout_1]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 31-Click on span deleteIcons deleteIcon2.png')

"Step 32: Click on button backToShopping -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_backToShopping'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 32-Click on button backToShopping - Navigate to page store.png')

"Step 33: Click on button addToCart (addToCart10)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart_1', ['button_addToCart_nth_1': button_addToCart_nth_5]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 33-Click on button addToCart addToCart10.png')

"Step 34: Click on button checkout3 -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_checkout3'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 34-Click on button checkout3 - Navigate to page checkout.png')

"Step 35: Click on span deleteIcons (deleteIcon3)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_checkout/span_deleteIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_checkout/span_deleteIcons', ['span_deleteIcons_mfeCheckout_1': span_deleteIcons_mfeCheckout_2]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 35-Click on span deleteIcons deleteIcon3.png')

"Step 36: Click on button backToShopping -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout/button_backToShopping'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 36-Click on button backToShopping - Navigate to page store.png')

"Step 37: Click on button addToCart (addToCart13) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/button_addToCart_1', ['button_addToCart_nth_1': button_addToCart_nth_6]))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 37-Click on button addToCart addToCart13 - Navigate to page .png')

"Step 38: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC25-Add and Remove Items from Cart with Multiple Checkouts_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}