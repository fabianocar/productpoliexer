package entities;

public class ImportedProduct extends Product{
	
	private Double customsFee;

	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct (String nome, Double price, Double customsFee) {
		super(nome, price);
		this.customsFee = customsFee;
	}
	
	public double getCustomsFee() {
		return customsFee;
	}
	
	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		return  super.priceTag() + "(Customs Fee: "+ String.format("%.2f",customsFee +")");
	}
}
