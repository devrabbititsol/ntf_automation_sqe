package api.notifii.notifiiv20apis.track.apipageclasses; 

public class PackageLoginDataset{

public static final int datasetLength = 1; 

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

}