package model;

public class NetworkARI {
	private String bandwidth;// 10Mbps, 20Mbps, 1Gbps, 10Gbps, and 100Gbps
	private String layer;// layer 2, layer 3, and all
	private String resources_type;// VPN,NFV,Hardware,SDN, and all

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

	public String getResources_type() {
		return resources_type;
	}

	public void setResources_type(String resources_type) {
		this.resources_type = resources_type;
	}

}
