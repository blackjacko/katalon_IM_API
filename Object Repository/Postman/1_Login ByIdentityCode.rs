<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>1_Login ByIdentityCode</name>
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
   <restUrl>http://${app}/im/user/getByIdentityCode/${identityCode}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.app</defaultValue>
      <description></description>
      <id>aa4c50b8-3dbf-4520-9af4-5d53cbfd33fb</id>
      <masked>false</masked>
      <name>app</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.identityCode</defaultValue>
      <description></description>
      <id>1ffe4b2e-f6ab-4dc7-97af-605902bfee91</id>
      <masked>false</masked>
      <name>identityCode</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>