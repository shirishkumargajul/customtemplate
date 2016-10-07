package model;

public class StorageARI {

	private String storageSize;
	private String storageType; 	// local, remote
	private String storageLocation;	// storage geo location if storage type is remote
	private String storageDisk; 	// HDD, SSD
	private String storageBackup; 	// persistent, non persistent

	public String getStorageSize() {
		return storageSize;
	}

	public void setStorageSize(String storageSize) {
		this.storageSize = storageSize;
	}

	public String getStorageType() {
		return storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}

	public String getStorageDisk() {
		return storageDisk;
	}

	public void setStorageDisk(String storageDisk) {
		this.storageDisk = storageDisk;
	}

	public String getStorageBackup() {
		return storageBackup;
	}

	public void setStorageBackup(String storageBackup) {
		this.storageBackup = storageBackup;
	}

	public String getStorageLocation() {
		return storageLocation;
	}

	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}
	
	

}
