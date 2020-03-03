package in.nit.dao;

import java.util.List;

import in.nit.model.ShipmentType;

public interface IShipmentTypeDao {
	
	//1.Save input form data to DB 
	Integer saveShipmentType(ShipmentType ob);
	
	//2.Add method for fetching data from DB to UI
	List<ShipmentType>getAllShipmentTypes();
	
	//3.Delete data from form display
	public void deleteShipmentType(Integer id);
	
	//4.Edit form data //6.View single form data
	ShipmentType getOneShipmentType(Integer id);
	
	//5.Update form data using Edit
	void updateShipmentType(ShipmentType ob);
	
	
}