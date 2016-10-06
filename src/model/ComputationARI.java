package model;

public class ComputationARI {
	private String server_type;// virtual server, dedicated server
	private String operating_system; //Windows Server 2008R2, Windows Server 7, Linux Redhat Server 7, ESXi 5.5
	private String size_RAM;
	private String processor_type; // i3, i5, i7, Xeon
	
	public String getServer_type() {
		return server_type;
	}
	public void setServer_type(String server_type) {
		this.server_type = server_type;
	}
	public String getOperating_system() {
		return operating_system;
	}
	public void setOperating_system(String operating_system) {
		this.operating_system = operating_system;
	}
	public String getSize_RAM() {
		return size_RAM;
	}
	public void setSize_RAM(String size_RAM) {
		this.size_RAM = size_RAM;
	}
	public String getProcessor_type() {
		return processor_type;
	}
	public void setProcessor_type(String processor_type) {
		this.processor_type = processor_type;
	}
	
	
}
