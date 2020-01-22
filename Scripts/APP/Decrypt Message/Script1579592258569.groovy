import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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

def key = "123456789012345678901234"
def iv = "45841036"
def text = "pbcF8dX4vwbQk79TwnUt5jDBt54NBH/TvlGQ8g4InvPB1+tgWZdxy4KvsQlZR3Vj55rPdIbvqJSUuhr8h6LAhrd+hDDHWZB6eWf6IrRDcdqHsqGMWhAXZgFro4p4LrmndgPX9hhL4C4wbAisCX/VcXMcgeNhEv32VWvuwuAR4myhKzy01Ii7sRdFfpkDgM7azBpD7B6Cqxk="
def bytekey = key.getBytes()
def byteiv = iv.getBytes()
def bytetext = text.getBytes()

DES.des3DecodeCBC(bytekey, byteiv, bytetext)
println(GlobalVariable.DecMsg)