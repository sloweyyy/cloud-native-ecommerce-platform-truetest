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
	WebUI.setViewPortSize(1057, 1134)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://main.d2rkndqh64e9mb.amplifyapp.com"

TrueTestScripts.navigate("/")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /login"

TrueTestScripts.navigate("login")

"Step 4: Click on button signInWithAzureAd2 -> Navigate to page '/admin'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_login/button_signInWithAzureAd2'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 4-Click on button signInWithAzureAd2 - Navigate to page admin.png')

"Step 5: Click on button manageProducts -> Navigate to page '/admin/products'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin/button_manageProducts'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 5-Click on button manageProducts - Navigate to page adminproducts.png')

"Step 6: Click on link productLinks (product4)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_admin_products/link_productLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_admin_products/link_productLinks', ['link_productLinks_liTitle_1': link_productLinks_liTitle]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 6-Click on link productLinks product4.png')

"Step 7: Click on span object -> Navigate to page '/admin/products/*/edit'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products/span_object'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 7-Click on span object - Navigate to page adminproductsedit.png')

"Step 8: Click on input price"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_edit/input_price'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 8-Click on input price.png')

"Step 9: Click on span msi"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_edit/span_msi'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 9-Click on span msi.png')

"Step 10: Click on div acers"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_edit/div_acers'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 10-Click on div acers.png')

"Step 11: Click on button updateProduct -> Navigate to page '/admin/products'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_edit/button_updateProduct'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 11-Click on button updateProduct - Navigate to page adminproducts.png')

"Step 12: Click on item dashboard -> Navigate to page '/admin'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products/item_dashboard'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 12-Click on item dashboard - Navigate to page admin.png')

"Step 13: Click on span phoneWirelessMouse -> Navigate to page '/admin/activities'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin/span_phoneWirelessMouse'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 13-Click on span phoneWirelessMouse - Navigate to page adminactivities.png')

"Step 14: Click on item dashboard -> Navigate to page '/admin'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_activities/item_dashboard'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 14-Click on item dashboard - Navigate to page admin.png')

"Step 15: Click on div phoneWirelessMouse -> Navigate to page '/admin/activities'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin/div_phoneWirelessMouse'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 15-Click on div phoneWirelessMouse - Navigate to page adminactivities.png')

"Step 16: Click on item dashboard -> Navigate to page '/admin'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_activities/item_dashboard'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 16-Click on item dashboard - Navigate to page admin.png')

"Step 17: Click on div productUpdated -> Navigate to page '/admin/activities'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin/div_productUpdated'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 17-Click on div productUpdated - Navigate to page adminactivities.png')

"Step 18: Click on input checkbox"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_activities/input_checkbox'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 18-Click on input checkbox.png')

"Step 19: Click on input checkbox"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_activities/input_checkbox'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 19-Click on input checkbox.png')

"Step 20: Click on button export"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_activities/button_export'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 20-Click on button export.png')

"Step 21: Click on span adminLabels (codeLabel)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_admin_activities/span_adminLabels"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_admin_activities/span_adminLabels', ['span_adminLabels_internalLabel_1': span_adminLabels_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 21-Click on span adminLabels codeLabel.png')

"Step 22: Click on label excel"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_activities/label_excel'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 22-Click on label excel.png')

"Step 23: Click on span adminLabels (codeLabel)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_admin_activities/span_adminLabels"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_admin_activities/span_adminLabels', ['span_adminLabels_internalLabel_1': span_adminLabels_internalLabel_1]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 23-Click on span adminLabels codeLabel.png')

"Step 24: Click on label csv"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_activities/label_csv'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 24-Click on label csv.png')

"Step 25: Click on input activitiesFile"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_activities/input_activitiesFile'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 25-Click on input activitiesFile.png')

"Step 26: Click on div exportOptions"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_activities/div_exportOptions'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 26-Click on div exportOptions.png')

"Step 27: Click on span adminLabels (fileExcel)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_admin_activities/span_adminLabels"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_admin_activities/span_adminLabels', ['span_adminLabels_internalLabel_1': span_adminLabels_internalLabel_2]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 27-Click on span adminLabels fileExcel.png')

"Step 28: Click on label csv"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_activities/label_csv'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 28-Click on label csv.png')

"Step 29: Click on label json"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_activities/label_json'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 29-Click on label json.png')

"Step 30: Click on span close"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_activities/span_close'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 30-Click on span close.png')

"Step 31: Click on button adminActions (statistics)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_admin_activities/button_adminActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_admin_activities/button_adminActions', ['button_adminActions_buttonInternalHasText_1': button_adminActions_buttonInternalHasText]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 31-Click on button adminActions statistics.png')

"Step 32: Click on button adminActions (tableView)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_admin_activities/button_adminActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_admin_activities/button_adminActions', ['button_adminActions_buttonInternalHasText_1': button_adminActions_buttonInternalHasText_1]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 32-Click on button adminActions tableView.png')

"Step 33: Click on item dashboard -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_activities/item_dashboard'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 33-Click on item dashboard - Navigate to page .png')

"Step 34: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-Update Product Information and Export Activities_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}