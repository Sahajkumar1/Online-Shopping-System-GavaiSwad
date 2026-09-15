package com.softpro.GanwaiSwad.CommonHelper;

import org.springframework.stereotype.Component;

@Component("common_helper")
public class CommonHelper {
  private String BASE_URL = "http://localhost:8080";
  public String baseUrl() {
	  return BASE_URL;
  }
  public String baseUrl(String url) {
	  return BASE_URL + url ;
  }
}
