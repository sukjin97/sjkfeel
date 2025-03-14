package exception6;

public class MainMt {

	public static void main(String[] args) {
		
     String keyword="찬양";
     String content="나는 어제 친구와 술을 마셨다. 그 친구의 이름은"+"찬약!!";
     if(!content.contains(keyword)) {
    	 try {
    	 throw new SearchException("검색 결과 없다.","111");
     }catch(Exception s) {
    	 s.printStackTrace();  	 
     }
	}

 }
}
