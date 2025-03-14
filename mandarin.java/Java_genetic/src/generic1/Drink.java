package generic1;

public class Drink<T> { //T는 타입의 이름(외부에서 지정한) 다른 거(H)로 해도됨.
    T name;
    int ml;
    
    public void 경림추천(T name) {
    	this.name = name;
    	System.out.println(this.name);
    }
}
