package testJSF;

import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


import Entity.Car;

@Named
@SessionScoped

public class CarController implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Car> cars = new ArrayList<>();
	
	public void generateCars() {
		cars.add(new Car(Long.valueOf(1),"TOYOTA","CAMRY", Integer.valueOf(2010),"white"));
		cars.add(new Car(Long.valueOf(2),"TOYOTA","COROLLA", Integer.valueOf(2013),"Red"));
		cars.add(new Car(Long.valueOf(3),"HONDA","CIVIC", Integer.valueOf(2009),"blue"));
		cars.add(new Car(Long.valueOf(4),"HONDA","ACCORD", Integer.valueOf(2015),"silver"));
//		cars.add(new Car(Long.valueOf(5),"MAZDA","3", Integer.valueOf(2005)," red "));  // with lowercase and spaces
		
	}
	
	@PostConstruct
	private void init() throws SQLException, IOException {
		generateCars();
//		connect();
	}

	public ArrayList<Car> getCars() {
		return cars;
	}

	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}
	
	

//	ResultSetDataModel dataModel;
//	
//    public ResultSetDataModel getDataModel() {
//		return dataModel;
//	}
//
//	public void setDataModel(ResultSetDataModel dataModel) {
//		this.dataModel = dataModel;
//	}
//
//
//
//	String user = "test";
//    String pass = "test";
//    String url;
//    OracleDataSource ods;
//    Connection conn;
//    Statement stmt;
//    
//    Result res = null;
//    
//    public Result getRes() {
//        System.out.println("getRes");
//		return res;
//	}
//
//	public void setRes(Result res) {
//		this.res = res;
//	}
//
//	ResultSet rs;
//	
//	public ResultSet getRs() {
//		return rs;
//	}
//
//	public void setRs(ResultSet rs) {
//		this.rs = rs;
//	}
//
//	public void connect() throws SQLException, IOException  {
//        System.out.println("start");
//
//        url = "jdbc:oracle:thin:@localhost:1521:xe";
//        user="WEBSALES";
//        pass="websales";
//
//
//        java.util.Locale.setDefault(java.util.Locale.CANADA);            
//        
//        ods = new OracleDataSource();
//        ods.setURL(url);
//        ods.setUser(user);
//        ods.setPassword(pass);
//        conn = ods.getConnection();
//        stmt = conn.createStatement();
////        stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,         		ResultSet.CONCUR_READ_ONLY);        
//        
//        String strSQL = "SELECT " +
//                "ID, NAME " +
//            " FROM WEB_USERS "+
//            " WHERE ID<100 ";
//
//
//        rs = stmt.executeQuery(strSQL);
//
//		while (rs.next()){
//			System.out.println(rs.getString(2));
//		}
//		
////		dataModel=new ResultSetDataModel();
////		dataModel.setWrappedData(rs);
//
//		res = ResultSupport.toResult(rs,10);		
//
////		rs.close();
//        
//        System.out.println("end");
//    }
	

}
