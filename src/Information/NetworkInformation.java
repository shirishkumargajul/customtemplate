package Information;

import model.NetworkARI;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class NetworkInformation extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String bandwidth;		// bandwidth of the network
	private String isolated;		// layer L2 or L3
	private String NFV; 			// nfv capability
	private String resourceType; 	// wiered or sdn

	public String getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(String bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getIsolated() {
		return isolated;
	}

	public void setIsolated(String isolated) {
		this.isolated = isolated;
	}

	public String getNFV() {
		return NFV;
	}

	public void setNFV(String nFV) {
		NFV = nFV;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}


	public String getNetworkInformation() {
		
		System.out.println(this.getBandwidth());
		System.out.println(this.getIsolated());
		System.out.println(this.getNFV());
		System.out.println(this.getResourceType());
		//
		NetworkARI network = new NetworkARI();

		// set network bandwidth
		if (this.getBandwidth().equals("bandwidth_opt1")) {
			network.setBandwidth("10Mbps");
		} else if (this.getBandwidth().equals("bandwidth_opt2")) {
			network.setBandwidth("20Mbps");
		} else if (this.getBandwidth().equals("bandwidth_opt3")) {
			network.setBandwidth("1Gbps");
		} else if (this.getBandwidth().equals("bandwidth_opt4")) {
			network.setBandwidth("10Gbps");
		} else if (this.getBandwidth().equals("bandwidth_opt5")) {
			network.setBandwidth("100Gbps");
		} else {
			network.setBandwidth(null);
		}
		
		// set network layer type
		if (this.getResourceType().equals("resourceType_wired")) {
			network.setNetworkType("wired");
		} else {
			network.setNetworkType("sdn");
		}
		
		//set nfv capability
		if (this.getNFV().equals("NFV_no")) {
			network.setNfv("yes");
		} else {
			network.setNfv("no");
		}
		
		//set isolated or vpn
		if (this.getIsolated().equals("isolated_no")) {
			network.setLayer("L3");
		} else {
			network.setLayer("L4");
		}
		
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("network", network);
		return SUCCESS;
	}
}
