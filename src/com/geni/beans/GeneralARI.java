package com.geni.beans;

public class GeneralARI {
	private String appName;
	private String appKind;
	private String appPriority;
	private String appDataSize;
	private int noOfNodes;
	
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppKind() {
		return appKind;
	}
	public void setAppKind(String appKind) {
		this.appKind = appKind;
	}
	public int getNoOfNodes() {
		return noOfNodes;
	}
	public void setNoOfNodes(int noOfNodes) {
		this.noOfNodes = noOfNodes;
	}
	public String getAppPriority() {
		return appPriority;
	}
	public void setAppPriority(String appPriority) {
		this.appPriority = appPriority;
	}
	public String getAppDataSize() {
		return appDataSize;
	}
	public void setAppDataSize(String appDataSize) {
		this.appDataSize = appDataSize;
	}
	
}
