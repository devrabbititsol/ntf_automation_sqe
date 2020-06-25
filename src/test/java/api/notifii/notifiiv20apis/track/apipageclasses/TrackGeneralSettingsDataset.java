package api.notifii.notifiiv20apis.track.apipageclasses; 

public class TrackGeneralSettingsDataset{

public static final int datasetLength = 1; 

public static String projectName = "notifii";

			/*--------Dataset #Invalid Authentication Dataset-----------*/

public static final String datasetHeader1 = "TC_GetGeneralSettingsAPI-Dataset #Invalid Authentication";

public static final String datasetResources1 = "track/getTrackSettings";
public static final int requestType1 = 1;
public static final int bodyType1 = 3;
public static final String apiName1 = "Track General Settings";

 public static String urlParams1  = "[]";

 public static String headers1  = "[{\"header_id\":1057,"
 + "\"header_value\":\"$#ACCOUNTID#$\","
 + "\"dataset_id\":1633,"
 + "\"header_key\":\"accountId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1058,"
 + "\"header_value\":\"$#SESSIONID#$\","
 + "\"dataset_id\":1633,"
 + "\"header_key\":\"sessionId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1059,"
 + "\"header_value\":\"$#AUTHENTICATIONTOKEN#$\","
 + "\"dataset_id\":1633,"
 + "\"header_key\":\"authenticationToken\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1060,"
 + "\"header_value\":\"$#USERID#$\","
 + "\"dataset_id\":1633,"
 + "\"header_key\":\"userId\","
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