package customer;

import java.util.Date;

import store.Fruit;

public class Buyer {
   private int money;
   private Fruit item;//구매한 음료 또는 컵과일 저장 변수
   private Date buyDate;
   
   public Date getBuyDate() {
	return buyDate;
}

public void setBuyDate(Date buyDate) {
	this.buyDate = buyDate;
}

public Buyer(int money) { // Buyer객체 생성시 동작 할 생성자 메서드
	   this.money=money;
   }


public int getMoney() {
	return money;
}

public void setMoney(int money) {
	this.money = money;
}

public Fruit getItem() {
	return item;
}

public void setItem(Fruit item) {
	this.item = item;
}
   
   // set, get 메서드
   
}
