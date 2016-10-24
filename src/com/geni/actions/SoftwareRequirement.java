package com.geni.actions;

import java.util.ArrayList;
import java.util.List;

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
	private List<String> yesOrNoList;
 	private List<String> webServerList;
	private List<String> dbServerList;
	
	
	public List<String> getYesOrNoList() {
		return yesOrNoList;
	}
	public void setYesOrNoList(List<String> yesOrNoList) {
		this.yesOrNoList = yesOrNoList;
	}
	public List<String> getWebServerList() {
		return webServerList;
	}
	public void setWebServerList(List<String> webServerList) {
		this.webServerList = webServerList;
	}
	public List<String> getDbServerList() {
		return dbServerList;
	}
	public void setDbServerList(List<String> dbServerList) {
		this.dbServerList = dbServerList;
	}
	public SoftwareARI getSoftware() {
		return software;
	}
	public void setSoftware(SoftwareARI software) {
		this.software = software;
	}
	
	public SoftwareRequirement() {
		yesOrNoList = new ArrayList<String>();
		yesOrNoList.add(getText("list.no"));
		yesOrNoList.add(getText("list.yes"));
		
		webServerList = new ArrayList<String>();
		webServerList.add(getText("web.none"));
		webServerList.add(getText("web.apache"));
		webServerList.add(getText("web.gws"));
		webServerList.add(getText("web.nginx"));
		
		dbServerList = new ArrayList<String>();
		dbServerList.add(getText("db.none"));
		dbServerList.add(getText("db.mysql"));
		dbServerList.add(getText("db.postgreSql"));
		dbServerList.add(getText("db.maria"));
	}
	
	public String getDefaultWebServer() {
		return getText("web.apache");
	}
	public String getDefaultDBServer() {
		return getText("db.mysql");
	}
	
	public boolean isValid() {
		boolean val = true;
		if (software.getWebServerRequired().equals(getText("list.yes"))) {
			if (software.getWebServer().equals("null") || software.getWebServer().isEmpty()) {
				addFieldError("webServer", getText("error.webServer"));
				val = false;
			}
		}
		if (software.getDbServerRequired().equals(getText("list.yes"))) {
			if (software.getDatabaseServer().equals("null") || software.getDatabaseServer().isEmpty()) {
				addFieldError("databaseServer", getText("error.dbServer"));
				val = false;
			}
		}
		return val;
	}
	
	public String display() {
		this.software.setWebServerRequired(getText("list.yes"));
		this.software.setDbServerRequired(getText("list.yes"));
		return NONE;
	}
	
	public String setSoftwareReq() {
		if (!isValid()) {
			return INPUT;
		} else {
			System.out.println(software.getWebServerRequired());
			System.out.println(software.getWebServer());
			System.out.println(software.getDbServerRequired());
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
