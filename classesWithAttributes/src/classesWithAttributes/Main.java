package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "laptop", "Asus",3000,2,"Siyah" );
		product.setId(1);
		product.setColor("black");
		product.setName("Laptop");
		
		
		
		
		ProductManager productManager= new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		
		

	}

}
