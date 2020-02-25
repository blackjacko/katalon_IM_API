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
def enctext = '{"type":1,"roomId":110,"parentRoomId":null,"cmd":11,"from":740,"to":110,"msgType":0,"createTime":1582275309000,"avatarText":"Jack15","content":"Send message by Jackkkkkkkk"}'
def dectext = "pbcF8dX4vwbQk79TwnUt5jDBt54NBH/T7GVuQT860a0keViUm6ABT4Ui2cFpHfburSLvVvalGj5dZd4HhdKMAsYOUdLJWRV3SpZYX38mdb+jdt/CqKzPD6wVPSjV4PHYrb+L0SUyetpcP9Sj+Wjd2ckH3yH6oll3wjIwHuMZsWDIIsPtra/dv2LNA4SYNUhp6VOqs4P+ILs="
def bytekey = key.getBytes()
def byteiv = iv.getBytes()
def byteenctext = enctext.getBytes()
def bytedectext = dectext.getBytes()

DES.des3EncodeCBC(bytekey, byteiv, byteenctext)
DES.des3DecodeCBC(bytekey, byteiv, bytedectext)
println(GlobalVariable.EncMsg)
println(GlobalVariable.DecMsg)