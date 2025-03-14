package collection7;

import java.util.TreeMap;

public class TreeMapMain {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tree = new TreeMap<>();
		
		tree.put(100, "이순신"); tree.put(341, "김유신");
		tree.put(541, "장영실"); tree.put(874, "나문희");
		tree.put(241, "이순재"); tree.put(234, "박하선");

		System.out.println(tree);
		
		//트리맵의 검색 메서드 - 트리맵에서 검색은 key를 검색하는 것
		
		System.out.println(tree.headMap(300));
		System.out.println(tree.tailMap(250));
		// headMap - 해당값보다 큰 key 모두 찾기
		// tailMap - 해당값보다 큰 key 모두 찾기
		System.out.println( tree.firstKey());
		System.out.println( tree.firstEntry());
		System.out.println( tree.lastKey());
		System.out.println( tree.lastEntry());
		
		System.out.println(tree.higherKey(345));
		System.out.println(tree.higherEntry(345));
		System.out.println(tree.lowerKey(300));
		System.out.println(tree.lowerEntry(500));
		
		System.out.println(tree.ceilingEntry(342));
		// ceilingKey - 해당 key 이상의 값 찾기(key 출력)
		// ceilingEntry - 해당 key 이상의 값 찾기(key와 value 출력)
		// floorKey - 해당 key 이하의 값 찾기 (key 출력)
		// floorEntry - 해당 key 이하의 값 찾기(key와 value 출력)
		
		System.out.println(tree.subMap(200, 600));
		
		
	}

}
