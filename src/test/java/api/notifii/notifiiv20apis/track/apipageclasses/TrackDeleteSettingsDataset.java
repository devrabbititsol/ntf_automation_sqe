package api.notifii.notifiiv20apis.track.apipageclasses; 

public class TrackDeleteSettingsDataset{

public static final int datasetLength = 1; 

public static String projectName = "notifii";

			/*--------Dataset# Valid Details Dataset-----------*/

public static final String datasetHeader1 = "TC_DeleteGeneralSettings-Dataset# Valid Details";

public static final String datasetResources1 = "track/deleteTrackSettings";
public static final int requestType1 = 2;
public static final int bodyType1 = 3;
public static final String apiName1 = "Track Delete Settings";

 public static String urlParams1  = "[]";

 public static String headers1  = "[{\"header_id\":1410,"
 + "\"header_value\":\"$#SESSIONID#$\","
 + "\"dataset_id\":1638,"
 + "\"header_key\":\"sessionId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1412,"
 + "\"header_value\":\"Bearer $#AUTHENTICATIONTOKEN#$\","
 + "\"dataset_id\":1638,"
 + "\"header_key\":\"authenticationToken\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1409,"
 + "\"header_value\":\"$#ACCOUNTID#$\","
 + "\"dataset_id\":1638,"
 + "\"header_key\":\"accountId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1411,"
 + "\"header_value\":\"$#USERID#$\","
 + "\"dataset_id\":1638,"
 + "\"header_key\":\"userId\","
 + "\"header_desc\":\"\"}]";

public static final String authenticationData1 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body1  = "{\"raw_text\":\"{\\n\\t\\\"moduleType\\\":\\\"trackShippingCarriers\\\","
 + "\\n\\t\\\"referenceId\\\":\\\"20417\\\"\\n}\","
 + "\"raw_id\":1396,"
 + "\"dataset_id\":1638,"
 + "\"raw_type_id\":3}";

}