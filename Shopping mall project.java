import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		
		Employee.addProduct("Shoes", "Bata", 2500, 1);
		Employee.addProduct("Pant", "Silk", 850, 1);
		Employee.addProduct("Top", "Cotton", 1000, 1);
		Employee.addProduct("Shirt", "Denim", 700, 1);
		//Employee.display();
		User.order("Shirt", "Denim", 2);
		User.order("Pant", "Silk", 5);
		User.order("Top", "Cotton", 7);
		User.showCart();
		
		
	}
}

class User extends ShoppingMall{
	static HashMap<Product, Integer> cart = new HashMap<Product, Integer>();
	
	public static void showCart(){
		System.out.println("_".repeat(104)); 
		System.out.println(" ".repeat(50) + "Cart" + " ".repeat(50));
		System.out.println("-".repeat(104)); 
		System.out.println("\tCategory\tBrand\tPrice\t\tQuantity\tTotal Price\n");
		System.out.println("~".repeat(104)); 
		int totalAmount = 0;
		for(Product p : cart.keySet()){
			System.out.print("\t"+p.category);
			System.out.print("\t\t" + p.brand);
			System.out.print("\t" + p.price);
			System.out.print("\t\t" + cart.get(p) + "\t\t" + (p.price * cart.get(p)));
			System.out.println(); 
			totalAmount += (p.price * cart.get(p));
		}
		System.out.println("~".repeat(104));
		System.out.println("\tTotal Amout:\t\t\t\t\t\t" + totalAmount);
		System.out.println("-".repeat(104)); 
	}
	
	public static void order(String cn, String b, int q){
		for(Product p: items.get(cn)){
			if(b.equals(p.brand)){
				cart.put(p, q);
			}
		}
	}
}

class ShoppingMall{
	static HashMap<String, ArrayList<Product>>  items = new HashMap<String, ArrayList<Product>>();
}

class Employee extends ShoppingMall{
	
	public static void addProduct(String cn, String b, int p, int q){
		if(items.containsKey(cn)){
			(items.get(cn)).add(new Product(cn, b, p, q));
		}else{
			items.put(cn, new ArrayList<Product>());
			(items.get(cn)).add(new Product(cn, b, p, q));
		}
	}

	public static void display(){
		for(String key : items.keySet()){
			System.out.println("_".repeat(10) + key + "_".repeat(10));
			
			//System.out.println(items.get(key));
			
			for(Product p : items.get(key)){
			//	System.out.print("\t"+p);
				System.out.print("\t"+p.category);
				System.out.print("\t" + p.brand);
				System.out.print("\t" + p.price);
				System.out.print("\t" + p.qty);
				System.out.println(); 
			}	
		}
	}
}
	
class Product{
	String category;
	String brand;
	int price;
	int qty;
	
	Product(String c, String b, int p, int q){
		category = c;
		brand = b;
		price = p;
		qty = q;
	}
}
