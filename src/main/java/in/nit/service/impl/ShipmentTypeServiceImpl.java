package in.nit.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IShipmentTypeDao;
import in.nit.model.ShipmentType;
import in.nit.service.IShipmentTypeService;
@Service
public class ShipmentTypeServiceImpl implements IShipmentTypeService{
	
	//adding dao object to access DAL(Data Access Layer)
	@Autowired
	private IShipmentTypeDao dao;
	
	@Transactional
		public Integer saveShipmentType(ShipmentType ob) {
			return dao.saveShipmentType(ob);
		}
	
	@Override //implement method in serviceImpl to fetch data fro DB to UI 
	public List<ShipmentType> getAllShipmentTypes() {
		List<ShipmentType> list= dao.getAllShipmentTypes();
		Collections.sort(list,(o1,o2)->o1.getShipId()-o2.getShipId());
		return list ;		
	}

}
