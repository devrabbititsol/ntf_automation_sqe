package api.notifii.notifiiv20apis.track.apipageclasses; 

public class TrackUpdateGeneralSettingsDataset{

public static final int datasetLength = 1; 

public static String projectName = "notifii";

			/*--------Dataset# Valid Details Dataset-----------*/

public static final String datasetHeader1 = "TC_UpdateGeneralSettings-Dataset# Valid Details";

public static final String datasetResources1 = "track/updateTrackSettings";
public static final int requestType1 = 2;
public static final int bodyType1 = 3;
public static final String apiName1 = "Track Update General Settings";

 public static String urlParams1  = "[]";

 public static String headers1  = "[{\"header_id\":1374,"
 + "\"header_value\":\"$#ACCOUNTID#$\","
 + "\"dataset_id\":1636,"
 + "\"header_key\":\"accountId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1376,"
 + "\"header_value\":\"$#USERID#$\","
 + "\"dataset_id\":1636,"
 + "\"header_key\":\"userId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1373,"
 + "\"header_value\":\"$#SESSIONID#$\","
 + "\"dataset_id\":1636,"
 + "\"header_key\":\"sessionId\","
 + "\"header_desc\":\"\"},"
 + "{\"header_id\":1375,"
 + "\"header_value\":\"Bearer $#AUTHENTICATIONTOKEN#$\","
 + "\"dataset_id\":1636,"
 + "\"header_key\":\"authenticationToken\","
 + "\"header_desc\":\"\"}]";

public static final String authenticationData1 = "{\"authtype\":\"noauth\","
 + "\"basicauth\":{\"username\":\"\","
 + "\"password\":\"\"},"
 + "\"apikey\":{\"key\":\"\","
 + "\"value\":\"\","
 + "\"addto\":\"header\"},"
 + "\"bearertoken\":{\"token\":\"\"}}";


 public static String body1  = "{\"raw_text\":\"{\\n\\\"trackShippingCarriers\\\":[{\\n\\t\\\"referenceId\\\":\\\"20417\\\","
 + "\\n\\t\\\"shippingCarrierName\\\":\\\"DRH carriers\\\","
 + "\\n\\t\\\"shippingCarrierValue\\\":\\\"DRH carriers\\\","
 + "\\n\\t\\\"sortValue\\\":\\\"0\\\"\\n}],"
 + "\\n\\\"trackShelves\\\":[{\\n\\t\\\"referenceId\\\":\\\"8289\\\","
 + "\\n\\t\\\"shelfName\\\":\\\"Middle Shelf\\\"\\n}],"
 + "\\\"trackServiceTypes\\\":[{\\n\\t\\\"referenceId\\\":\\\"32180\\\","
 + "\\n\\t\\\"serviceTypeName\\\":\\\"2nd DAY AIR\\\","
 + "\\n\\t\\\"serviceTypeValue\\\":\\\"2nd DAY AIR\\\","
 + "\\n\\t\\\"sortValue\\\":\\\"0\\\"\\n}],"
 + "\\\"trackPackageTypes\\\":[{\\n\\t\\\"referenceId\\\":\\\"27204\\\","
 + "\\n\\t\\\"packageTypeName\\\":\\\"TUBE\\\","
 + "\\n\\t\\\"packageTypeValue\\\":\\\"TUBE\\\","
 + "\\n\\t\\\"sortValue\\\":\\\"0\\\"\\n}],"
 + "\\\"trackPackageConditions\\\":[{\\n\\t\\\"referenceId\\\":\\\"13303\\\","
 + "\\n\\t\\\"packageConditionName\\\":\\\"Moderate Damage\\\","
 + "\\n\\t\\\"packageConditionValue\\\":\\\"Moderate Damage\\\","
 + "\\n\\t\\\"sortValue\\\":\\\"0\\\"\\n}],"
 + "\\\"trackSpecialHandlings\\\":[{\\n\\t\\\"referenceId\\\":\\\"13569\\\","
 + "\\n\\t\\\"specialHandlingName\\\":\\\"Extremely Heavy\\\","
 + "\\n\\t\\\"specialHandlingValue\\\":\\\"Extremely Heavy\\\","
 + "\\n\\t\\\"sortValue\\\":\\\"0\\\"\\n}]\\t\\n}\","
 + "\"raw_id\":1387,"
 + "\"dataset_id\":1636,"
 + "\"raw_type_id\":3}";

}