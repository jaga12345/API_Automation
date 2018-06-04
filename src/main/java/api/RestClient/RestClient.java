package api.RestClient;
 
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RestClient {
	
	public CloseableHttpResponse get(String url) throws Throwable {
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);
		CloseableHttpResponse response = httpclient.execute(httpget);
		
		
		return response;
	}
	
	public CloseableHttpResponse get(String url, HashMap<String, String> headermap) throws Throwable{
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);
		
		/*for(Map.Entry<String, String> ) {
			
		}*/
		
		for (Map.Entry<String, String> entry : headermap.entrySet()) {
			httpget.addHeader(entry.getKey(), entry.getValue());
		}
		
		CloseableHttpResponse response = httpclient.execute(httpget);
		
		return response;
	}

}
