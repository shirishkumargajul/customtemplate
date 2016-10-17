package com.geni.actions;

import com.apple.eawt.Application;
import com.geni.beans.ApplicationRI;
import com.geni.beans.ComputationARI;
import com.geni.beans.GeneralARI;
import com.geni.beans.NetworkARI;
import com.geni.beans.SoftwareARI;
import com.geni.beans.StorageARI;
import com.geni.services.CustomTemplateService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TemplateGeneration extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	public String getXML() {
		ActionContext ctx = ActionContext.getContext();
		
		GeneralARI general = (GeneralARI) ctx.getSession().get("general");
		NetworkARI network = (NetworkARI) ctx.getSession().get("network");
		StorageARI storage = (StorageARI) ctx.getSession().get("storage");
		ComputationARI computation = (ComputationARI) ctx.getSession().get("computation");
		SoftwareARI software = (SoftwareARI) ctx.getSession().get("software");
		ApplicationRI appARI = new ApplicationRI();
		appARI.setGeneral(general);
		appARI.setNetwork(network);
		appARI.setStorage(storage);
		appARI.setComputation(computation);
		appARI.setSoftware(software);
		
		CustomTemplateService service = new CustomTemplateService();
		service.deployResources(appARI);
		
		return SUCCESS;
	}

}
