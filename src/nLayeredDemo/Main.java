package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
//import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		//ToDo: Bu kötü kod Spring IoC ile çözülecek 
		//ProductService productService = new ProductManager(new HibernateProductDao());
		
		
		//Burada Hibernate teknolojisi eski bir teknoloji olduðu için artýk kullanmak istemiyorum ve kolayca Abc teknolojisine geçiþ yapabiliyorum. 
				
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		
		Product product= new Product(1,1,"Erik",2,1000);
		Product product1= new Product(1,2,"Cep Telefonu",5000,0);
		
		productService.add(product);
		productService.add(product1);
		
	}

}
