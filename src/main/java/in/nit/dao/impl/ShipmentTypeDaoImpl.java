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

	@Override //Implement method for fetching data from DB to UI
	public List<ShipmentType> getAllShipmentTypes() {
		return ht.loadAll(ShipmentType.class);
	}
}
