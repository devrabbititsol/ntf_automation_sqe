package api.notifii.notifiiv20apis.useraccount.apipageclasses; 

public class LoginAPIDataset{

public static final int datasetLength = 4; 

public static String projectName = "notifii";

			/*--------Dataset #Invalid Password Dataset-----------*/

public static final String datasetHeader1 = "TC_LoginAPI-Dataset #Invalid Password";

public static final String datasetResources1 = "session/login";
public static final int requestType1 = 2;
public static final int bodyType1 = 3;
public static final String apiName1 = "Login API";

 public static String urlParams1  = "[]";

 public static String headers1  = "[]";


 public static String linkParams1  = "[{\"dataset_id\":1629,"
 + "\"description\":\"\","
 + "\"id\":43,"
 + "\"value\":\"user_id\","
 + "\"key\":\"USERID\"},"
 + "{\"dataset_id\":1629,"
 + "\"description\":\"\","
 + "\"id\":44,"
 + "\"value\":\"account_id\","
 + "\"key\":\"ACCOUNTID\"},"
 + "{\"dataset_id\":1629,"
 + "\"description\":\"\","
 + "\"id\":45,"
 + "\"value\":\"session_id\","
 + "\"key\":\"SESSIONID\"},"
 + "{\"dataset_id\":1629,"
 + "\"description\":\"\","
 + "\"id\":46,"
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
 + "\\n\\t\\\"password\\\":\\\"123456\\\","
 + "\\n\\t\\\"session_timedout\\\":\\\"1d\\\"\\n}\","
 + "\"raw_id\":1299,"
 + "\"dataset_id\":1629,"
 + "\"raw_type_id\":3}";

			/*--------Dataset #Invalid Username Dataset-----------*/

public static final String datasetHeader2 = "TC_LoginAPI-Dataset #Invalid Username";

public static final String datasetResources2 = "session/login";
public static final int requestType2 = 2;
public static final int bodyType2 = 3;
public static final String apiName2 = "Login API";

 public static String urlParams2  = "[]";

 public static String headers2  = "[]";


 public static String linkParams2  = "[{\"dataset_id\":1630,"
 + "\"description\":\"\","
 + "\"id\":51,"
 + "\"value\":\"user_id\","
 + "\"key\":\"USERID\"},"
 + "{\"dataset_id\":1630,"
 + "\"description\":\"\","
 + "\"id\":52,"
 + "\"value\":\"account_id\","
 + "\"key\":\"ACCOUNTID\"},"
 + "{\"dataset_id\":1630,"
 + "\"description\":\"\","
 + "\"id\":53,"
 + "\"value\":\"session_id\","
 + "\"key\":\"SESSIONID\"},"
 + "{\"dataset_id\":1630,"
 + "\"description\":\"\","
 + "\"id\":54,"
 + "\"value\":\"authentication_token\","
 + "\"key\":\"AUTHENTICATIONTOKEN\"}]";

public static final String authenticationData2 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body2  = "{\"raw_text\":\"{\\n\\t\\\"username\\\":\\\"123456\\\","
 + "\\n\\t\\\"password\\\":\\\"drhacc1\\\","
 + "\\n\\t\\\"session_timedout\\\":\\\"1d\\\"\\n}\","
 + "\"raw_id\":1301,"
 + "\"dataset_id\":1630,"
 + "\"raw_type_id\":3}";


			/*--------Dataset#Invalid Username and Password Dataset-----------*/

public static final String datasetHeader3 = "TC_LoginAPI-Dataset#Invalid Username and Password";

public static final String datasetResources3 = "session/login";
public static final int requestType3 = 2;
public static final int bodyType3 = 3;
public static final String apiName3 = "Login API";

 public static String urlParams3  = "[]";

 public static String headers3  = "[]";


 public static String linkParams3  = "[{\"dataset_id\":1631,"
 + "\"description\":\"\","
 + "\"id\":55,"
 + "\"value\":\"user_id\","
 + "\"key\":\"USERID\"},"
 + "{\"dataset_id\":1631,"
 + "\"description\":\"\","
 + "\"id\":56,"
 + "\"value\":\"account_id\","
 + "\"key\":\"ACCOUNTID\"},"
 + "{\"dataset_id\":1631,"
 + "\"description\":\"\","
 + "\"id\":57,"
 + "\"value\":\"session_id\","
 + "\"key\":\"SESSIONID\"},"
 + "{\"dataset_id\":1631,"
 + "\"description\":\"\","
 + "\"id\":58,"
 + "\"value\":\"authentication_token\","
 + "\"key\":\"AUTHENTICATIONTOKEN\"}]";

public static final String authenticationData3 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body3  = "{\"raw_text\":\"{\\n\\t\\\"username\\\":\\\"123456\\\","
 + "\\n\\t\\\"password\\\":\\\"1234567\\\","
 + "\\n\\t\\\"session_timedout\\\":\\\"1d\\\"\\n}\","
 + "\"raw_id\":1302,"
 + "\"dataset_id\":1631,"
 + "\"raw_type_id\":3}";


			/*--------DataSet# Valid Username and Password Dataset-----------*/

public static final String datasetHeader4 = "TC_LoginAPI-DataSet# Valid Username and Password";

public static final String datasetResources4 = "session/login";
public static final int requestType4 = 2;
public static final int bodyType4 = 3;
public static final String apiName4 = "Login API";

 public static String urlParams4  = "[]";

 public static String headers4  = "[]";


 public static String linkParams4  = "[{\"dataset_id\":1628,"
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

public static final String authenticationData4 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body4  = "{\"raw_text\":\"{\\n\\t\\\"username\\\":\\\"drhacc1\\\","
 + "\\n\\t\\\"password\\\":\\\"drhacc1\\\","
 + "\\n\\t\\\"session_timedout\\\":\\\"7d\\\"\\n}\","
 + "\"raw_id\":1336,"
 + "\"dataset_id\":1628,"
 + "\"raw_type_id\":3}";


}
