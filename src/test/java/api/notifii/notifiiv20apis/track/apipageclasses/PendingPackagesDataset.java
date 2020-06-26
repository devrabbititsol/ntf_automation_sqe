package api.notifii.notifiiv20apis.track.apipageclasses; 

public class PendingPackagesDataset{

public static final int datasetLength = 1; 

public static String projectName = "notifii";

			/*--------Dataset# Valid Details Dataset-----------*/

public static final String datasetHeader1 = "TC_PendingPackages-Dataset# Valid Details";

public static final String datasetResources1 = "track/trackingPackages";
public static final int requestType1 = 2;
public static final int bodyType1 = 3;
public static final String apiName1 = "Pending Packages ";

 public static String urlParams1  = "[]";

 public static String headers1  = "[{\"header_id\":1509,"
 + "\"header_value\":\"$#ACCOUNTID#$\","
 + "\"dataset_id\":1679,"
 + "\"header_key\":\"accountId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1510,"
 + "\"header_value\":\"Bearer $#AUTHENTICATIONTOKEN#$\","
 + "\"dataset_id\":1679,"
 + "\"header_key\":\"authenticationToken\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1511,"
 + "\"header_value\":\"$#SESSIONID#$\","
 + "\"dataset_id\":1679,"
 + "\"header_key\":\"sessionId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1512,"
 + "\"header_value\":\"$#USERID#$\","
 + "\"dataset_id\":1679,"
 + "\"header_key\":\"userId\","
 + "\"header_desc\":\"\"}]";

public static final String authenticationData1 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body1  = "{\"raw_text\":\"{\\n\\t\\\"page\\\": 0,"
 + "\\n\\t\\\"limit\\\": 25,"
 + "\\n\\t\\\"search_string\\\": \\\"\\\","
 + "\\n\\t\\\"selected_fields\\\": \\\"package_id,"
 + " tracking_number,"
 + " recipient_id,"
 + "shelf\\\"\\n}\","
 + "\"raw_id\":1421,"
 + "\"dataset_id\":1679,"
 + "\"raw_type_id\":3}";

}