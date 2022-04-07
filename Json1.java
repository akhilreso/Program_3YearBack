package package1;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Json1    {

	public static void main(String[] args) 
	{
		JSONObject jo = new JSONObject();
		jo.put("paytype", "jcode");
		jo.put("contact", "14252412");

		JSONArray ja = new JSONArray();
		System.out.println(ja.add(jo)); 

		JSONObject mainObj = new JSONObject();
		mainObj.put("employees", ja);
		

	}

}
