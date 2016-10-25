package com.geni.beans;

public class MacroOperator {
	
	private String macid;
	private String ariId;
	private GeneralMac generalMac;
	private NetworkMac networkMac;
	private StorageMac storageMac;
	private ComputationMac computationMac;
	private float totalCost;
	
	public String getMacid() {
		return macid;
	}
	public void setMacid(String macid) {
		this.macid = macid;
	}
	public String getAriId() {
		return ariId;
	}
	public void setAriId(String ariId) {
		this.ariId = ariId;
	}
	public GeneralMac getGeneralMac() {
		return generalMac;
	}
	public void setGeneralMac(GeneralMac generalMac) {
		this.generalMac = generalMac;
	}
	public NetworkMac getNetworkMac() {
		return networkMac;
	}
	public void setNetworkMac(NetworkMac networkMac) {
		this.networkMac = networkMac;
	}
	public StorageMac getStorageMac() {
		return storageMac;
	}
	public void setStorageMac(StorageMac storageMac) {
		this.storageMac = storageMac;
	}
	public ComputationMac getComputationMac() {
		return computationMac;
	}
	public void setComputationMac(ComputationMac computationMac) {
		this.computationMac = computationMac;
	}
	public float getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}
	
}
