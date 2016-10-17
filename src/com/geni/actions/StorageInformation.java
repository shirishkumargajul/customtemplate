package com.geni.actions;

import com.geni.beans.StorageARI;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StorageInformation extends ActionSupport implements ModelDriven<StorageARI>{

	private static final long serialVersionUID = 1L;
	
	private StorageARI storage = new StorageARI();
	
	public void validate() {
		if (storage.getLocalStorageDisk().equals("null")) {
			addFieldError("localStorageSize", "Please choose local storage size");
		}
		if (storage.getLocalStorageDisk().equals("null")) {
			addFieldError("localStorageDisk", "Please choose storage disk");
		}
		if (storage.getRemoteStorage().equals("null")) {
			addFieldError("remoteStorage", "Please choose remote storage");
		}
		
		if (storage.getRemoteStorage().equals("Yes")) {
			if (storage.getRemoteStorageSize().equals("null")) {
				addFieldError("remoteStorageSize", "Please choose remote storage size");
			}
			if (storage.getRemoteStorageDisk().equals("null")) {
				addFieldError("remoteStorageDisk", "Please choose remote storage disk");
			}
			if (storage.getRemoteStorageLocation().equals("null")) {
				addFieldError("remoteStorageLocation", "Please choose remote storage location");
			}
		}
	}

	public String getStorageInformation() {
		
		System.out.println(storage.getLocalStorageSize());
		System.out.println(storage.getLocalStorageDisk());
		System.out.println(storage.getRemoteStorage());
		System.out.println();
		System.out.println();
		System.out.println();
		
		//set default local storage disk type
		if (storage.getLocalStorageDisk().equals("default")) {
			storage.setLocalStorageDisk("HDD");
		}
		
		//set default remote storage
		if (storage.getRemoteStorage().equals("default")) {
			storage.setRemoteStorage("No");
		}
		
		
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("storage", storage);
		
		return SUCCESS;
	}

	@Override
	public StorageARI getModel() {
		return storage;
	}
}
