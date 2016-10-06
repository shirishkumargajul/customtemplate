package Information;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import model.NetworkARI;

public class GeneralInformation extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	public String getGeneralInfo() {
		GeneralARI general = new GeneralARI();
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("general", general);
		return SUCCESS;
	}

}
