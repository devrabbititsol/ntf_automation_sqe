package api.notifii.notifiiv20trackapis.apipageclasses; 

public class LoginAPIDataset{

public static final int datasetLength = 1; 

public static String projectName = "notifii";

			/*--------Default Dataset-----------*/

public static final String datasetHeader1 = "TC_Login-Default";

public static final String datasetResources1 = "session/login";
public static final int requestType1 = 2;
public static final int bodyType1 = 3;
public static final String apiName1 = "Login API";

 public static String urlParams1  = "[]";

 public static String headers1  = "[]";


 public static String linkParams1  = "[{\"dataset_id\":1624,"
 + "\"description\":\"\","
 + "\"id\":35,"
 + "\"value\":\"user_id\","
 + "\"key\":\"USERID\"},"
 + "{\"dataset_id\":1624,"
 + "\"description\":\"\","
 + "\"id\":36,"
 + "\"value\":\"account_id\","
 + "\"key\":\"ACCOUNTID\"},"
 + "{\"dataset_id\":1624,"
 + "\"description\":\"\","
 + "\"id\":37,"
 + "\"value\":\"session_id\","
 + "\"key\":\"SESSIONID\"},"
 + "{\"dataset_id\":1624,"
 + "\"description\":\"\","
 + "\"id\":38,"
 + "\"value\":\"authentication_token\","
 + "\"key\":\"AUTHENTICATIONTOKEN\"}]";

public static final String authenticationData1 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body1  = "{\"raw_text\":\"{\\n\\t\\\"username\\\":\\\"drhacc1\\\","
 + "\\n\\t\\\"password\\\":\\\"drhacc1\\\","
 + "\\n\\t\\\"session_timedout\\\":\\\"1d\\\"\\n}\","
 + "\"raw_id\":1280,"
 + "\"dataset_id\":1624,"
 + "\"raw_type_id\":3}";

}