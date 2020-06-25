package api.notifii.notifiiv20apis.useraccount.apitestclasses;

import com.restassured.services.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import api.notifii.notifiiv20apis.useraccount.apipageclasses.LoginAPIDataset;
public class TC_LoginAPI extends BaseClass {

	private Logger logger;
	private ConfigFilesUtility configFileObj;

	public TC_LoginAPI() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC_LoginAPI.class);
		configFileObj= new ConfigFilesUtility();
		configFileObj.loadPropertyFile("TC_LoginAPI.properties");
	}

	@Test(priority = 1)
	public void doRequest() throws Exception { 
	
		for(int i = 1; i <= configFileObj.getIntProperty("datasetsLength"); i++) {
			boolean isExecutionFlag = true;			
		/*--------------------- POST --------------------- */

			if(isExecutionFlag) {
 			 	Object object = (Object) new LoginAPIDataset();
				Class<?> c = object.getClass();
				String urlParams = (String) c.getField("urlParams" + i).get(object);
				if(urlParams == null) return;
				String linkParams = (String) c.getField("linkParams" + i).get(object);
				String headers = (String) c.getField("headers" + i).get(object);
				String body = (String) c.getField("body" + i).get(object);
				String authenticationData = (String) c.getField("authenticationData" + i).get(object);
				String apiName = (String) c.getField("apiName" + i).get(object);
				String datasetResources = (String) c.getField("datasetResources" + i).get(object);
				int reqType = (Integer) c.getField("requestType" + i).get(object);
				int bodyType = (Integer) c.getField("bodyType" + i).get(object);
				String response = APIService.callRequest(configFileObj,apiName, urlParams, headers, reqType, bodyType, body, configFileObj.getProperty("dataset" +i), datasetResources, authenticationData, formurlEncodedData, formData, linkParams, logger);
			}
		}
	}}
