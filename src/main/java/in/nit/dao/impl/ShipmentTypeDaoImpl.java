package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IShipmentTypeDao;
import in.nit.model.ShipmentType;
@Repository
public class ShipmentTypeDaoImpl implements IShipmentTypeDao{
	
	@Autowired //creating an object
	private HibernateTemplate ht; //using hibernate template 
	
	//implementing abstract methods
	public Integer saveShipmentType(ShipmentType ob) {
		return (Integer)ht.save(ob);
	}
	
	//Implement method for fetching data from DB to UI
	@Override 
	public List<ShipmentType> getAllShipmentTypes() {
		return ht.loadAll(ShipmentType.class);
	}
	
	//Implement method for deleting data from DB to UI
	@Override
	public void deleteShipmentType(Integer id) {
		 ht.delete(new ShipmentType(id));
	}
	
	//Implement method for editing data from DB to UI(form backing object)
	@Override
	public ShipmentType getOneShipmentType(Integer id) {
		return ht.get(ShipmentType.class, id);
	}
	
	//Update form data after Update
	@Override
	public void updateShipmentType(ShipmentType ob) {
		ht.update(ob);
	}
}
