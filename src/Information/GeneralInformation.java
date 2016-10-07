package Information;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import model.GeneralARI;

public class GeneralInformation extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private String appName;
	private String appKind;
	private String [] computePriority;
	private String [] networkPriority;
	private String [] storagePriority;
	
	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppKind() {
		return appKind;
	}

	public void setAppKind(String appKind) {
		this.appKind = appKind;
	}

	public String[] getComputePriority() {
		return computePriority;
	}

	public void setComputePriority(String[] computePriority) {
		this.computePriority = computePriority;
	}

	public String[] getNetworkPriority() {
		return networkPriority;
	}

	public void setNetworkPriority(String[] networkPriority) {
		this.networkPriority = networkPriority;
	}

	public String[] getStoragePriority() {
		return storagePriority;
	}

	public void setStoragePriority(String[] storagePriority) {
		this.storagePriority = storagePriority;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getGeneralInfo() {
		
		System.out.println(this.getAppName());
		System.out.println(this.getAppKind());
		
		GeneralARI general = new GeneralARI();
		general.setAppKind(this.getAppKind());
		general.setAppName(this.getAppName());
		
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("general", general);
		return SUCCESS;
	}

}
