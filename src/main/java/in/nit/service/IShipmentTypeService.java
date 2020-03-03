package in.nit.service;

import java.util.List;
import in.nit.model.ShipmentType;

public interface IShipmentTypeService {
	
		Integer saveShipmentType(ShipmentType ob);
	
	//1.add method from IDAO to IService to fetch data from DB to UI
		List<ShipmentType>getAllShipmentTypes();
	
	//2.Delete data from form display
		public void deleteShipmentType(Integer id);
		
	//3.Edit form data
		ShipmentType getOneShipmentType(Integer id);
		
	//4.Update form data using Edit
	void updateShipmentType(ShipmentType ob);

}
