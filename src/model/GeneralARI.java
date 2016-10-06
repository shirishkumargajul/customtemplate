package model;

public class GeneralARI {
	private String appName;
	private String appKind;
	private String [] computePriority;
	private String [] networkPriority;
	private String [] storagePriority;
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
	public String[] getComputePriority() {
		return computePriority;
	}
	public void setComputePriority(String[] computePriority) {
		this.computePriority = computePriority;
	}
	public String[] getNetworkPriority() {
		return networkPriority;
	}
	public void setNetworkPriority(String[] networkPriority) {
		this.networkPriority = networkPriority;
	}
	public String[] getStoragePriority() {
		return storagePriority;
	}
	public void setStoragePriority(String[] storagePriority) {
		this.storagePriority = storagePriority;
	}
	
	
}
