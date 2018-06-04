package api.utils;

import org.json.JSONArray;
import org.json.JSONObject;

public class Testutil {
	
	public static String get_value_by_jpath(JSONObject response_json , String jpath) {
		
		Object obj = response_json;
		for (String s : jpath.split("/")) {
			if(!s.isEmpty()) {
				if(!s.contains("[")|| s.contains("]")) {
					obj= ((JSONObject)obj).get(s);
				}
				
				else if (s.contains("[")||s.contains("]")) {
					obj=(JSONArray)obj;
				}
			}
		}
		
		return obj.toString();
	}

}
