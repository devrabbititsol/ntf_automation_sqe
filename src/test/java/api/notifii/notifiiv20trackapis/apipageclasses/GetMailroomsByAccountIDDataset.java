package api.notifii.notifiiv20trackapis.apipageclasses; 

public class GetMailroomsByAccountIDDataset{

public static final int datasetLength = 1; 

public static String projectName = "notifii";

			/*--------Dataset# Valid Details Dataset-----------*/

public static final String datasetHeader1 = "TC_GetMailRoomsByAccountID-Dataset# Valid Details";

public static final String datasetResources1 = "track/getMailroomsByAccountId";
public static final int requestType1 = 1;
public static final int bodyType1 = 0;
public static final String apiName1 = "Get Mailrooms By Account ID";

 public static String urlParams1  = "[]";

 public static String headers1  = "[{\"header_id\":1145,"
 + "\"header_value\":\"$#USERID#$\","
 + "\"dataset_id\":1646,"
 + "\"header_key\":\"userId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1147,"
 + "\"header_value\":\"$#ACCOUNTID#$\","
 + "\"dataset_id\":1646,"
 + "\"header_key\":\"accountId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1146,"
 + "\"header_value\":\"Bearer $#AUTHENTICATIONTOKEN#$\","
 + "\"dataset_id\":1646,"
 + "\"header_key\":\"authenticationToken\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1148,"
 + "\"header_value\":\"$#SESSIONID#$\","
 + "\"dataset_id\":1646,"
 + "\"header_key\":\"sessionId\","
 + "\"header_desc\":\"\"}]";

public static final String authenticationData1 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body1  = "{}";

}