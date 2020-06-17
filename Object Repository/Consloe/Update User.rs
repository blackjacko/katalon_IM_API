<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Update User</name>
   <tag></tag>
   <elementGuidId>524c5904-dccf-40a4-967c-5910d3f2d362</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\r\n  \&quot;belongTo\&quot;: \&quot;string\&quot;,\r\n  \&quot;deviceName\&quot;: \&quot;string\&quot;,\r\n  \&quot;deviceNo\&quot;: 0,\r\n  \&quot;identityCode\&quot;: \&quot;string\&quot;,\r\n  \&quot;lastOnlineIp\&quot;: \&quot;string\&quot;,\r\n  \&quot;lastOnlineTime\&quot;: 0,\r\n  \&quot;level\&quot;: \&quot;string\&quot;,\r\n  \&quot;status\&quot;: 0,\r\n  \&quot;userId\&quot;: 0,\r\n  \&quot;username\&quot;: \&quot;string\&quot;\r\n}&quot;,
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
   <restRequestMethod>PATCH</restRequestMethod>
   <restUrl>http://${app}/im/user</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.app</defaultValue>
      <description></description>
      <id>a0cb1af2-e02a-45a1-90fd-d4c322544028</id>
      <masked>false</masked>
      <name>app</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
