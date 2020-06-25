package api.notifii.notifiiv20apis.twilio.apipageclasses; 

public class SendTextMessageDataset{

public static final int datasetLength = 1; 

public static String projectName = "notifii";

			/*--------Dataset# Valid Details Dataset-----------*/

public static final String datasetHeader1 = "TC_SendTextMessage-Dataset# Valid Details";

public static final String datasetResources1 = "session/sendMessage";
public static final int requestType1 = 2;
public static final int bodyType1 = 3;
public static final String apiName1 = "Send Text Message";

 public static String urlParams1  = "[]";

 public static String headers1  = "[]";

public static final String authenticationData1 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body1  = "{\"raw_text\":\"{\\n\\t\\\"mobileNumbers\\\":[\\\"+919550173873\\\"],"
 + "\\n\\t\\\"fromNumber\\\":\\\"+1 251 299 6857\\\","
 + "\\n\\t\\\"messageBody\\\":\\\"Hello Team\\\","
 + "\\n\\t\\\"sendType\\\": \\\"GENERAL\\\"\\n}\","
 + "\"raw_id\":1417,"
 + "\"dataset_id\":1671,"
 + "\"raw_type_id\":3}";

}