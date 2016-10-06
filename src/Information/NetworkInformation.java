package Information;

import model.NetworkARI;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class NetworkInformation extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String bandwidth;
	private String isolated;
	private String VPN;
	private String NFV;
	private String resourceType;
	private String data_type;
	private String data_size;
	private String transferring_time;

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

	public String getVPN() {
		return VPN;
	}

	public void setVPN(String vPN) {
		VPN = vPN;
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

	public String getData_type() {
		return data_type;
	}

	public void setData_type(String data_type) {
		this.data_type = data_type;
	}

	public String getData_size() {
		return data_size;
	}

	public void setData_size(String data_size) {
		this.data_size = data_size;
	}

	public String getTransferring_time() {
		return transferring_time;
	}

	public void setTransferring_time(String transferring_time) {
		this.transferring_time = transferring_time;
	}

	public String getNetworkInformation() {
		
		System.out.println(this.getBandwidth());
		System.out.println(this.getIsolated());
		System.out.println(this.getVPN());
		System.out.println(this.getNFV());
		System.out.println(this.getResourceType());
		System.out.println(this.getData_type());
		System.out.println(this.getData_size());
		System.out.println(this.getTransferring_time());
		//
		NetworkARI network = new NetworkARI();
		// set network resources type
		if (this.getVPN().equals("VPN_yes")) {
			network.setResources_type("VPN");
		} else if (this.getNFV().equals("NFV_yes")) {
			network.setResources_type("NFV");
		} else if (this.getResourceType().equals("resourceType_wired")) {
			network.setResources_type("Hardware");
		} else if (this.getResourceType().equals("resourceType_sdn")) {
			network.setResources_type("SDN");
		} else {
			network.setResources_type("VPN,NFV,Hardware,SDN");
		}
		// set network layer type
		if (this.getIsolated().equals("isolated_yes")) {
			network.setLayer("L2");
		} else if (this.getIsolated().equals("isolated_no")) {
			if (this.getTransferring_time().equals("transferring_time_high")) {
				network.setLayer("L3");
			}
		} else {
			if (this.getTransferring_time().equals("transferring_time_high")) {
				network.setLayer("L3");
			} else if (this.getTransferring_time().equals("transferring_time_low")) {
				network.setLayer("L2");
			} else {
				network.setLayer("L2,L3");
			}
		}
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
		
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("network", network);
		return SUCCESS;
	}
}
