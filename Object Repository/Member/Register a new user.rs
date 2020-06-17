<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Register a new user</name>
   <tag></tag>
   <elementGuidId>82c13b29-3671-43ea-af53-25b50c98bbcc</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;account\&quot;: \&quot;${account}\&quot;,\n  \&quot;password\&quot;: \&quot;12345678\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${env}/im/nuser/register</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.APP_Member</defaultValue>
      <description></description>
      <id>2c52dbd3-5156-4dbf-9abb-51467cb5468d</id>
      <masked>false</masked>
      <name>env</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Account</defaultValue>
      <description></description>
      <id>f2d68fce-6b12-419a-9b5b-0eab7a169a42</id>
      <masked>false</masked>
      <name>account</name>
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
def userid = response_body.data.userId
GlobalVariable.UserId = userid</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
