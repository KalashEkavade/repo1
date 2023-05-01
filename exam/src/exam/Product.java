package exam;

public class Product {
	
		int product_id;
		String company;
		double price;
		Product(){
			product_id=0;
			company="";
			price=0;
		}
		Product(int p_id,String comp){
			product_id=p_id;
			company=comp;
			price=0;
		}
		Product(int p_id,String comp,double p){
			product_id=p_id;
			company=comp;
			price=p;
		}

public static void main(String[] args) {
			Product P1=new Product();
			Product P2=new Product(101,"nestle");
			Product P3=new Product(102,"britannia",49.99);

		}
		}



	
