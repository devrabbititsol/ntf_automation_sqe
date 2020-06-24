package api.notifii.notifiiv20trackapis.apipageclasses; 

public class TrackAddMailRoomDataset{

public static final int datasetLength = 1; 

public static String projectName = "notifii";

			/*--------Dataset# Valid Details Dataset-----------*/

public static final String datasetHeader1 = "TC_AddMailRoom-Dataset# Valid Details";

public static final String datasetResources1 = "track/insertMailroom";
public static final int requestType1 = 2;
public static final int bodyType1 = 3;
public static final String apiName1 = "Track Add mail room";

 public static String urlParams1  = "[]";

 public static String headers1  = "[{\"header_id\":1225,"
 + "\"header_value\":\"$#ACCOUNTID#$\","
 + "\"dataset_id\":1647,"
 + "\"header_key\":\"accountId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1226,"
 + "\"header_value\":\"$#USERID#$\","
 + "\"dataset_id\":1647,"
 + "\"header_key\":\"userId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1227,"
 + "\"header_value\":\"$#SESSIONID#$\","
 + "\"dataset_id\":1647,"
 + "\"header_key\":\"sessionId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1228,"
 + "\"header_value\":\"Bearer $#AUTHENTICATIONTOKEN#$\","
 + "\"dataset_id\":1647,"
 + "\"header_key\":\"authenticationToken\","
 + "\"header_desc\":\"\"}]";

public static final String authenticationData1 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body1  = "{\"raw_text\":\"{\\n\\t\\\"location\\\":\\\"New Mailroom 2\\\"\\n}\","
 + "\"raw_id\":1334,"
 + "\"dataset_id\":1647,"
 + "\"raw_type_id\":3}";

}