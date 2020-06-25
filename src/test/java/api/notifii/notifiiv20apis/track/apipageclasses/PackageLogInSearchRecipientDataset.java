package api.notifii.notifiiv20apis.track.apipageclasses; 

public class PackageLogInSearchRecipientDataset{

public static final int datasetLength = 1; 

public static String projectName = "notifii";

			/*--------Dataset# Valid Details Dataset-----------*/

public static final String datasetHeader1 = "TC_SearchResident_Package LogIn -Dataset# Valid Details";

public static final String datasetResources1 = "track/searchRecipientName";
public static final int requestType1 = 2;
public static final int bodyType1 = 3;
public static final String apiName1 = "Package Log In-Search Recipient";

 public static String urlParams1  = "[]";

 public static String headers1  = "[{\"header_id\":1450,"
 + "\"header_value\":\"Bearer $#AUTHENTICATIONTOKEN#$\","
 + "\"dataset_id\":1652,"
 + "\"header_key\":\"authenticationToken\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1452,"
 + "\"header_value\":\"$#SESSIONID#$\","
 + "\"dataset_id\":1652,"
 + "\"header_key\":\"sessionId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1449,"
 + "\"header_value\":\"$#ACCOUNTID#$\","
 + "\"dataset_id\":1652,"
 + "\"header_key\":\"accountId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1451,"
 + "\"header_value\":\"$#USERID#$\","
 + "\"dataset_id\":1652,"
 + "\"header_key\":\"userId\","
 + "\"header_desc\":\"\"}]";

public static final String authenticationData1 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body1  = "{\"raw_text\":\"{\\n\\t\\\"search_string\\\": \\\"abc\\\"\\n}\","
 + "\"raw_id\":1403,"
 + "\"dataset_id\":1652,"
 + "\"raw_type_id\":3}";

}