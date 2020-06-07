package com.concepts.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;



public class Basic {
	
	
	public static void getData() throws IOException {
		String baseurl = "https://feeds.citibikenyc.com/stations/stations.json";
		URL url = new URL(baseurl);
		
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		
		conn.setRequestMethod("Get");
		
		if(conn.getResponseCode() == 200) {
			BufferedReader bf = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line ="";
			while((line = bf.readLine()) !=null) {
				System.out.println(line);
			}
			
		}
	}
	
	private static void grepStationList(String line) {
		List<String> list = new ArrayList<>();
		
	}
	
	
	public static void main(String[] args) {
		try {
			getData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
