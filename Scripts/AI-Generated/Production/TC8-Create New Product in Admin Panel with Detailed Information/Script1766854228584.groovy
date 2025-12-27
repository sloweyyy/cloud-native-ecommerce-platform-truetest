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
	WebUI.setViewPortSize(953, 1134)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /admin"

TrueTestScripts.navigate("admin")

"Step 2: Click on item products -> Navigate to page '/admin/products'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin/item_products'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 2-Click on item products - Navigate to page adminproducts.png')

"Step 3: Click on button createNewProduct -> Navigate to page '/admin/products/new'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products/button_createNewProduct'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 3-Click on button createNewProduct - Navigate to page adminproductsnew.png')

"Step 4: Click on label productName"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/label_productName'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on label productName.png')

"Step 5: Click on input productName"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_productName'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on input productName.png')

"Step 6: Enter input value in input productName"

WebUI.setText(findTestObject('AI-Generated/Production/Page_admin_products_new/input_productName'), input_productName)

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Enter input value in input productName.png')

"Step 7: Click on input summary"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_summary'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on input summary.png')

"Step 8: Click on label summary"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/label_summary'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Click on label summary.png')

"Step 9: Click on input summary"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_summary'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on input summary.png')

"Step 10: Enter input value in input summary"

WebUI.setText(findTestObject('AI-Generated/Production/Page_admin_products_new/input_summary'), input_summary)

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 10-Enter input value in input summary.png')

"Step 11: Click on label description"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/label_description'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 11-Click on label description.png')

"Step 12: Click on textarea description"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/textarea_description'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 12-Click on textarea description.png')

"Step 13: Enter input value in textarea description"

WebUI.setText(findTestObject('AI-Generated/Production/Page_admin_products_new/textarea_description'), textarea_description)

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 13-Enter input value in textarea description.png')

"Step 14: Click on input price"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_price'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 14-Click on input price.png')

"Step 15: Enter input value in input price"

WebUI.setText(findTestObject('AI-Generated/Production/Page_admin_products_new/input_price'), input_price)

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 15-Enter input value in input price.png')

"Step 16: Click on input brand"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_brand'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 16-Click on input brand.png')

"Step 17: Click on div productBrands (acers)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_admin_products_new/div_productBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_admin_products_new/div_productBrands', ['div_productBrands_divTitle_1': div_productBrands_divTitle]))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 17-Click on div productBrands acers.png')

"Step 18: Click on input type"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_type'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 18-Click on input type.png')

"Step 19: Click on div productBrands (keyboards)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_admin_products_new/div_productBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_admin_products_new/div_productBrands', ['div_productBrands_divTitle_1': div_productBrands_divTitle_1]))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 19-Click on div productBrands keyboards.png')

"Step 20: Click on div productImageLabel"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/div_productImageLabel'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 20-Click on div productImageLabel.png')

"Step 21: Click on span uploadImage"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/span_uploadImage'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 21-Click on span uploadImage.png')

"Step 22: Click on div pricingClassification"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/div_pricingClassification'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 22-Click on div pricingClassification.png')

"Step 23: Click on span acers"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/span_acers'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 23-Click on span acers.png')

"Step 24: Click on item brandsAndTypes -> Navigate to page '/admin/brands-types'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/item_brandsAndTypes'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 24-Click on item brandsAndTypes - Navigate to page adminbrands-types.png')

"Step 25: Click on div typesTab"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_brands_types/div_typesTab'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 25-Click on div typesTab.png')

"Step 26: Click on div brandsTab"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_brands_types/div_brandsTab'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 26-Click on div brandsTab.png')

"Step 27: Click on input brandName"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_brands_types/input_brandName'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 27-Click on input brandName.png')

"Step 28: Enter input value in input brandName"

WebUI.setText(findTestObject('AI-Generated/Production/Page_admin_brands_types/input_brandName'), input_brandName)

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 28-Enter input value in input brandName.png')

"Step 29: Click on button addBrand"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_brands_types/button_addBrand'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 29-Click on button addBrand.png')

"Step 30: Click on item dashboard -> Navigate to page '/admin'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_brands_types/item_dashboard'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 30-Click on item dashboard - Navigate to page admin.png')

"Step 31: Click on item products -> Navigate to page '/admin/products'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin/item_products'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 31-Click on item products - Navigate to page adminproducts.png')

"Step 32: Click on button createNewProduct -> Navigate to page '/admin/products/new'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products/button_createNewProduct'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 32-Click on button createNewProduct - Navigate to page adminproductsnew.png')

"Step 33: Click on span upload"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/span_upload'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 33-Click on span upload.png')

"Step 34: Click on input productName"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_productName'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 34-Click on input productName.png')

"Step 35: Click on label productName"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/label_productName'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 35-Click on label productName.png')

"Step 36: Click on label productName"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/label_productName'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 36-Click on label productName.png')

"Step 37: Click on input productName"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_productName'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 37-Click on input productName.png')

"Step 38: Enter input value in input productName"

WebUI.setText(findTestObject('AI-Generated/Production/Page_admin_products_new/input_productName'), input_productName_1)

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 38-Enter input value in input productName.png')

"Step 39: Click on label summary"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/label_summary'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 39-Click on label summary.png')

"Step 40: Click on input summary"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_summary'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 40-Click on input summary.png')

"Step 41: Enter input value in input summary"

WebUI.setText(findTestObject('AI-Generated/Production/Page_admin_products_new/input_summary'), input_summary_1)

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 41-Enter input value in input summary.png')

"Step 42: Click on div productDescription"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/div_productDescription'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 42-Click on div productDescription.png')

"Step 43: Click on label description"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/label_description'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 43-Click on label description.png')

"Step 44: Click on label description"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/label_description'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 44-Click on label description.png')

"Step 45: Click on textarea description"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/textarea_description'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 45-Click on textarea description.png')

"Step 46: Enter input value in textarea description"

WebUI.setText(findTestObject('AI-Generated/Production/Page_admin_products_new/textarea_description'), textarea_description_1)

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 46-Enter input value in textarea description.png')

"Step 47: Click on input price"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_price'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 47-Click on input price.png')

"Step 48: Enter input value in input price"

WebUI.setText(findTestObject('AI-Generated/Production/Page_admin_products_new/input_price'), input_price_1)

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 48-Enter input value in input price.png')

"Step 49: Click on input brand"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_brand'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 49-Click on input brand.png')

"Step 50: Click on div productBrands (brandKeychron)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_admin_products_new/div_productBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_admin_products_new/div_productBrands', ['div_productBrands_divTitle_1': div_productBrands_divTitle_2]))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 50-Click on div productBrands brandKeychron.png')

"Step 51: Click on input type"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/input_type'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 51-Click on input type.png')

"Step 52: Click on div productBrands (keyboards)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_admin_products_new/div_productBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_admin_products_new/div_productBrands', ['div_productBrands_divTitle_1': div_productBrands_divTitle_3]))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 52-Click on div productBrands keyboards.png')

"Step 53: Click on span uploadImage"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/span_uploadImage'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 53-Click on span uploadImage.png')

"Step 54: Click on span eyeIcon"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/span_eyeIcon'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 54-Click on span eyeIcon.png')

"Step 55: Click on button createProduct -> Navigate to page '/admin/products'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products_new/button_createProduct'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 55-Click on button createProduct - Navigate to page adminproducts.png')

"Step 56: Click on link product3"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products/link_product3'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 56-Click on link product3.png')

"Step 57: Click on td productName"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products/td_productName'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 57-Click on td productName.png')

"Step 58: Click on td productName"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products/td_productName'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 58-Click on td productName.png')

"Step 59: Click on strong productName"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products/strong_productName'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 59-Click on strong productName.png')

"Step 60: Click on div productImageMask -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_admin_products/div_productImageMask'))

// WebUI.takeScreenshot(reportLocation + '/TC8/Step 60-Click on div productImageMask - Navigate to page .png')

"Step 61: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Create New Product in Admin Panel with Detailed Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}