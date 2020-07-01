package api.notifii.notifiiv20apis.useraccount.apipageclasses; 

public class LoginAPIDataset{

public static final int datasetLength = 4; 

public static String projectName = "notifii";

			/*--------Dataset#Invalid Username and Password Dataset-----------*/

public static final String datasetHeader1 = "TC_LoginAPI-Dataset#Invalid Username and Password";

public static final String datasetResources1 = "session/login";
public static final int requestType1 = 2;
public static final int bodyType1 = 3;
public static final String apiName1 = "Login API";

 public static String urlParams1  = "[]";

 public static String headers1  = "[]";


 public static String linkParams1  = "[{\"dataset_id\":1631,"
 + "\"description\":\"\","
 + "\"id\":63,"
 + "\"value\":\"user_id\","
 + "\"key\":\"USERID\"},"
 + "{\"dataset_id\":1631,"
 + "\"description\":\"\","
 + "\"id\":64,"
 + "\"value\":\"account_id\","
 + "\"key\":\"ACCOUNTID\"},"
 + "{\"dataset_id\":1631,"
 + "\"description\":\"\","
 + "\"id\":65,"
 + "\"value\":\"session_id\","
 + "\"key\":\"SESSIONID\"},"
 + "{\"dataset_id\":1631,"
 + "\"description\":\"\","
 + "\"id\":66,"
 + "\"value\":\"authentication_token\","
 + "\"key\":\"AUTHENTICATIONTOKEN\"}]";


 public static String statusParams1  = "[{\"dataset_id\":1631,"
 + "\"description\":\"\","
 + "\"id\":1,"
 + "\"value\":\"true\","
 + "\"key\":\"status\"}]";

public static final String authenticationData1 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body1  = "{\"raw_text\":\"{\\n\\t\\\"username\\\":\\\"123456\\\","
 + "\\n\\t\\\"password\\\":\\\"1234567\\\","
 + "\\n\\t\\\"session_timedout\\\":\\\"1d\\\"\\n}\","
 + "\"raw_id\":1426,"
 + "\"dataset_id\":1631,"
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
 + "\"id\":67,"
 + "\"value\":\"user_id\","
 + "\"key\":\"USERID\"},"
 + "{\"dataset_id\":1630,"
 + "\"description\":\"\","
 + "\"id\":68,"
 + "\"value\":\"account_id\","
 + "\"key\":\"ACCOUNTID\"},"
 + "{\"dataset_id\":1630,"
 + "\"description\":\"\","
 + "\"id\":69,"
 + "\"value\":\"session_id\","
 + "\"key\":\"SESSIONID\"},"
 + "{\"dataset_id\":1630,"
 + "\"description\":\"\","
 + "\"id\":70,"
 + "\"value\":\"authentication_token\","
 + "\"key\":\"AUTHENTICATIONTOKEN\"}]";


 public static String statusParams2  = "[{\"dataset_id\":1630,"
 + "\"description\":\"\","
 + "\"id\":2,"
 + "\"value\":\"true\","
 + "\"key\":\"status\"}]";

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
 + "\"raw_id\":1427,"
 + "\"dataset_id\":1630,"
 + "\"raw_type_id\":3}";


			/*--------Dataset #Invalid Password Dataset-----------*/

public static final String datasetHeader3 = "TC_LoginAPI-Dataset #Invalid Password";

public static final String datasetResources3 = "session/login";
public static final int requestType3 = 2;
public static final int bodyType3 = 3;
public static final String apiName3 = "Login API";

 public static String urlParams3  = "[]";

 public static String headers3  = "[]";


 public static String linkParams3  = "[{\"dataset_id\":1629,"
 + "\"description\":\"\","
 + "\"id\":71,"
 + "\"value\":\"user_id\","
 + "\"key\":\"USERID\"},"
 + "{\"dataset_id\":1629,"
 + "\"description\":\"\","
 + "\"id\":72,"
 + "\"value\":\"account_id\","
 + "\"key\":\"ACCOUNTID\"},"
 + "{\"dataset_id\":1629,"
 + "\"description\":\"\","
 + "\"id\":73,"
 + "\"value\":\"session_id\","
 + "\"key\":\"SESSIONID\"},"
 + "{\"dataset_id\":1629,"
 + "\"description\":\"\","
 + "\"id\":74,"
 + "\"value\":\"authentication_token\","
 + "\"key\":\"AUTHENTICATIONTOKEN\"}]";


 public static String statusParams3  = "[{\"dataset_id\":1629,"
 + "\"description\":\"\","
 + "\"id\":3,"
 + "\"value\":\"true\","
 + "\"key\":\"status\"}]";

public static final String authenticationData3 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body3  = "{\"raw_text\":\"{\\n\\t\\\"username\\\":\\\"drhacc1\\\","
 + "\\n\\t\\\"password\\\":\\\"123456\\\","
 + "\\n\\t\\\"session_timedout\\\":\\\"1d\\\"\\n}\","
 + "\"raw_id\":1428,"
 + "\"dataset_id\":1629,"
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
 + "\"id\":75,"
 + "\"value\":\"user_id\","
 + "\"key\":\"USERID\"},"
 + "{\"dataset_id\":1628,"
 + "\"description\":\"\","
 + "\"id\":76,"
 + "\"value\":\"account_id\","
 + "\"key\":\"ACCOUNTID\"},"
 + "{\"dataset_id\":1628,"
 + "\"description\":\"\","
 + "\"id\":77,"
 + "\"value\":\"session_id\","
 + "\"key\":\"SESSIONID\"},"
 + "{\"dataset_id\":1628,"
 + "\"description\":\"\","
 + "\"id\":78,"
 + "\"value\":\"authentication_token\","
 + "\"key\":\"AUTHENTICATIONTOKEN\"}]";


 public static String statusParams4  = "[{\"dataset_id\":1628,"
 + "\"description\":\"\","
 + "\"id\":4,"
 + "\"value\":\"true\","
 + "\"key\":\"status\"}]";

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
 + "\"raw_id\":1429,"
 + "\"dataset_id\":1628,"
 + "\"raw_type_id\":3}";


}
