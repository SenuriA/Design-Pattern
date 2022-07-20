

public class Application {
	 public static void main(String [] args){
		 long start;
		 long end;
		 start=System.currentTimeMillis();
	        OrderManager order1 =OrderManager.getOrderManager();
	        System.out.println(order1);
	        
	       end=System.currentTimeMillis();
	       System.out.println("time to create order "+(end-start));
	       
	       start=System.currentTimeMillis();
	        OrderManager order2= OrderManager.getOrderManager();
	        System.out.println(order2);
	        end=System.currentTimeMillis();
		    System.out.println("time to create order "+(end-start));
		       

	    }

}
