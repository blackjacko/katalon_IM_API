<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>3_Get oauth token with params</name>
   <tag></tag>
   <elementGuidId>b9d3fc9a-26ce-4c4c-8671-163b9eebfe7f</elementGuidId>
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
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://${app}/oauth/token?grant_type=password&amp;password=a123456789&amp;username=${encodedKey}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.app</defaultValue>
      <description></description>
      <id>bf64d759-1ced-4d7d-b01d-4721c0ec7834</id>
      <masked>false</masked>
      <name>app</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.encodedKey</defaultValue>
      <description></description>
      <id>8dc623c8-7d06-4763-8b69-a90477a688ba</id>
      <masked>false</masked>
      <name>encodedKey</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
