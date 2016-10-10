package com.geni.services;

import com.geni.beans.*;

import Dao.ARI_Dao;

public class ARI_Generation_Service {
	private ApplicationRI ARI = new ApplicationRI();
	ARI_Dao ARI_Dao = new ARI_Dao();
	
	public ApplicationRI getARI() {
		return ARI;
	}
	public void setARI(ApplicationRI aRI) {
		ARI = aRI;
	}
	
	public ApplicationRI generateARI(String emailID,NetworkARI network,StorageARI storage, ComputationARI computation){
		this.getARI().setNetwork(network);
		this.getARI().setStorage(storage);
		this.getARI().setComputation(computation);
		this.getARI().setEmailID(emailID);
		String ARI_ID = ARI_Dao.assignARItoUser(emailID);
		this.getARI().setApprID(ARI_ID);
		return this.getARI();
	}
	
	public boolean insertARI(ApplicationRI ARI){
		return ARI_Dao.insertARI(ARI);
	}
	
}
