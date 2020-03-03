package in.nit.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.ShipmentType;
import in.nit.service.IShipmentTypeService;

@Controller
@RequestMapping("/shipment")
public class ShipmentTypeController {
	
	@Autowired
	private IShipmentTypeService service;
	
	/* 1.>THIS METHOD IS USED TO DISPLAY SHIPMENT TYPE REGISTER PAGE ON
	 *   >URL:/register,GET */
	
	/* 2.>::METHOD FORMAT::
	 * public String <any MethodName>(){ return "PageName"; } */
	
	@GetMapping("/register") //GET
	public String showRegPage() {
	return "ShipmentTypeRegister";
	} 
	
	//Save data to DB
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveShipment(@ModelAttribute ShipmentType shipmentType,Model model) {
		Integer id = service.saveShipmentType(shipmentType);
		String message = "Shipment type '"+id+"' saved";
		model.addAttribute("message",message);
		return "ShipmentTypeRegister";
	}
	
	//Retrive data from DB
	@RequestMapping("/all") //GET
	public String getAllShipmentTypes(Model model) {
	List<ShipmentType> list=service.getAllShipmentTypes();
		model.addAttribute("list", list);
		return "ShipmentTypeData";
		}
	
	//Delete data from DB
	@RequestMapping("/delete")
	public String deleteShipment(@RequestParam("sid")Integer id,Model model) {
		service.deleteShipmentType(id);
		String message="Shipment"+id+"Deleted";
		model.addAttribute("message",message); //sending data to UI

		//Fetching Updated data as list after data deleted
		List<ShipmentType> list=service.getAllShipmentTypes();
		model.addAttribute("list", list);
		
		return "ShipmentTypeData"; //page Name
		}
	
	//Editing data from form
	@RequestMapping("/edit")
	public String showEditPage(@RequestParam("sid")Integer id,Model model) {
		ShipmentType st=service.getOneShipmentType(id);
		model.addAttribute("ShipmentType", st);
		return "ShipmentTypeEdit";
		
	}
	
	//Upadate form data after Edit
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String updateShipmentType(@ModelAttribute ShipmentType shipmentType,Model model) {
		service.updateShipmentType(shipmentType);
		String message="ShipmentType"+shipmentType.getShipId()+"Updated";
		model.addAttribute("message", message);
		List<ShipmentType> list=service.getAllShipmentTypes();
		model.addAttribute("list", list);	
		return "ShipmentTypeData";
		
	}
	
	//View single form data
	@RequestMapping(value="/view")
	public String showOneShipment(@RequestParam("sid")Integer id,Model model) {
		ShipmentType st=service.getOneShipmentType(id);
		model.addAttribute("ob", st);
		 return "ShipmentTypeView";
		
	}
}