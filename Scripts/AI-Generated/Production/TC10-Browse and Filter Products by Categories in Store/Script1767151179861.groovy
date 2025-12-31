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

"Step 4: Click on button allCategories"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_allCategories'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 4-Click on button allCategories.png')

"Step 5: Click on item keyboards -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/item_keyboards'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 5-Click on item keyboards - Navigate to page store.png')

"Step 6: Click on span selectionSearch"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/span_selectionSearch'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 6-Click on span selectionSearch.png')

"Step 7: Click on div productCategories (acer)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/div_productCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/div_productCategories', ['div_productCategories_divTitle_1': div_productCategories_divTitle]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 7-Click on div productCategories acer.png')

"Step 8: Click on span productNames (acer)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/span_productNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/span_productNames', ['span_productNames_spanTitle_1': span_productNames_spanTitle]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 8-Click on span productNames acer.png')

"Step 9: Click on div productCategories (asus)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/div_productCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/div_productCategories', ['div_productCategories_divTitle_1': div_productCategories_divTitle_1]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 9-Click on div productCategories asus.png')

"Step 10: Click on span productNames (asus)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/span_productNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/span_productNames', ['span_productNames_spanTitle_1': span_productNames_spanTitle_1]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 10-Click on span productNames asus.png')

"Step 11: Click on div productCategories (hp)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/div_productCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/div_productCategories', ['div_productCategories_divTitle_1': div_productCategories_divTitle_2]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 11-Click on div productCategories hp.png')

"Step 12: Click on span productNames (keyboards)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/span_productNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/span_productNames', ['span_productNames_spanTitle_1': span_productNames_spanTitle_2]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 12-Click on span productNames keyboards.png')

"Step 13: Click on div brandCategories (monitors)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/div_brandCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/div_brandCategories', ['div_brandCategories_divTitle_1': div_brandCategories_divTitle]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 13-Click on div brandCategories monitors.png')

"Step 14: Click on span productNames (hp)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/span_productNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/span_productNames', ['span_productNames_spanTitle_1': span_productNames_spanTitle_3]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 14-Click on span productNames hp.png')

"Step 15: Click on div productCategories (acer)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/div_productCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/div_productCategories', ['div_productCategories_divTitle_1': div_productCategories_divTitle_3]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 15-Click on div productCategories acer.png')

"Step 16: Click on span productNames (monitors)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/span_productNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/span_productNames', ['span_productNames_spanTitle_1': span_productNames_spanTitle_4]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 16-Click on span productNames monitors.png')

"Step 17: Click on div productCategories (miceCategory)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/div_productCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/div_productCategories', ['div_productCategories_divTitle_1': div_productCategories_divTitle_4]))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 17-Click on div productCategories miceCategory.png')

"Step 18: Click on span clearSelection -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/span_clearSelection'))

// WebUI.takeScreenshot(reportLocation + '/TC10/Step 18-Click on span clearSelection - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Browse and Filter Products by Categories in Store_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}