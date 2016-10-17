package com.geni.actions;

import com.geni.beans.ApplicationRI;
import com.geni.beans.ComputationARI;
import com.geni.beans.NetworkARI;
import com.geni.beans.Precondition;
import com.geni.beans.SoftwareARI;
import com.geni.beans.StorageARI;
import com.geni.services.ARI_Generation_Service;
import com.geni.services.MacroOperatorService;
import com.geni.services.PreconditionService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SoftwareInformation extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private String web_server;
	private String database_server;
	
	
	public String getWeb_server() {
		return web_server;
	}

	public void setWeb_server(String web_server) {
		this.web_server = web_server;
	}

	public String getDatabase_server() {
		return database_server;
	}

	public void setDatabase_server(String database_server) {
		this.database_server = database_server;
	}

	public String getSoftwareInformation() {
		SoftwareARI software = new SoftwareARI();
		software.setWebServer(this.getWeb_server());
		software.setDatabaseServer(this.getDatabase_server());
		
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("software", software);
		return SUCCESS;
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
