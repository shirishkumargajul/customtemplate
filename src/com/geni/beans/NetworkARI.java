package com.geni.beans;

public class NetworkARI {
	private String bandwidth;// 10Mbps, 20Mbps, 1Gbps, 10Gbps, and 100Gbps
	private String layer;// layer 2, layer 3, and all (mapped to isolated network)
	//private String resources_type;// VPN,NFV,Hardware,SDN, and all
	private String nfv;
	private String networkType;

	public String getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(String bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getLayer() {
		return layer;
	}

	public void setLayer(String layer) {
		this.layer = layer;
	}

	public String getNfv() {
		return nfv;
	}

	public void setNfv(String nfv) {
		this.nfv = nfv;
	}

	public String getNetworkType() {
		return networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}


}
