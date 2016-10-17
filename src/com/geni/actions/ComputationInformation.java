package com.geni.actions;

import com.geni.beans.ComputationARI;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ComputationInformation extends ActionSupport implements ModelDriven<ComputationARI>{

	private static final long serialVersionUID = 1L;
	
	private ComputationARI computation = new ComputationARI();
	
	public ComputationARI getComputation() {
		return computation;
	}

	public void setComputation(ComputationARI computation) {
		this.computation = computation;
	}
	
	public void validate() {
		if (computation.getNoOfCores().equals("null")) {
			addFieldError("noOfCores", "Please choose no of cores");
		}
		if (computation.getDedicatedServer().equals("null")) {
			addFieldError("dedicatedServer", "Please choose dedicated server");
		}
		if (computation.getOperatingSystem().equals("null")) {
			addFieldError("operatingSystem", "Please choose operating system");
		}
		if (computation.getOsArchitecture().equals("null")) {
			addFieldError("osArchitecture", "Please choose architecture");
		}
		if (computation.getRamSize().equals("null")) {
			addFieldError("ramSize", "Please choose ram size");
		}
	}
	
	public String getComputationInformation() {
		
		System.out.println(computation.getNoOfCores());
		System.out.println(computation.getDedicatedServer());
		System.out.println(computation.getOperatingSystem());
		System.out.println(computation.getOsArchitecture());
		System.out.println(computation.getRamSize());
		System.out.println(computation.getGpu());
		System.out.println();
		
		//set default vm cores 
		if (computation.getNoOfCores().equals("null")) {
			computation.setNoOfCores("1");
		}
		
		//set default dedicated server
		if (computation.getDedicatedServer().equals("null")) {
			computation.setDedicatedServer("No");
		}
		
		//set default operating system
		if (computation.getOperatingSystem().equals("null")) {
			computation.setOperatingSystem("ubuntu_os_14");
		}
		
		//set default os architecture
		if (computation.getOsArchitecture().equals("null") && 
				(!computation.getRamSize().equals("512MB - 1GB") && !computation.getRamSize().equals("1GB - 2GB") && 
						!computation.getRamSize().equals("2GB - 4GB")) ) {
			computation.setOsArchitecture("64 bit");
		}
		
		//set default GPU
		if (computation.getGpu().equals("null")) {
			computation.setGpu("No");
		}
		
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("computation", computation);
		
		return SUCCESS;
		
		/*//generate ARI
		if(this.generateARI() == true){
			return SUCCESS;
		}else{
			return ERROR;
		}*/
		
	}

	@Override
	public ComputationARI getModel() {
		return computation;
	}
	
}
