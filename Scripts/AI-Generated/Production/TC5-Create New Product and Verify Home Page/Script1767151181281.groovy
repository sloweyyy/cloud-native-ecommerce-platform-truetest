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
	WebUI.setViewPortSize(1058, 1134)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://main.d2rkndqh64e9mb.amplifyapp.com"

TrueTestScripts.navigate("/")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /"

TrueTestScripts.navigate("/")

"Step 4: Click on button store2 -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_store2'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on button store2 - Navigate to page store.png')

"Step 5: Click on button signIn"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_signIn'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on button signIn.png')

"Step 6: Click on item signIn -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/item_signIn'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on item signIn - Navigate to page login.png')

"Step 7: Click on button signInWithAzureAd3 -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_login/button_signInWithAzureAd3'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on button signInWithAzureAd3 - Navigate to page .png')

"Step 8: Click on button store2 -> Navigate to page '/store'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_store2'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on button store2 - Navigate to page store.png')

"Step 9: Click on input search"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/input_search'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Click on input search.png')

"Step 10: Click on div brandCategories (brandAcer)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_store/div_brandCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_store/div_brandCategories', ['div_brandCategories_divTitle_1': div_brandCategories_divTitle]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 10-Click on div brandCategories brandAcer.png')

"Step 11: Click on button viewDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_viewDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 11-Click on button viewDetails.png')

"Step 12: Click on button viewDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_viewDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 12-Click on button viewDetails.png')

"Step 13: Click on button backToStore"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_backToStore'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 13-Click on button backToStore.png')

"Step 14: Click on button viewDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_viewDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 14-Click on button viewDetails.png')

"Step 15: Click on button backToStore"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_backToStore'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 15-Click on button backToStore.png')

"Step 16: Click on item product2"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/item_product2'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 16-Click on item product2.png')

"Step 17: Click on span default"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/span_default'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 17-Click on span default.png')

"Step 18: Click on span default"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/span_default'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 18-Click on span default.png')

"Step 19: Click on button home -> Navigate to page '/admin'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_store/button_home'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 19-Click on button home - Navigate to page admin.png')

"Step 20: Click on button createNewProduct -> Navigate to page '/admin/products/new'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin/button_createNewProduct'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 20-Click on button createNewProduct - Navigate to page adminproductsnew.png')

"Step 21: Click on input productName"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_productName'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 21-Click on input productName.png')

"Step 22: Click on div productName"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/div_productName'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 22-Click on div productName.png')

"Step 23: Click on input productName"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_productName'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 23-Click on input productName.png')

"Step 24: Enter input value in input productName"

WebUI.setText(findTestObject('AI-Generated/Production/Page_admin_products_new/input_productName'), input_productName)

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 24-Enter input value in input productName.png')

"Step 25: Click on input summary"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_summary'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 25-Click on input summary.png')

"Step 26: Enter input value in input summary"

WebUI.setText(findTestObject('AI-Generated/Production/Page_admin_products_new/input_summary'), input_summary)

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 26-Enter input value in input summary.png')

"Step 27: Click on textarea description"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/textarea_description'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 27-Click on textarea description.png')

"Step 28: Click on input summary"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_summary'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 28-Click on input summary.png')

"Step 29: Enter input value in input summary"

WebUI.setText(findTestObject('AI-Generated/Production/Page_admin_products_new/input_summary'), input_summary_1)

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 29-Enter input value in input summary.png')

"Step 30: Click on textarea description"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/textarea_description'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 30-Click on textarea description.png')

"Step 31: Enter input value in textarea description"

WebUI.setText(findTestObject('AI-Generated/Production/Page_admin_products_new/textarea_description'), textarea_description)

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 31-Enter input value in textarea description.png')

"Step 32: Click on input summary"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_summary'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 32-Click on input summary.png')

"Step 33: Click on input productName"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_productName'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 33-Click on input productName.png')

"Step 34: Click on div productDescription"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/div_productDescription'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 34-Click on div productDescription.png')

"Step 35: Click on input productName"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_productName'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 35-Click on input productName.png')

"Step 36: Enter input value in input productName"

WebUI.setText(findTestObject('AI-Generated/Production/Page_admin_products_new/input_productName'), input_productName_1)

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 36-Enter input value in input productName.png')

"Step 37: Click on label summary"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/label_summary'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 37-Click on label summary.png')

"Step 38: Click on input summary"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_summary'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 38-Click on input summary.png')

"Step 39: Enter input value in input summary"

WebUI.setText(findTestObject('AI-Generated/Production/Page_admin_products_new/input_summary'), input_summary_2)

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 39-Enter input value in input summary.png')

"Step 40: Click on label description"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/label_description'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 40-Click on label description.png')

"Step 41: Click on textarea description"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/textarea_description'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 41-Click on textarea description.png')

"Step 42: Enter input value in textarea description"

WebUI.setText(findTestObject('AI-Generated/Production/Page_admin_products_new/textarea_description'), textarea_description_1)

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 42-Enter input value in textarea description.png')

"Step 43: Click on input price"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_price'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 43-Click on input price.png')

"Step 44: Enter input value in input price"

WebUI.setText(findTestObject('AI-Generated/Production/Page_admin_products_new/input_price'), input_price)

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 44-Enter input value in input price.png')

"Step 45: Click on input brand"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_brand'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 45-Click on input brand.png')

"Step 46: Click on div adminProductCategories (productHp)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_admin_products_new/div_adminProductCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_admin_products_new/div_adminProductCategories', ['div_adminProductCategories_divTitle_1': div_adminProductCategories_divTitle]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 46-Click on div adminProductCategories productHp.png')

"Step 47: Click on input type"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_type'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 47-Click on input type.png')

"Step 48: Click on div adminProductCategories (keyboards)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_admin_products_new/div_adminProductCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_admin_products_new/div_adminProductCategories', ['div_adminProductCategories_divTitle_1': div_adminProductCategories_divTitle_1]))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 48-Click on div adminProductCategories keyboards.png')

"Step 49: Click on span uploadImage"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/span_uploadImage'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 49-Click on span uploadImage.png')

"Step 50: Click on input price"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_price'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 50-Click on input price.png')

"Step 51: Enter input value in input price"

WebUI.setText(findTestObject('AI-Generated/Production/Page_admin_products_new/input_price'), input_price_1)

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 51-Enter input value in input price.png')

"Step 52: Click on span uploadImage"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/span_uploadImage'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 52-Click on span uploadImage.png')

"Step 53: Click on span upload"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/span_upload'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 53-Click on span upload.png')

"Step 54: Click on span uploadImage"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/span_uploadImage'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 54-Click on span uploadImage.png')

"Step 55: Click on div imageUpload"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/div_imageUpload'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 55-Click on div imageUpload.png')

"Step 56: Click on span uploadImage"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/span_uploadImage'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 56-Click on span uploadImage.png')

"Step 57: Click on item brandsAndTypes -> Navigate to page '/admin/brands-types'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/item_brandsAndTypes'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 57-Click on item brandsAndTypes - Navigate to page adminbrands-types.png')

"Step 58: Click on item orders -> Navigate to page '/admin/orders'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_brands_types/item_orders'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 58-Click on item orders - Navigate to page adminorders.png')

"Step 59: Click on item products -> Navigate to page '/admin/products'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_orders/item_products'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 59-Click on item products - Navigate to page adminproducts.png')

"Step 60: Click on item dashboard -> Navigate to page '/admin'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products/item_dashboard'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 60-Click on item dashboard - Navigate to page admin.png')

"Step 61: Click on item products -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin/item_products'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 61-Click on item products - Navigate to page .png')

"Step 62: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Create New Product and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}