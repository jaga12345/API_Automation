package api.RestClient;

import java.util.HashMap;
import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import api.base.TestBase;

public class DummyRestClient extends TestBase{
	
	public void get(String url) throws Throwable {
	CloseableHttpClient httpclient = HttpClients.createDefault();
	HttpGet httpget = new HttpGet(url);
	CloseableHttpResponse response = httpclient.execute(httpget);
	
	int status_code = response.getStatusLine().getStatusCode();
	System.out.println("status code is : "+ status_code);
	
	String response_string = EntityUtils.toString(response.getEntity(), "UTF-8");
	JSONObject response_json = new JSONObject(response_string);
	System.out.println("Response in Json is : "+response_json);
	
	Header[] header_array = response.getAllHeaders();
	
	HashMap<String, String> all_headers = new HashMap<String, String>();
	for (Header header : header_array) {
		all_headers.put(header.getName(), header.getValue());
	}
	
	System.out.println("Header arrays are : "+ all_headers);

	}
	
}