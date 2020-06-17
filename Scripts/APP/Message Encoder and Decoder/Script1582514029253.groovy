import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testdata.TestDataFactory.getTestDataId
import static com.kms.katalon.core.testdata.TestDataFactory.getTestDataRelativeId
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import websocket.DESUtil as DES
import java.io.File as File
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import java.util.ArrayList as ArrayList

String excelFile01 = 'Data Files\\File01.xlsx'
def key = "123456789012345678901234"
def iv = "45841036"

// Verify Sheet Be Created
String[] ExpectedListSheetFile1 = ['Sheet0','encode_msg']
workbookFile01 = ExcelKeywords.getWorkbook(excelFile01) // get latest workbook File01
assert ExcelKeywords.getSheetNames(workbookFile01) == ExpectedListSheetFile1

def enctext = '{"cmd":13,"roomId":414,"timestamp":1590397964}'
def dectext = "+TvXP6qcahF/64EPQ3w4SVIL0qBrFxi/GQzaS6vFF0LLk6rg3FSJnGfadE3KCet/CCgL2Q9iFu36pS1DuQuYwQL+LFCe2VVcaM84QG0X1teTOCspGpW0Bw1LSvLGuavzYAyc7Sg5N8WjAQj423dJ413xnJArKe+6mBdqEQhqzO7K1OCHqOZI7DlYHmjkFI3wOyPwbd9xVJ7lHBz3QAkhY6IIITK1x6xkKXK4zNBlwCmnRKMDPFFfWW76O5zyAGQVOj5rLtDi/jz8xxDOCf6B3Y2A5z4kqt5Soz4sjvP/q6yyRK2MkXqP5oJ6aCKwgHBqGlRH78laNtF9JNX/AJBm47Y79lZBXAO5KIFcT5Vgz+pFFR8N6iNkFnOaCxWc2nibYyefGQM5Tuw="
def bytekey = key.getBytes()
def byteiv = iv.getBytes()
def byteenctext = enctext.getBytes()
def bytedectext = dectext.getBytes()
def i = row_no as int

DES.des3EncodeCBC(bytekey, byteiv, byteenctext)
String encode_msg = GlobalVariable.EncMsg
DES.des3DecodeCBC(bytekey, byteiv, bytedectext)
println(GlobalVariable.EncMsg)
println(GlobalVariable.DecMsg)

// Write Data to Excel File
workbook01 = ExcelKeywords.getWorkbook(excelFile01)
sheet01 = ExcelKeywords.getExcelSheet(workbook01, 'encode_msg')
ExcelKeywords.setValueToCellByIndex(sheet01, i, 0, encode_msg)

// Save Data of Excel File
ExcelKeywords.saveWorkbook(excelFile01, workbook01)