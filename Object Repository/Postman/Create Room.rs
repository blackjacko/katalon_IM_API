<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Room</name>
   <tag></tag>
   <elementGuidId>20a61814-2f0d-4775-8334-0f5f208b049b</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;members\&quot;: [\n        784\n    ],\n    \&quot;platformId\&quot;: 0,\n    \&quot;type\&quot;: 1,\n    \&quot;name\&quot;: \&quot;QQ哦\u0026iPhonePlus\&quot;,\n    \&quot;title\&quot;: \&quot;QQ哦\&quot;,\n    \&quot;userId\&quot;: 786,\n    \&quot;needInviteCode\&quot;: true,\n    \&quot;needVerify\&quot;: true,\n    \&quot;openStatus\&quot;: \&quot;1\&quot;,\n    \&quot;inviteCode\&quot;: \&quot;\&quot;\n}&quot;,
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
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://${app}/im/room/createRoom</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.app</defaultValue>
      <description></description>
      <id>5388ef9e-744d-4aba-880e-960a5f2e7fa0</id>
      <masked>false</masked>
      <name>app</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
