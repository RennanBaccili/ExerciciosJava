package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.Order;
import entities.OrderItem;
import entities.Products;
import enums.OrderStatus;


public class Program3 {
	public static void main(String[]args) throws ParseException {
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	int n;
	
	System.out.print("Digite o nome  do Cliente: ");
	String name = sc.nextLine();
	
	System.out.print("Digite seu email: ");
	String email = sc.nextLine();
	
	
	System.out.print("Digite sua data de nascimanto (dd/MM/yyyy): ");
	Date birthDate = sdf.parse(sc.nextLine());
	
	
	Cliente cliente = new Cliente(name, email, birthDate);
	
	System.out.println("Enter order data: ");
	System.out.print("Status: " ); 
	
	OrderStatus status = OrderStatus.valueOf(sc.next());//PROCESSING
	
	Order order = new Order(new Date(),status, cliente);
	
	System.out.print("How many items to this order? "); n = sc.nextInt();
	for (int i = 1; i <= n;i++) {
		sc.nextLine();
		System.out.println("Enter #"+ i +" item data:");
		System.out.print("Product name: ");
		String nameProduct = sc.next();
		System.out.print("Product price: ");
		Double price = sc.nextDouble();
		System.out.print("Quantity: ");
		Integer quantity = sc.nextInt();
		
		Products product = new Products(nameProduct,price);
		OrderItem  orderServices =  new OrderItem(quantity,price,product); // meu product ta estanciado n oorder item
		order.addItem(orderServices);
	}
	System.out.println("ORDER SUMMARY");
	System.out.println(order);
	sc.close();
	}
}
