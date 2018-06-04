package automation.api;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import api.RestClient.DummyRestClient;
import api.base.TestBase;

public class GetApiTest extends TestBase {
	
	TestBase testbase;
	String api_url;
	String service_url;
	String uri;
	DummyRestClient restclient;
	
	@BeforeMethod
	public void setup() {
		testbase = new TestBase();
		restclient = new DummyRestClient();
		api_url = prop.getProperty(api_url);
		service_url = prop.getProperty(service_url);
		uri = api_url + service_url;
	}
	
	@Test
	public void get_api_test() throws Throwable {
		
		restclient.get(uri);
	
	}

}
