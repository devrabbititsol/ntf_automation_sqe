package api.notifii.notifiiv20apis.track.apipageclasses; 

public class TrackInsertSettingsDataset{

public static final int datasetLength = 1; 

public static String projectName = "notifii";

			/*--------Dataset# Valid Details Dataset-----------*/

public static final String datasetHeader1 = "TC_InsertSettings-Dataset# Valid Details";

public static final String datasetResources1 = "track/insertTrackSettings";
public static final int requestType1 = 2;
public static final int bodyType1 = 3;
public static final String apiName1 = "Track Insert Settings";

 public static String urlParams1  = "[]";

 public static String headers1  = "[{\"header_id\":1370,"
 + "\"header_value\":\"$#ACCOUNTID#$\","
 + "\"dataset_id\":1634,"
 + "\"header_key\":\"accountId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1372,"
 + "\"header_value\":\"Bearer $#AUTHENTICATIONTOKEN#$\","
 + "\"dataset_id\":1634,"
 + "\"header_key\":\"authenticationToken\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1369,"
 + "\"header_value\":\"$#USERID#$\","
 + "\"dataset_id\":1634,"
 + "\"header_key\":\"userId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1371,"
 + "\"header_value\":\"$#SESSIONID#$\","
 + "\"dataset_id\":1634,"
 + "\"header_key\":\"sessionId\","
 + "\"header_desc\":\"\"}]";

public static final String authenticationData1 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body1  = "{\"raw_text\":\"{\\n\\\"trackShippingCarriers\\\":[{\\n\\t\\\"shippingCarrierName\\\":\\\"Carrier 1\\\","
 + "\\n\\t\\\"shippingCarrierValue\\\":\\\"Carriers 1\\\","
 + "\\n\\t\\\"sortValue\\\":\\\"0\\\"\\n},"
 + "{\\n\\t\\\"shippingCarrierName\\\":\\\"Carriers 2\\\","
 + "\\n\\t\\\"shippingCarrierValue\\\":\\\"Carriers 2\\\","
 + "\\n\\t\\\"sortValue\\\":\\\"0\\\"\\n}],"
 + "\\n\\\"trackShelves\\\":[{\\n\\t\\\"shelfName\\\":\\\"Bottom Shelf\\\"\\n}],"
 + "\\\"trackServiceTypes\\\":[{\\n\\t\\\"serviceTypeName\\\":\\\"Express\\\","
 + "\\n\\t\\\"serviceTypeValue\\\":\\\"Express\\\","
 + "\\n\\t\\\"sortValue\\\":\\\"0\\\"\\n},"
 + "{\\n\\t\\\"serviceTypeName\\\":\\\"Media Mail\\\","
 + "\\n\\t\\\"serviceTypeValue\\\":\\\"Media Mail\\\","
 + "\\n\\t\\\"sortValue\\\":\\\"0\\\"\\n}],"
 + "\\\"trackPackageTypes\\\":[{\\n\\t\\\"packageTypeName\\\":\\\"Crate\\\","
 + "\\n\\t\\\"packageTypeValue\\\":\\\"Crate\\\","
 + "\\n\\t\\\"sortValue\\\":\\\"0\\\"\\n},"
 + "{\\n\\t\\\"packageTypeName\\\":\\\"Tube\\\","
 + "\\n\\t\\\"packageTypeValue\\\":\\\"Tube\\\","
 + "\\n\\t\\\"sortValue\\\":\\\"0\\\"\\n}],"
 + "\\\"trackPackageConditions\\\":[{\\n\\t\\\"type\\\":\\\"packageConditions\\\","
 + "\\n\\t\\\"packageConditionName\\\":\\\"Water Damage\\\","
 + "\\n\\t\\\"packageConditionValue\\\":\\\"Water Damage\\\","
 + "\\n\\t\\\"sortValue\\\":\\\"0\\\"\\n},"
 + "{\\n\\t\\\"type\\\":\\\"packageConditions\\\","
 + "\\n\\t\\\"packageConditionName\\\":\\\"Major Damage\\\","
 + "\\n\\t\\\"packageConditionValue\\\":\\\"Major Damage\\\","
 + "\\n\\t\\\"sortValue\\\":\\\"0\\\"\\n}],"
 + "\\\"trackSpecialHandlings\\\":[{\\n\\t\\\"type\\\":\\\"specialHandlings\\\","
 + "\\n\\t\\\"specialHandlingName\\\":\\\"Heavy\\\","
 + "\\n\\t\\\"specialHandlingValue\\\":\\\"Heavy\\\","
 + "\\n\\t\\\"sortValue\\\":\\\"0\\\"\\n}]\\t\\n}\","
 + "\"raw_id\":1386,"
 + "\"dataset_id\":1634,"
 + "\"raw_type_id\":3}";

}