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
import websocket.WSConnect as WSC
import com.velocitylight.jetty.client.ToUpperClientSocket

WS.sendRequestAndVerify(findTestObject('Member/Login ByIdentityCode', [('env') : env_app, ('identityCode') : identity_code]))

WS.sendRequestAndVerify(findTestObject('Member/Get oauth token (for others RESTFUL API)', [('env') : env_app
            , ('encodedkey') : GlobalVariable.EncodedKey]))

WS.sendRequestAndVerify(findTestObject('Member/Get WS Token', [('env') : env_app, ('access_token') : GlobalVariable.Access_Token]))


def desturi = env_ws + GlobalVariable.EncodedAuth
def msg = '{"cmd": 11,"from": 39,"to": 36,"createTime": 1576562393,"type": 1,"roomId": 27,"content": "send message from Jack by Katalon"}'
def jsonSlurper = new groovy.json.JsonSlurper()
def request = jsonSlurper.parseText(msg)

websocket.WSConnect.sendMessage(desturi, msg)

def response = jsonSlurper.parseText(GlobalVariable.WS_Reply)

assert request.content == response.content