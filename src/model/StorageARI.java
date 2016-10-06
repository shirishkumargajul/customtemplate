package model;

public class StorageARI {
	private String storage_size;
	private String storage_type;//local, remote
	private String storage_disk;//HDD, SSD
	private String storage_persistent; //persistent, non persistent
	
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
	public String getStorage_disk() {
		return storage_disk;
	}
	public void setStorage_disk(String storage_disk) {
		this.storage_disk = storage_disk;
	}
	public String getStorage_persistent() {
		return storage_persistent;
	}
	public void setStorage_persistent(String storage_persistent) {
		this.storage_persistent = storage_persistent;
	}
	
	
}
