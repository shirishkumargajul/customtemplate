package com.geni.actions;

import com.geni.beans.GeneralARI;
import com.mysql.jdbc.StringUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class GeneralInformation extends ActionSupport implements ModelDriven<GeneralARI> {

	private static final long serialVersionUID = 1L;
	
	private GeneralARI general = new GeneralARI();
	
	public void validate() {
		if (StringUtils.isEmptyOrWhitespaceOnly(general.getAppName())) {
			addFieldError("GeneralARI.appName", "Application name cannot be empty");
		}
		if (general.getAppKind().equals("app_kind_null")) {
			addFieldError("appKind", "Please choose kind of application");
		}
	}

	public String getGeneralInfo() {
		
		System.out.println(general.getAppName());
		System.out.println(general.getAppKind());
		
		/*ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("general", general);*/
		return SUCCESS;
	}

	@Override
	public GeneralARI getModel() {
		return this.general;
	}

}
