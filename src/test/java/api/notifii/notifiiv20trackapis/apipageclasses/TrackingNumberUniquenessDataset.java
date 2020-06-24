package api.notifii.notifiiv20trackapis.apipageclasses; 

public class TrackingNumberUniquenessDataset{

public static final int datasetLength = 1; 

public static String projectName = "notifii";

			/*--------Dataset# Same Tracking Numbers Dataset-----------*/

public static final String datasetHeader1 = "TC_TrackingNumberUniqueness-Dataset# Same Tracking Numbers";

public static final String datasetResources1 = "track/checkTrackingNumberUniqueness";
public static final int requestType1 = 2;
public static final int bodyType1 = 3;
public static final String apiName1 = "Tracking Number Uniqueness";

 public static String urlParams1  = "[]";

 public static String headers1  = "[{\"header_id\":1233,"
 + "\"header_value\":\"Bearer $#AUTHENTICATIONTOKEN#$\","
 + "\"dataset_id\":1656,"
 + "\"header_key\":\"authenticationToken\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1234,"
 + "\"header_value\":\"$#SESSIONID#$\","
 + "\"dataset_id\":1656,"
 + "\"header_key\":\"sessionId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1235,"
 + "\"header_value\":\"$#UESRID#$\","
 + "\"dataset_id\":1656,"
 + "\"header_key\":\"userId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1236,"
 + "\"header_value\":\"$#ACCOUNTID#$\","
 + "\"dataset_id\":1656,"
 + "\"header_key\":\"accountId\","
 + "\"header_desc\":\"\"}]";

public static final String authenticationData1 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body1  = "{\"raw_text\":\"{\\n\\t\\\"trackingNumber\\\": [\\n\\t\\t\\\"TB1234567886\\\","
 + "\\n\\t\\t\\\"TB1234567886\\\"\\n\\t]\\n}\","
 + "\"raw_id\":1337,"
 + "\"dataset_id\":1656,"
 + "\"raw_type_id\":3}";

}