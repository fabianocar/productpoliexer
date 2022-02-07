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
	
	public double totalPrice() {
		return getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		return  getName() 
				+ " $ " 
				+ String.format("%.2f",totalPrice()) 
				+ " (Customs Fee: $ "
				+ String.format("%.2f", customsFee)
				+")";
	}
}
