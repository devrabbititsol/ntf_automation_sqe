package api.notifii.notifiiv20apis.track.apipageclasses; 

public class PackageLoginDataset{

public static final int datasetLength = 6; 

public static String projectName = "notifii";

			/*--------Dataset# Without RecipientID Dataset-----------*/

public static final String datasetHeader1 = "TC_PackageLogIN-Dataset# Without RecipientID";

public static final String datasetResources1 = "track/packageLogin";
public static final int requestType1 = 2;
public static final int bodyType1 = 3;
public static final String apiName1 = "Package Login";

 public static String urlParams1  = "[]";

 public static String headers1  = "[{\"header_id\":1390,"
 + "\"header_value\":\"Bearer $#AUTHENTICATIONTOKEN#$\","
 + "\"dataset_id\":1659,"
 + "\"header_key\":\"authenticationToken\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1392,"
 + "\"header_value\":\"$#USERID#$\","
 + "\"dataset_id\":1659,"
 + "\"header_key\":\"userId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1389,"
 + "\"header_value\":\"$#ACCOUNTID#$\","
 + "\"dataset_id\":1659,"
 + "\"header_key\":\"accountId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1391,"
 + "\"header_value\":\"$#SESSIONID#$\","
 + "\"dataset_id\":1659,"
 + "\"header_key\":\"sessionId\","
 + "\"header_desc\":\"\"}]";

public static final String authenticationData1 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body1  = "{\"raw_text\":\"{\\n\\t\\\"trackingNumber\\\": [123456789],"
 + "\\n\\t\\\"shippingCarrier\\\":\\\"Amazon\\\","
 + "\\n\\t\\\"recipientId\\\": \\\"\\\","
 + "\\n\\t\\\"handlingUrgent\\\": 1,"
 + "\\n\\t\\\"handlingfragile\\\": 1,"
 + "\\n\\t\\\"handlingPerishable\\\": 1,"
 + "\\n\\t\\\"handlingheavy\\\": 1,"
 + "\\n\\t\\\"sender\\\": \\\"\\\","
 + "\\n\\t\\\"serviceType\\\": \\\"\\\","
 + "\\n\\t\\\"packagecondition\\\": \\\"\\\","
 + "\\n\\t\\\"weight\\\": \\\"\\\","
 + "\\n\\t\\\"dimensions\\\": \\\"\\\","
 + "\\n\\t\\\"packageType\\\": \\\"\\\","
 + "\\n\\t\\\"customMessage\\\": \\\"\\\","
 + "\\n\\t\\\"shelf\\\": \\\"\\\","
 + "\\n\\t\\\"tagNumber\\\": 1,"
 + "\\n\\t\\\"ocrTriggered\\\": 1\\n}\","
 + "\"raw_id\":1391,"
 + "\"dataset_id\":1659,"
 + "\"raw_type_id\":3}";

			/*--------Dataset# Valid Details Dataset-----------*/

public static final String datasetHeader2 = "TC_PackageLogIN-Dataset# Valid Details";

public static final String datasetResources2 = "track/packageLogin";
public static final int requestType2 = 2;
public static final int bodyType2 = 3;
public static final String apiName2 = "Package Login";

 public static String urlParams2  = "[]";

 public static String headers2  = "[{\"header_id\":1473,"
 + "\"header_value\":\"Bearer $#AUTHENTICATIONTOKEN#$\","
 + "\"dataset_id\":1658,"
 + "\"header_key\":\"authenticationToken\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1474,"
 + "\"header_value\":\"$#USERID#$\","
 + "\"dataset_id\":1658,"
 + "\"header_key\":\"userId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1475,"
 + "\"header_value\":\"$#ACCOUNTID#$\","
 + "\"dataset_id\":1658,"
 + "\"header_key\":\"accountId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1476,"
 + "\"header_value\":\"$#SESSIONID#$\","
 + "\"dataset_id\":1658,"
 + "\"header_key\":\"sessionId\","
 + "\"header_desc\":\"\"}]";

public static final String authenticationData2 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body2  = "{\"raw_text\":\"{\\n\\t\\\"trackingNumber\\\": [\\\"1234567895\\\"],"
 + "\\n\\t\\\"shippingCarrier\\\":\\\"Amazon\\\","
 + "\\n\\t\\\"recipientId\\\": \\\"3716669\\\","
 + "\\n\\t\\\"handlingUrgent\\\": 1,"
 + "\\n\\t\\\"handlingfragile\\\": 1,"
 + "\\n\\t\\\"handlingPerishable\\\": 1,"
 + "\\n\\t\\\"handlingheavy\\\": 1,"
 + "\\n\\t\\\"sender\\\": \\\"Mi\\\","
 + "\\n\\t\\\"serviceType\\\": \\\"First Class\\\","
 + "\\n\\t\\\"packagecondition\\\": \\\"Appears Fine\\\","
 + "\\n\\t\\\"weight\\\": \\\"\\\","
 + "\\n\\t\\\"dimensions\\\": \\\"\\\","
 + "\\n\\t\\\"packageType\\\": \\\"Box\\\","
 + "\\n\\t\\\"customMessage\\\": \\\"Pick up the package ASAP\\\","
 + "\\n\\t\\\"shelf\\\": \\\"Top Shelf\\\","
 + "\\n\\t\\\"tagNumber\\\": 1,"
 + "\\n\\t\\\"ocrTriggered\\\": 1\\n}\","
 + "\"raw_id\":1409,"
 + "\"dataset_id\":1658,"
 + "\"raw_type_id\":3}";


			/*--------Dataset# Duplicate Tracking Number Dataset-----------*/

public static final String datasetHeader3 = "TC_PackageLogIN-Dataset# Duplicate Tracking Number";

public static final String datasetResources3 = "track/packageLogin";
public static final int requestType3 = 2;
public static final int bodyType3 = 3;
public static final String apiName3 = "Package Login";

 public static String urlParams3  = "[]";

 public static String headers3  = "[{\"header_id\":1477,"
 + "\"header_value\":\"Bearer $#AUTHENTICATIONTOKEN#$\","
 + "\"dataset_id\":1674,"
 + "\"header_key\":\"authenticationToken\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1478,"
 + "\"header_value\":\"$#USERID#$\","
 + "\"dataset_id\":1674,"
 + "\"header_key\":\"userId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1479,"
 + "\"header_value\":\"$#ACCOUNTID#$\","
 + "\"dataset_id\":1674,"
 + "\"header_key\":\"accountId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1480,"
 + "\"header_value\":\"$#SESSIONID#$\","
 + "\"dataset_id\":1674,"
 + "\"header_key\":\"sessionId\","
 + "\"header_desc\":\"\"}]";

public static final String authenticationData3 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body3  = "{\"raw_text\":\"{\\n\\t\\\"trackingNumber\\\": [\\\"12345678934\\\","
 + "\\\"12345678934\\\"],"
 + "\\n\\t\\\"shippingCarrier\\\":\\\"Amazon\\\","
 + "\\n\\t\\\"recipientId\\\": \\\"3716669\\\","
 + "\\n\\t\\\"handlingUrgent\\\": 1,"
 + "\\n\\t\\\"handlingfragile\\\": 1,"
 + "\\n\\t\\\"handlingPerishable\\\": 1,"
 + "\\n\\t\\\"handlingheavy\\\": 1,"
 + "\\n\\t\\\"sender\\\": \\\"Mi\\\","
 + "\\n\\t\\\"serviceType\\\": \\\"First Class\\\","
 + "\\n\\t\\\"packagecondition\\\": \\\"Appears Fine\\\","
 + "\\n\\t\\\"weight\\\": \\\"\\\","
 + "\\n\\t\\\"dimensions\\\": \\\"\\\","
 + "\\n\\t\\\"packageType\\\": \\\"Box\\\","
 + "\\n\\t\\\"customMessage\\\": \\\"Pick up the package ASAP\\\","
 + "\\n\\t\\\"shelf\\\": \\\"Top Shelf\\\","
 + "\\n\\t\\\"tagNumber\\\": 1,"
 + "\\n\\t\\\"ocrTriggered\\\": 1\\n}\","
 + "\"raw_id\":1410,"
 + "\"dataset_id\":1674,"
 + "\"raw_type_id\":3}";


			/*--------Dataset# With few details Dataset-----------*/

public static final String datasetHeader4 = "TC_PackageLogIN-Dataset# With few details";

public static final String datasetResources4 = "track/packageLogin";
public static final int requestType4 = 2;
public static final int bodyType4 = 3;
public static final String apiName4 = "Package Login";

 public static String urlParams4  = "[]";

 public static String headers4  = "[{\"header_id\":1481,"
 + "\"header_value\":\"Bearer $#AUTHENTICATIONTOKEN#$\","
 + "\"dataset_id\":1675,"
 + "\"header_key\":\"authenticationToken\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1482,"
 + "\"header_value\":\"$#USERID#$\","
 + "\"dataset_id\":1675,"
 + "\"header_key\":\"userId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1483,"
 + "\"header_value\":\"$#ACCOUNTID#$\","
 + "\"dataset_id\":1675,"
 + "\"header_key\":\"accountId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1484,"
 + "\"header_value\":\"$#SESSIONID#$\","
 + "\"dataset_id\":1675,"
 + "\"header_key\":\"sessionId\","
 + "\"header_desc\":\"\"}]";

public static final String authenticationData4 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body4  = "{\"raw_text\":\"{\\n\\t\\\"trackingNumber\\\": [\\\"12345678926\\\"],"
 + "\\n\\t\\\"shippingCarrier\\\":\\\"Amazon\\\","
 + "\\n\\t\\\"recipientId\\\": \\\"3716669\\\","
 + "\\n\\t\\\"handlingUrgent\\\": 1,"
 + "\\n\\t\\\"handlingfragile\\\": 1,"
 + "\\n\\t\\\"handlingPerishable\\\": 1,"
 + "\\n\\t\\\"handlingheavy\\\": 1,"
 + "\\n\\t\\\"sender\\\": \\\"\\\","
 + "\\n\\t\\\"serviceType\\\": \\\"\\\","
 + "\\n\\t\\\"packagecondition\\\": \\\"\\\","
 + "\\n\\t\\\"weight\\\": \\\"\\\","
 + "\\n\\t\\\"dimensions\\\": \\\"\\\","
 + "\\n\\t\\\"packageType\\\": \\\"\\\","
 + "\\n\\t\\\"customMessage\\\": \\\"\\\","
 + "\\n\\t\\\"shelf\\\": \\\"\\\","
 + "\\n\\t\\\"tagNumber\\\": 1,"
 + "\\n\\t\\\"ocrTriggered\\\": 1\\n}\","
 + "\"raw_id\":1411,"
 + "\"dataset_id\":1675,"
 + "\"raw_type_id\":3}";


			/*--------Dataset# All filled Details Dataset-----------*/

public static final String datasetHeader5 = "TC_PackageLogIN-Dataset# All filled Details";

public static final String datasetResources5 = "track/packageLogin";
public static final int requestType5 = 2;
public static final int bodyType5 = 3;
public static final String apiName5 = "Package Login";

 public static String urlParams5  = "[]";

 public static String headers5  = "[{\"header_id\":1485,"
 + "\"header_value\":\"Bearer $#AUTHENTICATIONTOKEN#$\","
 + "\"dataset_id\":1676,"
 + "\"header_key\":\"authenticationToken\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1486,"
 + "\"header_value\":\"$#USERID#$\","
 + "\"dataset_id\":1676,"
 + "\"header_key\":\"userId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1487,"
 + "\"header_value\":\"$#ACCOUNTID#$\","
 + "\"dataset_id\":1676,"
 + "\"header_key\":\"accountId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1488,"
 + "\"header_value\":\"$#SESSIONID#$\","
 + "\"dataset_id\":1676,"
 + "\"header_key\":\"sessionId\","
 + "\"header_desc\":\"\"}]";

public static final String authenticationData5 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body5  = "{\"raw_text\":\"{\\n\\t\\\"trackingNumber\\\": [\\\"123456789132\\\"],"
 + "\\n\\t\\\"shippingCarrier\\\":\\\"Amazon\\\","
 + "\\n\\t\\\"recipientId\\\": \\\"3716669\\\","
 + "\\n\\t\\\"handlingUrgent\\\": 1,"
 + "\\n\\t\\\"handlingfragile\\\": 1,"
 + "\\n\\t\\\"handlingPerishable\\\": 1,"
 + "\\n\\t\\\"handlingheavy\\\": 1,"
 + "\\n\\t\\\"sender\\\": \\\"Mi\\\","
 + "\\n\\t\\\"serviceType\\\": \\\"First Class\\\","
 + "\\n\\t\\\"packagecondition\\\": \\\"Appears Fine\\\","
 + "\\n\\t\\\"weight\\\": \\\"1KG\\\","
 + "\\n\\t\\\"dimensions\\\": \\\"5*5\\\","
 + "\\n\\t\\\"packageType\\\": \\\"Box\\\","
 + "\\n\\t\\\"customMessage\\\": \\\"Pick up the package ASAP\\\","
 + "\\n\\t\\\"shelf\\\": \\\"Top Shelf\\\","
 + "\\n\\t\\\"tagNumber\\\": 1,"
 + "\\n\\t\\\"ocrTriggered\\\": 1\\n}\","
 + "\"raw_id\":1412,"
 + "\"dataset_id\":1676,"
 + "\"raw_type_id\":3}";


			/*--------Dataset# Multiple Tracking Numbers Dataset-----------*/

public static final String datasetHeader6 = "TC_PackageLogIN-Dataset# Multiple Tracking Numbers";

public static final String datasetResources6 = "track/packageLogin";
public static final int requestType6 = 2;
public static final int bodyType6 = 3;
public static final String apiName6 = "Package Login";

 public static String urlParams6  = "[]";

 public static String headers6  = "[{\"header_id\":1489,"
 + "\"header_value\":\"Bearer $#AUTHENTICATIONTOKEN#$\","
 + "\"dataset_id\":1677,"
 + "\"header_key\":\"authenticationToken\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1490,"
 + "\"header_value\":\"$#USERID#$\","
 + "\"dataset_id\":1677,"
 + "\"header_key\":\"userId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1491,"
 + "\"header_value\":\"$#ACCOUNTID#$\","
 + "\"dataset_id\":1677,"
 + "\"header_key\":\"accountId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1492,"
 + "\"header_value\":\"$#SESSIONID#$\","
 + "\"dataset_id\":1677,"
 + "\"header_key\":\"sessionId\","
 + "\"header_desc\":\"\"}]";

public static final String authenticationData6 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body6  = "{\"raw_text\":\"{\\n\\t\\\"trackingNumber\\\": [\\\"123456789401\\\","
 + "\\\"123456789402\\\"],"
 + "\\n\\t\\\"shippingCarrier\\\":\\\"Amazon\\\","
 + "\\n\\t\\\"recipientId\\\": \\\"3716669\\\","
 + "\\n\\t\\\"handlingUrgent\\\": 1,"
 + "\\n\\t\\\"handlingfragile\\\": 1,"
 + "\\n\\t\\\"handlingPerishable\\\": 1,"
 + "\\n\\t\\\"handlingheavy\\\": 1,"
 + "\\n\\t\\\"sender\\\": \\\"Mi\\\","
 + "\\n\\t\\\"serviceType\\\": \\\"First Class\\\","
 + "\\n\\t\\\"packagecondition\\\": \\\"Appears Fine\\\","
 + "\\n\\t\\\"weight\\\": \\\"\\\","
 + "\\n\\t\\\"dimensions\\\": \\\"\\\","
 + "\\n\\t\\\"packageType\\\": \\\"Box\\\","
 + "\\n\\t\\\"customMessage\\\": \\\"Pick up the package ASAP\\\","
 + "\\n\\t\\\"shelf\\\": \\\"Top Shelf\\\","
 + "\\n\\t\\\"tagNumber\\\": 1,"
 + "\\n\\t\\\"ocrTriggered\\\": 1\\n}\","
 + "\"raw_id\":1413,"
 + "\"dataset_id\":1677,"
 + "\"raw_type_id\":3}";


}
