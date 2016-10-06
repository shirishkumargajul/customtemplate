package Information;

import model.StorageARI;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class StorageInformation extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String storage_size;
	private String storage_type;
	private String hard_drive;
	private String storage_backup;
	public String getStorage_size() {
		return storage_size;
	}
	public void setStorage_size(String storage_size) {
		this.storage_size = storage_size;
	}
	public String getStorage_type() {
		return storage_type;
	}
	public void setStorage_type(String storage_type) {
		this.storage_type = storage_type;
	}
	public String getHard_drive() {
		return hard_drive;
	}
	public void setHard_drive(String hard_drive) {
		this.hard_drive = hard_drive;
	}
	public String getStorage_backup() {
		return storage_backup;
	}
	public void setStorage_backup(String storage_backup) {
		this.storage_backup = storage_backup;
	}
	
	public String getStorageInformation(){
		System.out.println(this.getStorage_size());
		System.out.println(this.getStorage_type());
		System.out.println(this.getHard_drive());
		System.out.println(this.getStorage_backup());
		//
		StorageARI storage = new StorageARI();
		//set storage size--10Mbps, 20Mbps, 1Gbps, 10Gbps, and 100 Gbps
		if(!this.getStorage_size().equals(null) && !this.getStorage_size().equals("Storage Size")){
			storage.setStorage_size(this.getStorage_size());
		}else{
			storage.setStorage_size(null);
		}
		//set storage type--local / remote storage
		if(this.getStorage_type().equals("storage_local")){
			storage.setStorage_type("Local Storage");
		}else if(this.getStorage_type().equals("storage_remote")){
			storage.setStorage_type("Remote Storage");
		}else{
			storage.setStorage_size("Local Storage,Remote Storage");
		}
		//set  storage_disk--HDD,SSD
		if(this.getHard_drive().equals("hard_drive_HDD")){
			storage.setStorage_disk("HDD");
		}else if(this.getHard_drive().equals("hard_drive_SSD")){
			storage.setStorage_disk("SSD");
		}else{
			storage.setStorage_disk("HDD,SSD");
		}
		//set storage_presistent
		if(this.getStorage_backup().equals("storage_backup_yes")){
			storage.setStorage_persistent("persistent");
		}else if(this.getStorage_backup().equals("storage_backup_no")){
			storage.setStorage_persistent("non persistent");
		}else{
			storage.setStorage_persistent("persistent,non persistent");
		}
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("storage", storage);
		
		return SUCCESS;
	}
}
