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

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on button store - Navigate to page store.png')

"Step 5: Click on button home -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_home'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on button home - Navigate to page .png')

"Step 6: Click on button store -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_store'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on button store - Navigate to page store.png')

"Step 7: Click on div productPrice"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/div_productPrice'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on div productPrice.png')

"Step 8: Click on div viewDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/div_viewDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Click on div viewDetails.png')

"Step 9: Click on button viewDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_viewDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on button viewDetails.png')

"Step 10: Click on span outOfStock"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/span_outOfStock'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 10-Click on span outOfStock.png')

"Step 11: Click on div productDescription"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/div_productDescription'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 11-Click on div productDescription.png')

"Step 12: Click on div quantityActions"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/div_quantityActions'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 12-Click on div quantityActions.png')

"Step 13: Click on div quantitySelector"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/div_quantitySelector'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 13-Click on div quantitySelector.png')

"Step 14: Click on button viewDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_viewDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 14-Click on button viewDetails.png')

"Step 15: Click on span outOfStock"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/span_outOfStock'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 15-Click on span outOfStock.png')

"Step 16: Click on span outOfStock"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/span_outOfStock'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 16-Click on span outOfStock.png')

"Step 17: Click on span outOfStock"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/span_outOfStock'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 17-Click on span outOfStock.png')

"Step 18: Click on div productDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/div_productDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 18-Click on div productDetails.png')

"Step 19: Click on div productDetails -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/div_productDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 19-Click on div productDetails - Navigate to page .png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-View Product Details and Check Availability_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}