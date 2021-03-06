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
import websocket.DESUtil as DES

def totalTest = 0
def totalFail = 0

for (int i = 1; i <= 1; i++) {
    WS.sendRequestAndVerify(findTestObject('Member/Get oauth token (for others RESTFUL API)', [('env') : env_app, ('account') : account
                , ('password') : password]))
    WS.sendRequestAndVerify(findTestObject('Member/Get WS Token', [('env') : env_app, ('access_token') : GlobalVariable.Access_Token]))
	
	// generate websocket auth
	def roomid = roomid
    def user_uid = user_uid
    def ws_token = GlobalVariable.WS_Token
    def decoder = Base64.getDecoder()
    def encoder = Base64.getEncoder()
    def texts = '{"token": ' + ws_token + ',' + '"roomId": ' + roomid + ',' + '"id": ' + user_uid + '}'
    byte [] encode_key = texts.getBytes("UTF-8")
    String encodedauth = encoder.encodeToString(encode_key);
    GlobalVariable.EncodedAuth = encodedauth
	
	// send message
	def desturi = env_ws + encodedauth
	def msg = message
//	def jsonSlurper = new groovy.json.JsonSlurper()
//	def request = jsonSlurper.parseText(msg)
	WSC.sendMessage(desturi, msg)
	
	// Decode response
	def reply = GlobalVariable.WS_Reply
	def key = '123456789012345678901234'
	def iv = '45841036'
	def bytekey = key.getBytes()
	def byteiv = iv.getBytes()
	def bytetext = reply.getBytes()
	DES.des3DecodeCBC(bytekey, byteiv, bytetext)
	println(GlobalVariable.DecMsg)
	totalTest = i
	
	if (GlobalVariable.DecMsg == '{"version":"1.0.62"}') {
		totalFail = (totalFail + 1)
	} 
}

println(totalTest)
println(totalFail)