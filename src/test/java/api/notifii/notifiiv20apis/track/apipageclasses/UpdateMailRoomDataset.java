package api.notifii.notifiiv20apis.track.apipageclasses; 

public class UpdateMailRoomDataset{

public static final int datasetLength = 1; 

public static String projectName = "notifii";

			/*--------Dataset# Valid Details Dataset-----------*/

public static final String datasetHeader1 = "TC_UpdateMailRoom-Dataset# Valid Details";

public static final String datasetResources1 = "track/updateMailroom";
public static final int requestType1 = 2;
public static final int bodyType1 = 3;
public static final String apiName1 = "Update Mail Room";

 public static String urlParams1  = "[]";

 public static String headers1  = "[{\"header_id\":1499,"
 + "\"header_value\":\"$#USERID#$\","
 + "\"dataset_id\":1650,"
 + "\"header_key\":\"userId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1500,"
 + "\"header_value\":\"$#SESSIONID#$\","
 + "\"dataset_id\":1650,"
 + "\"header_key\":\"sessionId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1497,"
 + "\"header_value\":\"Bearer $#AUTHENTICATIONTOKEN#$\","
 + "\"dataset_id\":1650,"
 + "\"header_key\":\"authenticationToken\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1498,"
 + "\"header_value\":\"$#ACCOUNTID#$\","
 + "\"dataset_id\":1650,"
 + "\"header_key\":\"accountId\","
 + "\"header_desc\":\"\"}]";

public static final String authenticationData1 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body1  = "{\"raw_text\":\"{\\n\\t\\\"trackMailrooms\\\": [\\n        {\\n            \\\"mailroomId\\\": 151271,"
 + "\\n            \\\"accountId\\\": 53585,"
 + "\\n            \\\"location\\\": \\\"New Mailroom 1\\\","
 + "\\n            \\\"tagNumber\\\": 1,"
 + "\\n            \\\"overrideGlobalNotifications\\\": \\\"a\\\","
 + "\\n            \\\"sendPkgLoginNotification\\\": 0,"
 + "\\n            \\\"sendPkgReminderNotification\\\": 0,"
 + "\\n            \\\"sendPkgLogoutNotification\\\": 0,"
 + "\\n            \\\"mailroomStatus\\\": 1\\n        }\\n    ]\\n}\","
 + "\"raw_id\":1415,"
 + "\"dataset_id\":1650,"
 + "\"raw_type_id\":3}";

}