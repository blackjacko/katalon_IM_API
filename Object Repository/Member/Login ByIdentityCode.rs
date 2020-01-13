<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Login ByIdentityCode</name>
   <tag></tag>
   <elementGuidId>da786ca3-cd7b-42d2-9783-ad852240c48d</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic aW1fbWVtYmVyX2NsaWVudGFwcDoxMjM0NTY=</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>http://${env}/im/user/getByIdentityCode/${identityCode}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.QAT_APP_Member</defaultValue>
      <description></description>
      <id>aa4c50b8-3dbf-4520-9af4-5d53cbfd33fb</id>
      <masked>false</masked>
      <name>env</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.IdentityCode</defaultValue>
      <description></description>
      <id>1ffe4b2e-f6ab-4dc7-97af-605902bfee91</id>
      <masked>false</masked>
      <name>identityCode</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager
import java.util.Base64.Decoder
import java.util.Base64.Encoder

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

def result = new groovy.json.JsonSlurper()
def response_body = result.parseText(response.getResponseBodyContent())
def username = response_body.data.username
GlobalVariable.UserName = username
//println username

def decoder = Base64.getDecoder()
def encoder = Base64.getEncoder()

def texts = GlobalVariable.UserName + &quot;:&quot; + GlobalVariable.IdentityCode
byte [] key = texts.getBytes(&quot;UTF-8&quot;)
String encodedkey = encoder.encodeToString(key);
GlobalVariable.EncodedKey = encodedkey</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
