package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1360000/MidFcstInfoService/getMidTa"); /*URL*/
			String ServiceKey = "7rgHq9GLs7%2BeRmZww%2BGOrhHyB7A1NkV6a2lz%2BAoeskYrwWESG8v5%2BprrddYhsMRvnWVpA2Da4WU9nX2l49WIag%3D%3D";
			
			urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=" +ServiceKey ); /*Service Key*/
			urlBuilder.append("&" + URLEncoder.encode("ServiceKey","UTF-8") + "=" + URLEncoder.encode("ServiceKey", "UTF-8")); /*공공데이터포털에서 받은 인증키*/
			urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
			urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
			urlBuilder.append("&" + URLEncoder.encode("dataType","UTF-8") + "=" + URLEncoder.encode("JSON", "UTF-8")); /*요청자료형식(XML/JSON)Default: XML*/
			urlBuilder.append("&" + URLEncoder.encode("regId","UTF-8") + "=" + URLEncoder.encode("11B10101", "UTF-8")); /*별첨 엑셀파일 참조*/
			urlBuilder.append("&" + URLEncoder.encode("tmFc","UTF-8") + "=" + URLEncoder.encode("202010120600", "UTF-8")); /*-일 2회(06:00,18:00)회 생성 되며 발표시각을 입력-최근 24시간 자료만 제공*/
			
			URL url = new URL(urlBuilder.toString());
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-type", "application/json");
			System.out.println("Response code: " + conn.getResponseCode());
			BufferedReader rd;
			if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
				rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else {
				rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = rd.readLine()) != null) {
				sb.append(line);
			}
			rd.close();
			conn.disconnect();
			
			String result = sb.toString();
			System.out.println(result);
			
			// Json parser를 만들어 만들어진 문자열 데이터를 객체화 
	 		JSONParser parser = new JSONParser(); 
	 		JSONObject obj = (JSONObject) parser.parse(result); 
	 		// response 키를 가지고 데이터를 파싱 
	 		JSONObject parse_response = (JSONObject) obj.get("response"); 
	 		// response 로 부터 body 찾기
	 		JSONObject parse_body = (JSONObject) parse_response.get("body"); 
	 		// body 로 부터 items 찾기 
	 		JSONObject parse_items = (JSONObject) parse_body.get("items");
	 		// items로 부터 itemlist 를 받기 
	 		JSONArray parse_item = (JSONArray) parse_items.get("item");
	 		
	 		
			HashMap<String,String> sky = new HashMap<>();
			HashMap<String,String> tpt = new HashMap<>();
			
			String day = null;
			
			for(int i=0; i<parse_item.size();i++) {
				
				WeatherData = (JSONObject) item.get(i);
				String key = keyObj[i].toString();
				String str = ""; //오전/오후 저장
				if(key.substring(0,2).equals("wf")) { //최저 기온
					try { //키에서 숫자만 추출
						day = key.substring(2,key.lastIndexOf("m")-1);
						str = key.substring(key.lastIndexOf("m")-1);
						System.out.println(day+"\t"+ str);
					} catch (Exception e) {
						// TODO: handle exception
						day = key.substring(2);
					}
					
					sky.put(day+str, parse_item.get(key).toString());
				}
				 else if(key.substring(0,4).equals("rnSt")) { //강수확률
					 try {
						day = key.substring(4,key.lastIndexOf("m")-1);
						str = key.substring(key.lastIndexOf("m")-1);
					} catch (Exception e) {
						// TODO: handle exception
						day = key.substring(4);
					}			
					 tpt.put(day+str, parse_item.get(key).toString());
				 }
			}
			
			 Iterator<String> skyKeys = sky.keySet().iterator();
			 Iterator<String> tptKeys = sky.keySet().iterator();
			 while(skyKeys.hasNext()) {
				 String skyKey = skyKeys.next();
				 String tptKey = tptKeys.next();
				 request.setAttribute("skyKey", skyKey);
				 request.setAttribute("tptKey", tptKey);
			 };
			 
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		RequestDispatcher dis = request.getRequestDispatcher("weather.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
