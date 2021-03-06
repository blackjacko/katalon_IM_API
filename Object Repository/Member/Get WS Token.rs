<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get WS Token</name>
   <tag></tag>
   <elementGuidId>9465de48-1ac2-4736-8462-21b381f2c5f8</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;parameters&quot;: []
}</httpBodyContent>
   <httpBodyType>form-data</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${access_token}</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://${env}//im/token</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.QAT_APP_Member</defaultValue>
      <description></description>
      <id>ea1fbc7d-2d4d-4efb-980a-e9630fb49a24</id>
      <masked>false</masked>
      <name>env</name>
   </variables>
   <variables>
      <defaultValue>'43d275c3-2e5b-40f5-bc49-34f2ad383470'</defaultValue>
      <description></description>
      <id>4b874cf3-4bdd-4737-93eb-a853d0ac7db3</id>
      <masked>false</masked>
      <name>access_token</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

def result = new groovy.json.JsonSlurper()
def response_body = result.parseText(response.getResponseBodyContent())
def ws_token = response_body.data.token
GlobalVariable.WS_Token = ws_token

//def roomid = GlobalVariable.RoomId
//def user_uid = GlobalVariable.UID
//def decoder = Base64.getDecoder()
//def encoder = Base64.getEncoder()
//
//def texts = '{&quot;token&quot;: ' + ws_token + ',' + '&quot;roomId&quot;: ' + roomid + ',' + '&quot;id&quot;: ' + user_uid + '}'
//println(texts)
//byte [] key = texts.getBytes(&quot;UTF-8&quot;)
//String encodedauth = encoder.encodeToString(key);
//GlobalVariable.EncodedAuth = encodedauth</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
