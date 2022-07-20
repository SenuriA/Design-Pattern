public class OrderManager {
    private static volatile OrderManager ordermanager;
    private OrderManager (){
        if (ordermanager != null){
            throw new RuntimeException ("please use getOrderManager method");
        }
    }
    public static OrderManager getOrderManager(){
        if (ordermanager==null){
            synchronized (OrderManager.class){
                if(ordermanager==null){
                    ordermanager=new OrderManager();
                }
            }
        }
        return ordermanager;
    }
    
 
    
    
}
