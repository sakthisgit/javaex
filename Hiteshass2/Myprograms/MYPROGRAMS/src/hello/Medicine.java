package hello;

public class Medicine {
	private int medId,price;
	private String medName,DiseaseType,expDate,Company;
	public Medicine(int medId, int price, String medName, String diseaseType, String expDate, String company) {
		super();
		this.medId = medId;
		this.price = price;
		this.medName = medName;
		DiseaseType = diseaseType;
		this.expDate = expDate;
		Company = company;
	}
	public int getMedId() {
		return medId;
	}
	public void setMedId(int medId) {
		this.medId = medId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMedName() {
		return medName;
	}
	public void setMedName(String medName) {
		this.medName = medName;
	}
	public String getDiseaseType() {
		return DiseaseType;
	}
	public void setDiseaseType(String diseaseType) {
		DiseaseType = diseaseType;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	@Override
	public String toString() {
		return "Medicine [medId=" + medId + ", price=" + price + ", medName=" + medName + ", DiseaseType=" + DiseaseType
				+ ", expDate=" + expDate + ", Company=" + Company + "]";
	}
	
	
}
