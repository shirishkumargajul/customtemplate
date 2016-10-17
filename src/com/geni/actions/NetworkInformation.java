package com.geni.actions;

import com.geni.beans.NetworkARI;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class NetworkInformation extends ActionSupport implements ModelDriven<NetworkARI>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private NetworkARI network = new NetworkARI();

	public NetworkARI getNetwork() {
		return network;
	}

	public void setNetwork(NetworkARI network) {
		this.network = network;
	}
	
	public void validate () {
		if (network.getBandwidth().equals("null")) {
			addFieldError("bandwidth", "Please choose bandwidth");
		}
		if (network.getLayer().equals("null")) {
			addFieldError("layer", "Please choose a layer");
		}
	}
	
	public String getNetworkInformation() {
		
		System.out.println(network.getBandwidth());
		System.out.println(network.getIsolated());
		System.out.println(network.getLayer());
		System.out.println(network.getIp());
		System.out.println(network.getNfv());
		System.out.println(network.getNetworkType());
		
		//set default bandwidth
		if (network.getBandwidth().equals("default")) {
			network.setBandwidth("10-20Mbps");
		}
		
		//set default isolated
		if (network.getIsolated().equals("default")) {
			network.setIsolated("no");
		}
		
		//set default layer
		if (network.getLayer().equals("default")) {
			network.setLayer("l3");
		}
		
		//set default ip
		if (network.getIp().equals("default")) {
			network.setIp("public");
		}
		
		//set default nfv
		if (network.getNfv().equals("default")) {
			network.setNfv("no");
		}
		
		//set default networkType
		if (network.getNetworkType().equals("default")) {
			network.setNetworkType("wired");
		}
		
		//set isolated or vpn and layer
		if (network.getIsolated().equals("yes") || network.getLayer().equals("l2")) {
			network.setLayer("l2");
		} else {
			network.setLayer("l3");
		}
		
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("network", network);
		
		return SUCCESS;
	}

	@Override
	public NetworkARI getModel() {
		return network;
	}

}
