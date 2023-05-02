package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	
	private Products product = new Products();
	
	
	
public OrderItem() {

	}


public OrderItem(Integer quantity, Double price, Products product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

public Integer getQuantity() {
	return quantity;
}




public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}




public Double getPrice() {
	return price;
}




public void setPrice(Double price) {
	this.price = price;
}




public Products getProduct() {
	return product;
}




public void setProduct(Products product) {
	this.product = product;
}


public double subTotal() {
	return (product.getPrice()) * quantity;
}


@Override
public String toString() {
	return  product.getNome() + ", " + "$" + String.format("%.2f",price) + ", Quantity: " + quantity + ", Subtotal: "
+ String.format("%.2f", subTotal());
}


}
