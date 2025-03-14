package thread2;

public class Cafe {
  private Order order;
  private boolean orderPlace = false; // 주문 했냐(true) 안했냐(false)
  
  public synchronized void placeOrder(String menu) throws InterruptedException{
	  while(orderPlace) {
		  
	  }
	  order = new Order(menu);
	  System.out.println("손님 매장주문 : " +order.getOrderId()+
			  " - " +order.getMenu());
	  orderPlace = true;
	  notify(); // 주문이 들어갔으니까 바리스타를 실행
  }
  public synchronized Order give() throws InterruptedException{
	  while(!orderPlace) {
		  wait();
	  }
	  orderPlace=false;
	  notify();
	  return order;
  }
	  
  public void takeOrder(String menu) { // 포장해 가기
	  order = new Order(menu);
	  System.out.println("손님 포장주문 : " + order.getOrderId()+
			  " - "+order.getMenu());
  }
 
  }

