package com.geni.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.geni.beans.ComputationARI;
import com.geni.beans.MacroOperator;
import com.geni.beans.MacroOperatorQuery;
import com.geni.beans.NetworkARI;
import com.geni.beans.SoftwareARI;
import com.geni.beans.StorageARI;

import Dao.MacroOperatorDao;

public class MacroOperatorService {
	private Collection<MacroOperator> moCollection;
	private MacroOperatorDao macOpDao;
	//private ResourceSpaceDao rsd = new ResourceSpaceDao();
	
	public MacroOperatorService() {
		this.moCollection = new ArrayList<MacroOperator>();
		this.macOpDao = new MacroOperatorDao();
	}

	// public MacroOperatorService(int apprId){
	// setMo(new MacroOperator());
	// setMod(new MacroOperatorDao());
	// this.MacroOperatorGeneration(apprId);
	// }

/*	public boolean MacroOperatorGeneration(NetworkARI network, StorageARI storage, ComputationARI computation, SoftwareARI software,String apprId) {
		String ack = null;

		List<List<String>> tempPreconditionFeaturesList = new ArrayList<List<String>>();
		String resourceClass = null;
		String resource = null;
		if (mod.getDataFromARI(apprId).equals("SUCCESS")) {
			tempPreconditionFeaturesList = mod.getPreconditionFeaturesList();
			for (int i = 0; i < tempPreconditionFeaturesList.size(); i++) {
				String[] features = tempPreconditionFeaturesList.get(i).get(0)
						.split(",");
				if (features.length > 1) {
					for (int j = 0; j < features.length; j++) {
						if (j == 0) {
							mo.setDomain(features[0]);
						} else {
							resourceClass = features[j];
							mo.setResource(resource = rsd.findRealResource(mo.getDomain(), resourceClass).size() != 0 ? resourceClass : null);
							mo.setPrecondition(tempPreconditionFeaturesList
									.get(i).get(1));
							mo.setApplicationIdentifie(apprId);
							mod.insertMacroOperator2Database(mo);
						}
					}
				} else if (features.length == 1) {
					mo.setDomain(features[0]);
					mo.setResource(null);
					mo.setPrecondition(tempPreconditionFeaturesList.get(i).get(
							1));
					mo.setApplicationIdentifie(apprId);
					mod.insertMacroOperator2Database(mo);
				}
			}
			return true;
		} else {
			return false;
		}
	}*/

	public List<String> generateMacroOperator(NetworkARI networkARI, StorageARI storageARI, ComputationARI computationARI, SoftwareARI softwareARI, String ariId) {
		MacroOperatorQuery query = new MacroOperatorQuery();
		List<String> macIdList = null;
		
		query.setRamSizeLB(computationARI.getRamSizeLB());
		query.setRamSizeUB(computationARI.getRamSizeUB());
		
		query.setRamUnitsLB(computationARI.getRamUnitsLB());
		query.setRamUnitsUB(computationARI.getRamUnitsUB());
		
		query.setStorageSizeLB(4);//storageARI.getStorageSizeLB());
		query.setStorageSizeUB(8);//storageARI.getStorageSizeUB());
		
		query.setStorageUnitsLB(storageARI.getStorageUnitsLB());
		query.setStorageUnitsUB(storageARI.getStorageUnitsUB());
		
		query.setStorageDisk(storageARI.getLocalStorageDisk());
		query.setOs(computationARI.getOperatingSystem());
		query.setOsArch(computationARI.getOsArchitecture());
		query.setNoOfCores(Integer.parseInt(computationARI.getNoOfCores()));
		
		System.out.println("inside macoperator servcie class calling getMacOps functions");
		this.moCollection = macOpDao.getMacOps(query);
		if (moCollection != null) {
			macIdList = macOpDao.insertMacOpsToDB(moCollection, ariId);
		} else {
			System.out.println("getMacOps function returned null");
		}
		
		return macIdList;
		
	}
	

}
