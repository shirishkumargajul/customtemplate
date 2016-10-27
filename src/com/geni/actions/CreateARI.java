package com.geni.actions;


import java.util.List;

import com.geni.beans.ComputationARI;
import com.geni.beans.GeneralARI;
import com.geni.beans.NetworkARI;
import com.geni.beans.SoftwareARI;
import com.geni.beans.StorageARI;
import com.geni.services.ARI_Generation_Service;
import com.geni.services.MacroOperatorService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class CreateARI extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String generateARI() {
		String flag = ERROR;
		List<String> macIdList = null;
		
		System.out.println("inside generateARI() function of CreateARI class");
		
		ARI_Generation_Service ariService = new ARI_Generation_Service();
		
		
		ActionContext ctx = ActionContext.getContext();
		
		String emailID = (String) ctx.getSession().get("emailid");
		GeneralARI general = (GeneralARI) ctx.getSession().get("general");
		NetworkARI network = (NetworkARI) ctx.getSession().get("network");
		StorageARI storage = (StorageARI) ctx.getSession().get("storage");
		ComputationARI computation = (ComputationARI) ctx.getSession().get("computation");
		SoftwareARI software = (SoftwareARI) ctx.getSession().get("software");
		
		String ariId = ariService.generateARI(emailID, general, network, storage, computation, software);
		System.out.println("Inside CreateARI class; ariId = " + ariId);
		if (ariId != null) {
			MacroOperatorService macro_service = new MacroOperatorService();
			macIdList = macro_service.generateMacroOperator(network, storage, computation, software, ariId);
			if (macIdList != null) {
				for (String macId : macIdList) {
					System.out.println("Inside ARI class; macId = " + macId);
				}
				flag = SUCCESS;
			} else {
				System.out.println("macIdList is null");
			}
			
		} else {
			System.out.println("ari id is null");
		}
		return flag;
	}

}
