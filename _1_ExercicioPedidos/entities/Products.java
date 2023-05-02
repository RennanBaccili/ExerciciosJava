package entities;

public class Products {
	private String nameProduct;
	private Double price;
	
	
	
public Products() {
}


public Products(String nameProduct, Double price) {
	this.nameProduct = nameProduct;
	this.price = price;
	
}
public String getNome() {
	return nameProduct;
}
public void setNome(String nameProduct) {
	this.nameProduct = nameProduct;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}

}
