package package1;

import java.util.Arrays;

import org.json.simple.JSONObject;

public class AsnmentJAVA {

	public static void main(String[] args) 
	{
		JSONObject  json =new JSONObject();
		Object v1 = json.put("paytype", "pos");
		Object v2 = json.put("contact No:", "123");
		Object v3= json.put("dosID:", "x1232");
		
		JSONObject  json1 =new JSONObject();
		Object w1 = json1.put("paytype", "qcode");
		Object w2 = json1.put("contact No:", "a1s2d3");
		Object w3= json1.put("dosID:", "x1c32");
		
		JSONObject  json2 =new JSONObject();
		Object x1 = json2.put("paytype", "jcode");
		Object x2 = json2.put("contact No:", "iwqa1");
		Object x3= json2.put("dosID:", "1234");
		
		System.out.println(json);
		System.out.println(json1);
		System.out.println(json2);
		String s=json2.toString();
		String s2=String.valueOf(json2);


	



	
		//System.out.println(s2);
		String[] words = s2.split(" ");
		System.out.println(Arrays.toString(words));

		
		//String[] strArray3 = new String[0];
		//strArray3[0]=s2;
		
	      
	      
	      
		
		
	      }
	}


