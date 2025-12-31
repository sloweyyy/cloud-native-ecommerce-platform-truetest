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

"Step 3: Navigate to /admin"

TrueTestScripts.navigate("admin")

"Step 4: Click on button createNewProduct -> Navigate to page '/admin/products/new'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin/button_createNewProduct'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 4-Click on button createNewProduct - Navigate to page adminproductsnew.png')

"Step 5: Click on input productName"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_productName'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 5-Click on input productName.png')

"Step 6: Enter input value in input productName"

WebUI.setText(findTestObject('AI-Generated/Production/Page_admin_products_new/input_productName'), input_productName)

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 6-Enter input value in input productName.png')

"Step 7: Click on div productDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/div_productDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 7-Click on div productDetails.png')

"Step 8: Click on span characterCount"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/span_characterCount'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 8-Click on span characterCount.png')

"Step 9: Click on input summary"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_summary'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 9-Click on input summary.png')

"Step 10: Click on item products -> Navigate to page '/admin/products'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/item_products'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 10-Click on item products - Navigate to page adminproducts.png')

"Step 11: Click on button createNewProduct -> Navigate to page '/admin/products/new'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products/button_createNewProduct'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 11-Click on button createNewProduct - Navigate to page adminproductsnew.png')

"Step 12: Click on item products -> Navigate to page '/admin/products'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/item_products'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 12-Click on item products - Navigate to page adminproducts.png')

"Step 13: Click on div noProducts"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products/div_noProducts'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 13-Click on div noProducts.png')

"Step 14: Click on item orders -> Navigate to page '/admin/orders'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products/item_orders'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 14-Click on item orders - Navigate to page adminorders.png')

"Step 15: Click on item products -> Navigate to page '/admin/products'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_orders/item_products'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 15-Click on item products - Navigate to page adminproducts.png')

"Step 16: Click on item orders -> Navigate to page '/admin/orders'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products/item_orders'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 16-Click on item orders - Navigate to page adminorders.png')

"Step 17: Click on list mainNavigation"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_orders/list_mainNavigation'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 17-Click on list mainNavigation.png')

"Step 18: Click on main adminOrders -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_orders/main_adminOrders'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 18-Click on main adminOrders - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC14-Create New Product in Admin Panel and Verify_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}