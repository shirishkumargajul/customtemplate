package com.geni.beans;

public class ComputationARI {

	private int noOfVmInstances; // no. of VM instances or cores
	private String operatingSystem; // Windows Server 2008R2, Windows Server 7,
									// Linux Redhat Server 7, ESXi 5.5
	private String ramSize; 		// size of the ram in Mb or Gb
	private String gpu;	 			// need gpu or not

	public int getNoOfVmInstances() {
		return noOfVmInstances;
	}

	public void setNoOfVmInstances(int noOfVmInstances) {
		this.noOfVmInstances = noOfVmInstances;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getRamSize() {
		return ramSize;
	}

	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

}
