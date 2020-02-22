package in.nit.service;

import java.util.List;
import in.nit.model.ShipmentType;

public interface IShipmentTypeService {
	
	Integer saveShipmentType(ShipmentType ob);
	
	//add method from IDAO to IService to fetch data from DB to UI
	List<ShipmentType>getAllShipmentTypes();

}
