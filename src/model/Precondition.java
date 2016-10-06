package model;

public class Precondition {
	private String Precondition_ID;
	private String User_ID;
	private ComputationARI Computation_Req_ID;
	private StorageARI Storage_Req_ID;
	private NetworkARI Network_Req_ID;

	public String getPrecondition_ID() {
		return Precondition_ID;
	}

	public void setPrecondition_ID(String precondition_ID) {
		Precondition_ID = precondition_ID;
	}

	public String getUser_ID() {
		return User_ID;
	}

	public void setUser_ID(String user_ID) {
		User_ID = user_ID;
	}

	public ComputationARI getComputation_Req_ID() {
		return Computation_Req_ID;
	}

	public void setComputation_Req_ID(ComputationARI computation_Req_ID) {
		Computation_Req_ID = computation_Req_ID;
	}

	public StorageARI getStorage_Req_ID() {
		return Storage_Req_ID;
	}

	public void setStorage_Req_ID(StorageARI storage_Req_ID) {
		Storage_Req_ID = storage_Req_ID;
	}

	public NetworkARI getNetwork_Req_ID() {
		return Network_Req_ID;
	}

	public void setNetwork_Req_ID(NetworkARI network_Req_ID) {
		Network_Req_ID = network_Req_ID;
	}

}
