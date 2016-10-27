package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.geni.beans.*;
import com.mysql.jdbc.*;
import com.sun.java.swing.plaf.motif.resources.motif_zh_CN;

import utility.MysqlJdbc;

public class MacroOperatorDao {
	// MacroOperator macro = new MacroOperator();
	/*
	 * private MacroOperatorQuery macro; private List<List<String>>
	 * preconditionFeaturesList;
	 * 
	 * public String getDataFromARI(int apprid) { List<List<String>>
	 * tempPreconditionFeaturesList = new ArrayList<List<String>>(); //
	 * List<Integer> tempApprid = new ArrayList<Integer>(); String Flag =
	 * "ERROR"; Connection connection = MysqlJdbc.getConnection(); Statement
	 * stmt = null; try {
	 * 
	 * String sql = "select * from applicationri where apprid = '" + apprid +
	 * "'"; stmt = connection.createStatement(); ResultSet rs =
	 * stmt.executeQuery(sql);
	 * 
	 * while (rs.next()) { List<String> onePreconditionFeaturesPair = new
	 * ArrayList<String>();
	 * onePreconditionFeaturesPair.add(rs.getString("features"));
	 * onePreconditionFeaturesPair.add(rs.getString("precondition")); // print
	 * the data we received System.out.println("feautures = " +
	 * rs.getString("features")); System.out.println("precondition = " +
	 * rs.getString("precondition"));
	 * 
	 * tempPreconditionFeaturesList.add(onePreconditionFeaturesPair); }
	 * setPreconditionFeaturesList(tempPreconditionFeaturesList); Flag =
	 * "SUCCESS";
	 * 
	 * } catch (SQLException e) { e.printStackTrace(); } finally {
	 * MysqlJdbc.closeConn(stmt, connection); } // print the data // for(int i =
	 * 0; i < tempPreconditionFeaturesList.size();i++){ // System.out.println(i
	 * + " = " + // tempPreconditionFeaturesList.get(i).get(0) + " || " + //
	 * tempPreconditionFeaturesList.get(i).get(1)); // } return Flag; }
	 * 
	 * public void insertMacroOperator2Database(MacroOperatorQuery mo) {
	 * setMacro(mo); // print data waiting to insert
	 * System.out.println(macro.getApplicationIdentifie() + " || " +
	 * macro.getDomain() + " || " + macro.getResource() + " || " +
	 * macro.getPrecondition()); Connection connection =
	 * MysqlJdbc.getConnection(); PreparedStatement pstmt = null; try {
	 * 
	 * String sql =
	 * "insert into macroperators(domain,resource,precondition,totalCost,ApplicationIdentifie) values(?,?,?,?,?)"
	 * ; pstmt = connection.prepareStatement(sql); pstmt.setString(1,
	 * macro.getDomain()); pstmt.setString(2, macro.getResource());
	 * pstmt.setString(3, macro.getPrecondition()); pstmt.setFloat(4, (float)
	 * 0.0); pstmt.setInt(5, macro.getApplicationIdentifie());
	 * pstmt.executeUpdate();
	 * 
	 * } catch (SQLException e) { e.printStackTrace(); } finally {
	 * MysqlJdbc.closeConn(pstmt, connection); } }
	 * 
	 * public MacroOperatorQuery getMacro() { return macro; }
	 * 
	 * public void setMacro(MacroOperatorQuery macro) { this.macro = macro; }
	 * 
	 * public List<List<String>> getPreconditionFeaturesList() { return
	 * preconditionFeaturesList; }
	 * 
	 * public void setPreconditionFeaturesList(List<List<String>>
	 * preconditionFeaturesList) { this.preconditionFeaturesList =
	 * preconditionFeaturesList; }
	 */

	public Collection<MacroOperator> getMacOps(MacroOperatorQuery query) {
		System.out.println("MacroOperator Dao class calling getConnection method");
		Collection<MacroOperator> macOps = null;
		Connection connection = MysqlJdbc.getConnection();
		Statement stmt = null;
		try {

			
			 String sql =
			 "select * from Demo_schema.RSpace_VMs where storage_disk = '" + query.getStorageDisk() + "' and " +
			 "os_arch = '" + query.getOsArch() + "' and ram_size >= " + query.getRamSizeLB() +
			 " and ram_size =< " + query.getRamSizeUB();
			 
			//String sql = "select * from Demo_schema.RSpace_VMs where ram_size > 6";
			stmt = connection.createStatement();
			System.out.println("statement preparation for query is succesful");
			ResultSet rs = stmt.executeQuery(sql);
			macOps = new ArrayList<MacroOperator>();
			while (rs.next()) {
				MacroOperator macOp = new MacroOperator();
				macOp.setVm_id(rs.getString("vm_id"));
				macOp.setVmName(rs.getString("vm_name"));
				macOp.setRamSize(rs.getString("ram_size"));
				macOp.setRamUnit(rs.getString("ram_units"));
				macOp.setStorageSize(rs.getString("storage_size"));
				macOp.setStorageUnit(rs.getString("storage_units"));
				macOp.setStorageDisk(rs.getString("storage_disk"));
				macOp.setOs(rs.getString("os_name"));
				macOp.setOsArch(rs.getString("os_arch"));
				macOp.setNoOfCores(rs.getString("no_of_Cores"));

				macOps.add(macOp);
				System.out.println("macid is present");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MysqlJdbc.closeConn(stmt, connection);
		}
		return macOps;

	}

	public List<String> insertMacOpsToDB(Collection<MacroOperator> moCollection, String ariId) {
		List<String> macIdList = new ArrayList<String>();
		Connection connection = MysqlJdbc.getConnection();
		PreparedStatement pstmt = null;
		Statement stmt = null;
		try {

			String sql = "insert into macoperator(vm_id,vm_name,ram_size,ram_units,storage_size,storage_units,storage_disk,os_name,os_arch,no_of_Cores,ari_id) values(?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = connection.prepareStatement(sql);
			for (MacroOperator macOp : moCollection) {
				pstmt.setInt(1, Integer.parseInt(macOp.getVm_id()));
				pstmt.setString(2, macOp.getVmName());
				pstmt.setInt(3, Integer.parseInt(macOp.getRamSize()));
				pstmt.setString(4, macOp.getRamUnit());
				pstmt.setInt(5, Integer.parseInt(macOp.getStorageSize()));
				pstmt.setString(6, macOp.getStorageUnit());
				pstmt.setString(7, macOp.getStorageDisk());
				pstmt.setString(8, macOp.getOs());
				pstmt.setString(9, macOp.getOsArch());
				pstmt.setInt(10, Integer.parseInt(macOp.getNoOfCores()));
				pstmt.setString(11, ariId);
				pstmt.executeUpdate();
			}

			stmt = connection.createStatement();
			sql = "select mac_id from macoperator where ari_id = '" + ariId + "'";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				macIdList.add(rs.getString("mac_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MysqlJdbc.closeConn(stmt, connection);
			MysqlJdbc.closeConn(pstmt, connection);
		}
		return macIdList;
	}
}
