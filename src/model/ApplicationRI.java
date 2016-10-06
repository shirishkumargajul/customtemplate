package model;

public class ApplicationRI {
	private String emailID;
	private String apprID;
	private NetworkARI network;
	private StorageARI storage;
	private ComputationARI computation;
	
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getApprID() {
		return apprID;
	}
	public void setApprID(String apprID) {
		this.apprID = apprID;
	}
	public NetworkARI getNetwork() {
		return network;
	}
	public void setNetwork(NetworkARI network) {
		this.network = network;
	}
	public StorageARI getStorage() {
		return storage;
	}
	public void setStorage(StorageARI storage) {
		this.storage = storage;
	}
	public ComputationARI getComputation() {
		return computation;
	}
	public void setComputation(ComputationARI computation) {
		this.computation = computation;
	}
	
}