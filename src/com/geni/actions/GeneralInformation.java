package com.geni.actions;

import java.util.ArrayList;
import java.util.List;

import com.geni.beans.GeneralARI;
import com.mysql.jdbc.StringUtils;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class GeneralInformation extends ActionSupport implements ModelDriven<GeneralARI> {

	private static final long serialVersionUID = 1L;

	private GeneralARI general = new GeneralARI();
	private List<String> nodeList;

	public GeneralInformation() {
		nodeList = new ArrayList<String>();
		nodeList.add("1");
		nodeList.add("2");
		nodeList.add("3");
		nodeList.add("4");
		nodeList.add("5");
	}

	public List<String> getNodeList() {
		return nodeList;
	}

	public void setNodeList(List<String> nodeList) {
		this.nodeList = nodeList;
	}

	public GeneralARI getGeneral() {
		return general;
	}

	public void setGeneral(GeneralARI general) {
		this.general = general;
	}

	public void validate() {
		if (StringUtils.isEmptyOrWhitespaceOnly(general.getAppName())) {
			addFieldError("appName", "Application name cannot be empty");
		}
		if (general.getAppKind().equals("null")) {
			addFieldError("appKind", "Please choose the application type");
		}
		if (general.getAppPriority().equals("null")) {
			addFieldError("appPriority", "Please choose application priority");
		}
		if (general.getAppDataSize().equals("null")) {
			addFieldError("appDataSize", "Please choose application data size");
		}
	}

	public String display() {
		return NONE;
	}

	public String getGeneralInfo() {

		System.out.println(general.getAppName());
		System.out.println(general.getAppKind());
		System.out.println(general.getAppPriority());
		System.out.println(general.getAppDataSize());
		System.out.println(general.getNoOfNodes());

		// set default appPriority
		if (general.getAppPriority().equals("default")) {
			general.setAppPriority("availability");
		}

		// set default appKind
		if (general.getAppKind().equals("default")) {
			general.setAppKind("webApp");
		}

		// set default dataSize
		if (general.getAppDataSize().equals("default")) {
			general.setAppDataSize("GB");
		}

		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("general", general);

		return SUCCESS;
	}

	public GeneralARI getModel() {
		return general;
	}

}
