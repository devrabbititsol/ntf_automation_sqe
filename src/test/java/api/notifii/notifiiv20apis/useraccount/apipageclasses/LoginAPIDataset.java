package api.notifii.notifiiv20apis.useraccount.apipageclasses; 

public class LoginAPIDataset{

public static final int datasetLength = 1; 

public static String projectName = "notifii";

			/*--------DataSet# Valid Username and Password Dataset-----------*/

public static final String datasetHeader1 = "TC_LoginAPI-DataSet# Valid Username and Password";

public static final String datasetResources1 = "session/login";
public static final int requestType1 = 2;
public static final int bodyType1 = 3;
public static final String apiName1 = "Login API";

 public static String urlParams1  = "[]";

 public static String headers1  = "[]";


 public static String linkParams1  = "[{\"dataset_id\":1628,"
 + "\"description\":\"\","
 + "\"id\":59,"
 + "\"value\":\"user_id\","
 + "\"key\":\"USERID\"},"
 + "{\"dataset_id\":1628,"
 + "\"description\":\"\","
 + "\"id\":60,"
 + "\"value\":\"account_id\","
 + "\"key\":\"ACCOUNTID\"},"
 + "{\"dataset_id\":1628,"
 + "\"description\":\"\","
 + "\"id\":61,"
 + "\"value\":\"session_id\","
 + "\"key\":\"SESSIONID\"},"
 + "{\"dataset_id\":1628,"
 + "\"description\":\"\","
 + "\"id\":62,"
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
 + "\\n\\t\\\"session_timedout\\\":\\\"7d\\\"\\n}\","
 + "\"raw_id\":1336,"
 + "\"dataset_id\":1628,"
 + "\"raw_type_id\":3}";

}