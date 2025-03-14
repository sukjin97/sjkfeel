package collection6;

import java.util.TreeSet;

public class TreeMain {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		
		tree.add(35);tree.add(41);tree.add(29);
		tree.add(9);tree.add(15);tree.add(20);
		tree.add(56);tree.add(49);tree.add(11);
		tree.add(17);tree.add(89);tree.add(39);
		
		System.out.println(tree);

		System.out.println(tree.headSet(20)); //headSet은 자기보다 작은 값들을 표시해줌.일치하는 것도 제외
		System.out.println(tree.tailSet(31)); //tailSet은 자기보다 큰 애들만 출력
		
		System.out.println(tree.first()); // 맨 앞에 있는 애 출력
		System.out.println(tree.last()); // 맨 나중에 있는 애 출력
		
		System.out.println(tree.higher(29)); //higher는 해당닶(29)보다 큰 것 중 가장 가까운 것 //만약 없다면 null 출력
		System.out.println(tree.higher(100)); //없는 값을 집어넣으면 오류는 안나고 null출력
		
		System.out.println(tree.lower(30)); // lower - 해당값보다 작은 값중에서 가장 가까운거 찾기
		
		System.out.println(tree.ceiling(39) ); //ceiling은 이상(higher는 초과)인거 찾기. 해당값 포함해서 찾기 때문에 입력한 값이 나올수도 있음.
		System.out.println(tree.floor(17)); //floor는 해당값 이하인 값중 가장 가까운 거 찾기. 해당값 포함해서 찾기에 입력한 값이 나올수 있음
		
		System.out.println(tree.subSet(17, 41));
		// subSet - 범위 지정하여 검색. subSet(a,b):a부터 b전까지 검색
		         
		                               
	}

}
