package com.geni.actions;

import com.geni.beans.StorageARI;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class StorageInformation extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String storage_size;		//storage size in GB
	private String storage_type;		//local or remote
	private String storage_location;	//if remote then storage location
	private String storage_drive;		//HDD or SDD
	private String storage_backup;		//yes or no
	
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
	public String getStorage_drive() {
		return storage_drive;
	}
	public void setStorage_drive(String hard_drive) {
		this.storage_drive = hard_drive;
	}
	public String getStorage_backup() {
		return storage_backup;
	}
	public void setStorage_backup(String storage_backup) {
		this.storage_backup = storage_backup;
	}
	public String getStorage_location() {
		return storage_location;
	}
	public void setStorage_location(String storage_loc) {
		this.storage_location = storage_loc;
	}
	
	public boolean isStorageSizeValid() {
		return true;
	}

	
	public String getStorageInformation() {
		
		System.out.println(this.getStorage_size());
		System.out.println(this.getStorage_type());
		System.out.println(this.getStorage_location());
		System.out.println(this.getStorage_drive());
		System.out.println(this.getStorage_backup());
		
		StorageARI storage = new StorageARI();
		
		//set storage size-- 10Gb, 50Gb, 100Gb
		if (isStorageSizeValid()) {
			storage.setStorageSize(this.getStorage_size());
		}
		
		//set storage type--local / remote storage
		if (this.getStorage_type().equals("storage_remote")){
			storage.setStorageType("remote");
		} else {
			storage.setStorageType("local"); //default value
		}
		
		//set storage location if storage type is remote
		if (this.getStorage_location().equals("storage_location_null")) {
			storage.setStorageLocation(null);
		} else if (this.getStorage_location().equals("storage_location_east")) {
			storage.setStorageLocation("east");
		} else if (this.getStorage_location().equals("storage_location_central")) {
			storage.setStorageLocation("west");
		} else if (this.getStorage_location().equals("storage_location_west")) {
			storage.setStorageLocation("central");
		}
		
		//set  storage_disk--HDD,SSD
		if (this.getStorage_drive().equals("storage_drive_SSD")) {
			storage.setStorageDisk("SDD");
		} else {
			storage.setStorageDisk("HDD");
		}
		
		//set storage_presistent
		if (this.getStorage_backup().equals("storage_backup_yes")) {
			storage.setStorageBackup("yes");
		} else {
			storage.setStorageBackup("no");
		}
		
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("storage", storage);
		
		return SUCCESS;
	}
}
