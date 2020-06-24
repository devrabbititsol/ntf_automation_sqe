package api.notifii.notifiiv20trackapis.apipageclasses; 

public class TrackGeneralSettingsDataset{

public static final int datasetLength = 1; 

public static String projectName = "notifii";

			/*--------Dataset# Valid Details Dataset-----------*/

public static final String datasetHeader1 = "TC_GetGeneralSettingsAPI-Dataset# Valid Details";

public static final String datasetResources1 = "track/getTrackSettings";
public static final int requestType1 = 1;
public static final int bodyType1 = 0;
public static final String apiName1 = "Track General Settings";

 public static String urlParams1  = "[]";

 public static String headers1  = "[{\"header_id\":1062,"
 + "\"header_value\":\"$#SESSIONID#$\","
 + "\"dataset_id\":1632,"
 + "\"header_key\":\"sessionId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1063,"
 + "\"header_value\":\"Bearer $#AUTHENTICATIONTOKEN#$\","
 + "\"dataset_id\":1632,"
 + "\"header_key\":\"authenticationToken\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1064,"
 + "\"header_value\":\"$#USERID#$\","
 + "\"dataset_id\":1632,"
 + "\"header_key\":\"userId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1061,"
 + "\"header_value\":\"$#ACCOUNTID#$\","
 + "\"dataset_id\":1632,"
 + "\"header_key\":\"accountId\","
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