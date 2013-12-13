package com.logmanager.app;

import java.io.IOException;

import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.json.jackson2.JacksonFactory;


public class App {

  private static final String PROJECT_ID = "log-manager-v1";
  private static final String CLIENTSECRETS_LOCATION = "client_secret.json";


  public static void main(String[] args) throws IOException {
	  GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(new JacksonFactory(), App.class.getClassLoader().getResourceAsStream(CLIENTSECRETS_LOCATION));

  
  }

}