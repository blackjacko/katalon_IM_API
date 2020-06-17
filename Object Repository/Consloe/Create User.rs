<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create User</name>
   <tag></tag>
   <elementGuidId>f2e6e3c4-afd2-4053-8c71-347e4d5ee753</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;belongTo\&quot;: \&quot;${oid}\&quot;,\n  \&quot;originalId\&quot;: \&quot;${uid}\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${refresh_token}</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://${env}/im/user</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.console_admin</defaultValue>
      <description></description>
      <id>64cbfde1-e0ed-4b8e-9d3d-a510ff53c166</id>
      <masked>false</masked>
      <name>env</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.refresh_token</defaultValue>
      <description></description>
      <id>83493e26-d18f-4325-9f8b-12c4341e90e0</id>
      <masked>false</masked>
      <name>refresh_token</name>
   </variables>
   <variables>
      <defaultValue>'699'</defaultValue>
      <description></description>
      <id>dea649e0-e7da-43af-9343-90c77fa61e2d</id>
      <masked>false</masked>
      <name>oid</name>
   </variables>
   <variables>
      <defaultValue>'403022663557123'</defaultValue>
      <description></description>
      <id>1afbedef-14e0-4105-b3c9-25b97f265387</id>
      <masked>false</masked>
      <name>uid</name>
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
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
