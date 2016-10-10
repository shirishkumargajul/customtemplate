package com.geni.actions;

import com.geni.beans.ApplicationRI;
import com.geni.beans.ComputationARI;
import com.geni.beans.NetworkARI;
import com.geni.beans.Precondition;
import com.geni.beans.StorageARI;
import com.geni.services.ARI_Generation_Service;
import com.geni.services.MacroOperatorService;
import com.geni.services.PreconditionService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ComputationInformation extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int vm_cores;
	private String operating_system;
	private String dedicated_GPU_requirement;
	private String computation_RAM;
	
	public int getVm_cores() {
		return vm_cores;
	}

	public void setVm_cores(int vm_cores) {
		this.vm_cores = vm_cores;
	}

	public String getOperating_system() {
		return operating_system;
	}

	public void setOperating_system(String operating_system) {
		this.operating_system = operating_system;
	}

	public String getDedicated_GPU_requirement() {
		return dedicated_GPU_requirement;
	}

	public void setDedicated_GPU_requirement(String dedicated_GPU_requirement) {
		this.dedicated_GPU_requirement = dedicated_GPU_requirement;
	}

	public String getComputation_RAM() {
		return computation_RAM;
	}

	public void setComputation_RAM(String computation_RAM) {
		this.computation_RAM = computation_RAM;
	}
	
	public boolean isRamSizeValid() {
		return true;
	}

	public String getComputationInformation() {
		
		System.out.println(this.getVm_cores());
		System.out.println(this.getOperating_system());
		System.out.println(this.getDedicated_GPU_requirement());
		System.out.println(this.getComputation_RAM());
		
		ComputationARI computation = new ComputationARI();
		
		//set no. of vm instances
		computation.setNoOfVmInstances(this.getVm_cores());
		
		//set operating system
		if(this.getOperating_system().equals("operating_system_1")){
			computation.setOperatingSystem("Windows Server 2008R2");
		}else if(this.getOperating_system().equals("operating_system_2")){
			computation.setOperatingSystem("Windows Server 7");
		}else if(this.getOperating_system().equals("operating_system_3")){
			computation.setOperatingSystem("Linux Redhat Server 7");
		}else if(this.getOperating_system().equals("operating_system_4")){
			computation.setOperatingSystem("ESXi 5.5");
		}else{
			computation.setOperatingSystem("Ubuntu Server");
		}
		
		//set RAM size
		if (isRamSizeValid()) {
			computation.setRamSize(this.getComputation_RAM());
		}
		
		//set GPU requirement
		if (this.getDedicated_GPU_requirement().equals("dedicated_GPU_yes")) {
			computation.setGpu("yes");
		} else {
			computation.setGpu("no");
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
	
	public boolean generateARI() {
		boolean flag = false;
		
		ARI_Generation_Service ARIservice = new ARI_Generation_Service();
		
		
		ActionContext ctx = ActionContext.getContext();
		
		String emailID = (String) ctx.getSession().get("emailid");
		NetworkARI network = (NetworkARI) ctx.getSession().get("network");
		StorageARI storage = (StorageARI) ctx.getSession().get("storage");
		ComputationARI computation = (ComputationARI) ctx.getSession().get("computation");
		
		ApplicationRI ARI = ARIservice.generateARI(emailID, network, storage, computation);
		flag = ARIservice.insertARI(ARI);
		
		MacroOperatorService macro_service = new MacroOperatorService();
		macro_service.MacroOperatorGeneration(Integer.parseInt(ARI.getApprID()));
		return flag;
	}
	
	//added by arjun
	public boolean generatePrecondition() {
		PreconditionService precondtionService = new PreconditionService();
		
		ActionContext ctx = ActionContext.getContext();
		
		String emailID = (String) ctx.getSession().get("emailid");
		NetworkARI network = (NetworkARI) ctx.getSession().get("network");
		StorageARI storage = (StorageARI) ctx.getSession().get("storage");
		ComputationARI computation = (ComputationARI) ctx.getSession().get("computation");
		
		Precondition preconditon = precondtionService.generatePrecondition(emailID, network, storage, computation);
		System.out.println(preconditon.toString());
		return true;
	}
	
}
