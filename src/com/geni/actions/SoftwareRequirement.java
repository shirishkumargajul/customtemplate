package com.geni.actions;

import com.geni.beans.ApplicationRI;
import com.geni.beans.ComputationARI;
import com.geni.beans.NetworkARI;
import com.geni.beans.SoftwareARI;
import com.geni.beans.StorageARI;
import com.geni.services.ARI_Generation_Service;
import com.geni.services.MacroOperatorService;
import com.mysql.jdbc.StringUtils;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class SoftwareRequirement extends ActionSupport implements ModelDriven<SoftwareARI>{

	private static final long serialVersionUID = 1L;
	
	
	private SoftwareARI software = new SoftwareARI();
	
	public SoftwareARI getSoftware() {
		return software;
	}
	public void setSoftware(SoftwareARI software) {
		this.software = software;
	}
	
	public boolean isValid() {
		boolean val = true;
		if (StringUtils.isNullOrEmpty(software.getWebServer())) {
			addFieldError("webServer", "Select a web server");
			val = false;
		}
		if (StringUtils.isNullOrEmpty(software.getDatabaseServer())) {
			addFieldError("databaseServer", "Select a DB server");
			val = false;
		}
		return val;
	}
	
	public String display() {
		return NONE;
	}
	
	public String setSoftwareReq() {
		if (!isValid()) {
			return INPUT;
		} else {
			System.out.println(software.getWebServer());
			System.out.println(software.getDatabaseServer());
			
			ActionContext ctx = ActionContext.getContext();
			ctx.getSession().put("software", software);
			return SUCCESS;
		}
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

	@Override
	public SoftwareARI getModel() {
		return software;
	}
}
