package api.notifii.notifiiv20apis.track.apipageclasses; 

public class PackageLoginDataset{

public static final int datasetLength = 1; 

public static String projectName = "notifii";

			/*--------Dataset# Valid Details Dataset-----------*/

public static final String datasetHeader1 = "TC_PackageLogIN-Dataset# Valid Details";

public static final String datasetResources1 = "track/packageLogin";
public static final int requestType1 = 2;
public static final int bodyType1 = 3;
public static final String apiName1 = "Package Login";

 public static String urlParams1  = "[]";

 public static String headers1  = "[{\"header_id\":1473,"
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

public static final String authenticationData1 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body1  = "{\"raw_text\":\"{\\n\\t\\\"trackingNumber\\\": [\\\"1234567895\\\"],"
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

}