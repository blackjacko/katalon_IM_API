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
import com.velocitylight.jetty.client.WebSocketClientMain
import com.velocitylight.jetty.client.ToUpperClientSocket
import websocket.WS


def desturi = 'ws://falimsocket.bahdie4ze.com/?auth=ew0KInRva2VuIjogImV5SmhiR2NpT2lKSVV6VXhNaUo5LmV5SnpkV0lpT2lKVWFIVWdTbUZ1SURBNUlERTNPak16T2pRd0lFTlRWQ0F5TURJd0luMC4wYVJhU19abThNd3VhekEwQkh2TW13XzFJcEV3bnlVamJsUTRmaGlLbHJsMy1Dd1pRd2tpSEdGN0ROZUwwOTQ3RXlISTdoUHpOVk1KM0l6SURsMGVDdyI6IDE1MywNCiJpZCI6IDcxNQ0KfQ=='
def text = '{"cmd":11,"from":39,"to":20,"msgType":0,"createTime":1576562393,"type":3,"roomId":20,"avatarText":"Jack","parentRoomId":19,"content":"send message from Jack by Katalon"}'
websocket.WS.main(desturi, text)