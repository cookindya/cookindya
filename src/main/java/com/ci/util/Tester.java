package com.ci.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONObject;

import com.ci.data.UserInfo;
import com.google.gson.Gson;

public class Tester {

	public static void main(String[] args) {

		
		try {
 
			UserInfo user = new UserInfo();
			user.setUserInfoId(650007);
			user.setUserName("HK");
			user.setIsSeller("Y");
			user.setIsMobileAppUser("Y");
 
			Gson gson = new Gson();
			
			gson.toJson(user);
			
			JSONObject jsonObject = new JSONObject(gson.toJson(user));
			System.out.println(jsonObject);
 
			try {
				URL url = new URL("http://localhost:8080/cookindya/api/user/create");
				URLConnection connection = url.openConnection();
				connection.setDoOutput(true);
				connection.setRequestProperty("Content-Type", "application/json");
				connection.setConnectTimeout(5000);
				connection.setReadTimeout(5000);
				OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
				out.write(jsonObject.toString());
				out.close();
 
				BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
 
				while (in.readLine() != null) {
				}
				in.close();
			} catch (Exception e) {
				System.out.println(e);
			}
 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

