
public class LookandOrder {
	public static void main(String args[ ])  // start of main method
	{
		refer();
	}
	public static void refer()
	{
		
		System.out.println("phone class object");
		phone obj=new phone();
		obj.specifications();
		System.out.println("base price: "+obj.price());
		
		
		Samsungs8 s81= new Samsungs8();
		s81.specifications();
		System.out.println("price: "+s81.price());
		s81.preorder("KBK");
		s81.preorder("Nikhil","9377828282");
		
		
		Samsungs8 s8plus1= new Samsungs8plus();
		s8plus1.specifications();
		System.out.println("price: "+s8plus1.price());
		s8plus1.preorder("KBK");
		s8plus1.preorder("Nikhil","9377828282");
		
		
	}
	
	
	

}
