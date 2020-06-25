package api.notifii.notifiiv20apis.track.apipageclasses; 

public class TrackingNumberUniquenessDataset{

public static final int datasetLength = 2; 

public static String projectName = "notifii";

			/*--------Dataset# Same Tracking Numbers Dataset-----------*/

public static final String datasetHeader1 = "TC_TrackingNumberUniqueness-Dataset# Same Tracking Numbers";

public static final String datasetResources1 = "track/checkTrackingNumberUniqueness";
public static final int requestType1 = 2;
public static final int bodyType1 = 3;
public static final String apiName1 = "Tracking Number Uniqueness";

 public static String urlParams1  = "[]";

 public static String headers1  = "[{\"header_id\":1462,"
 + "\"header_value\":\"$#ACCOUNTID#$\","
 + "\"dataset_id\":1656,"
 + "\"header_key\":\"accountId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1464,"
 + "\"header_value\":\"$#USERID#$\","
 + "\"dataset_id\":1656,"
 + "\"header_key\":\"userId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1461,"
 + "\"header_value\":\"$#SESSIONID#$\","
 + "\"dataset_id\":1656,"
 + "\"header_key\":\"sessionId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1463,"
 + "\"header_value\":\"Bearer $#AUTHENTICATIONTOKEN#$\","
 + "\"dataset_id\":1656,"
 + "\"header_key\":\"authenticationToken\","
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
 + "\"raw_id\":1406,"
 + "\"dataset_id\":1656,"
 + "\"raw_type_id\":3}";

			/*--------Dataset# Different Tracking Numbers Dataset-----------*/

public static final String datasetHeader2 = "TC_TrackingNumberUniqueness-Dataset# Different Tracking Numbers";

public static final String datasetResources2 = "track/checkTrackingNumberUniqueness";
public static final int requestType2 = 2;
public static final int bodyType2 = 3;
public static final String apiName2 = "Tracking Number Uniqueness";

 public static String urlParams2  = "[]";

 public static String headers2  = "[{\"header_id\":1466,"
 + "\"header_value\":\"$#SESSIONID#$\","
 + "\"dataset_id\":1657,"
 + "\"header_key\":\"sessionId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1468,"
 + "\"header_value\":\"$#ACCOUNTID#$\","
 + "\"dataset_id\":1657,"
 + "\"header_key\":\"accountId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1465,"
 + "\"header_value\":\"Bearer $#AUTHENTICATIONTOKEN#$\","
 + "\"dataset_id\":1657,"
 + "\"header_key\":\"authenticationToken\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1467,"
 + "\"header_value\":\"$#USERID#$\","
 + "\"dataset_id\":1657,"
 + "\"header_key\":\"userId\","
 + "\"header_desc\":\"\"}]";

public static final String authenticationData2 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body2  = "{\"raw_text\":\"{\\n\\t\\\"trackingNumber\\\": [\\n\\t\\t\\\"TB123456788116\\\","
 + "\\n\\t\\t\\\"TB1234567886\\\"\\n\\t]\\n}\","
 + "\"raw_id\":1407,"
 + "\"dataset_id\":1657,"
 + "\"raw_type_id\":3}";


}
