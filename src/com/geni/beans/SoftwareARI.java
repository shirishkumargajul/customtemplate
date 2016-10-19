package com.geni.beans;

public class SoftwareARI {
	
	private String webServer;
	private String databaseServer;
	private AdditionalSoftware [] additionalSoftware;
	
	public String getWebServer() {
		return webServer;
	}
	public void setWebServer(String webServer) {
		this.webServer = webServer;
	}
	public String getDatabaseServer() {
		return databaseServer;
	}
	public void setDatabaseServer(String databaseServer) {
		this.databaseServer = databaseServer;
	}
	public AdditionalSoftware[] getAdditionalSoftware() {
		return additionalSoftware;
	}
	public void setAdditionalSoftware(AdditionalSoftware[] additionalSoftware) {
		this.additionalSoftware = additionalSoftware;
	}
	
	
}
