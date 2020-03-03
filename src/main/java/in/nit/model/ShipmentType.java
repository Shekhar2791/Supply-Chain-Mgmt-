package in.nit.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shiptab")
public class ShipmentType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="shpId")
	private Integer shipId;
	@Column(name="smode")
	private String shipMode;
	@Column(name="scode")
	private String shipCode;
	@Column(name="enbshipment")
	private String enableShipment;
	@Column(name="sgrade")
	private String shipGrade;
	@Column(name="sdes")
	private String description;
	public ShipmentType() {
		super();
	}
	
	public ShipmentType(Integer shipId) {
		super();
		this.shipId = shipId;
	}

	public Integer getShipId() {
		return shipId;
	}
	public void setShipId(Integer shipId) {
		this.shipId = shipId;
	}
	public String getShipMode() {
		return shipMode;
	}
	public void setShipMode(String shipMode) {
		this.shipMode = shipMode;
	}
	public String getShipCode() {
		return shipCode;
	}
	public void setShipCode(String shipCode) {
		this.shipCode = shipCode;
	}
	public String getEnableShipment() {
		return enableShipment;
	}
	public void setEnableShipment(String enableShipment) {
		this.enableShipment = enableShipment;
	}
	public String getShipGrade() {
		return shipGrade;
	}
	public void setShipGrade(String shipGrade) {
		this.shipGrade = shipGrade;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "ShipmentType [shipId=" + shipId + ", shipMode=" + shipMode + ", shipCode=" + shipCode
				+ ", enableShipment=" + enableShipment + ", shipGrade=" + shipGrade + ", description=" + description
				+ "]";
	}

	
	
}	

