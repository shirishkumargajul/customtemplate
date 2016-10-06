package Information;

import model.ApplicationRI;
import model.ComputationARI;
import model.NetworkARI;
import model.Precondition;
import model.StorageARI;

import Service.ARI_Generation_Service;
import Service.MacroOperatorService;
import Service.PreconditionService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ComputationInformation extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String virtual_server_requirement;
//	private String virtual_CPU_requirement;
//	private String virtual_memory_requirement;
//	private String dedicated_server_requirement;
//	private String dedicated_GPU_requirement;
//	private String hypervisor_requirement;
	private String operating_system;
	private String computation_processor;
	private String computation_RAM;
	
	public String getVirtual_server_requirement() {
		return virtual_server_requirement;
	}
	public void setVirtual_server_requirement(String virtual_server_requirement) {
		this.virtual_server_requirement = virtual_server_requirement;
	}
	public String getOperating_system() {
		return operating_system;
	}
	public void setOperating_system(String operating_system) {
		this.operating_system = operating_system;
	}
	public String getComputation_processor() {
		return computation_processor;
	}
	public void setComputation_processor(String computation_processor) {
		this.computation_processor = computation_processor;
	}
	public String getComputation_RAM() {
		return computation_RAM;
	}
	public void setComputation_RAM(String computation_RAM) {
		this.computation_RAM = computation_RAM;
	}
	
	public String getComputationInformation(){
		System.out.println(this.getVirtual_server_requirement());
		System.out.println(this.getOperating_system());
		System.out.println(this.getComputation_processor());
		System.out.println(this.getComputation_RAM());
		
		ComputationARI computation = new ComputationARI();
		//set server type
		if(this.getVirtual_server_requirement().equals("virtual_server_yes")){
			computation.setServer_type("Virtual Server");
		}else if(this.getVirtual_server_requirement().equals("virtual_server_no")){
			computation.setServer_type("Dedicated Server");
		}else{
			computation.setServer_type("Virtual Server,Dedicated Server");
		}
		
		//set operating system
		if(this.getOperating_system().equals("operating_system_1")){
			computation.setOperating_system("Windows Server 2008R2");
		}else if(this.getOperating_system().equals("operating_system_2")){
			computation.setOperating_system("Windows Server 7");
		}else if(this.getOperating_system().equals("operating_system_3")){
			computation.setOperating_system("Linux Redhat Server 7");
		}else if(this.getOperating_system().equals("operating_system_4")){
			computation.setOperating_system("ESXi 5.5");
		}else{
			computation.setOperating_system("Windows Server,Linux,ESXi");
		}
		
		//set processor
		if(this.getComputation_processor().equals("computation_processor_i3")){
			computation.setProcessor_type("i3");
		}else if(this.getComputation_processor().equals("computation_processor_i5")){
			computation.setProcessor_type("i5");
		}else if(this.getComputation_processor().equals("computation_processor_i7")){
			computation.setProcessor_type("i7");
		}else if(this.getComputation_processor().equals("computation_processor_intel")){
			computation.setProcessor_type("Xeon");
		}else{
			computation.setProcessor_type(null);
		}
		
		//set RAM size
		if(!this.getComputation_RAM().equals(null) && !this.getComputation_RAM().equals("RAM Size")){
			computation.setSize_RAM(this.getComputation_RAM());
		}
		
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("computation", computation);
		//generate ARI
		if(this.generateARI() == true){
			
			return SUCCESS;
		}else{
			return ERROR;
		}
		
	}
	
	public boolean generateARI(){
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
		return true;
	}
	
}
