# 컬렉션 프레임 워크

- 컬렉션 프레임 워크는 Collection과 Map이 있으며, 대표적으로 Collection 하위에 Set, List, Queue가 있다.
- 하위에는 Set-(HashSet,LinkedHashSet,TreeSet)
- List(ArrayList,Vector{Stack},LinkedList(동시에Queue구현체))
- Queue(LinkedList,PriorityQueue)
- Map(SortedMap(TreeMap), Hasgtable,LinkedHashMap,HashMap)

Set
- Set은 List와 다르게, **중복된 값을 허용하지 않으며, 순서가 보장되지 않고 저장된다**
- A,B,C는 모두 HashSet객체. A={1,2,3} B={3,4,5}, C={1,2}
- A.containsAll(B); -> B는 A의 부분집합이 아니다 = B의 모든 원소가 A에 포함되나? -> return false
- A.containsAll(C); -> C는 A의 부분집합이다 = C의 모든 원소가 A에 포함되나? -> return true
- A.addAll(B); -> A와 B의 합칩압 = A에 B의 모든 원소를 더하라 -> {1,2,3,4,5}
- A.retainAll(B) -> A와 B의 교집합 -> {3}
- A.removeAll(B) -> A에서 B를 뺀 차집합 -> {1,2}

List
- List는 순서가 보장되므로, 데이터의 순서를 가르키기 위한 주소값(인덱스)를 갖고 있다.
- get(index)로 해당 위치에해당하는 데이터를 꺼낼수 있다.
- ArrayList는 List를 상속받은 클래스로, 배열과 동일하게 연속된 메모리 공간을 갖으며, 인덱스는0부터 시작한다.
- 배열과의 차이점은 배열은 크기가 고정적인 반면 ArrayList는 크기가 가변적으로 변한다.
- ArrayList는 데이터를 추가하는 만큼 사이즈가 늘어난다.
 -> 배열의 크기가 전부 차면, 크기를 2배로 늘려(Doubling) 새로운 배열을 선언하여 기존 데이터를 전부 배열에 복사한 후 추가한 데이터를 넣는다.
- .add(value); -> 마지막 배열 다음에 들어갈 값을 넣는다.
- .set(index, value) -> index의 위치에 값을 추가한다. index부터 전부 한칸씩 뒤로 이동하게 되며 index가 전부 +1된다.
- .get(index) -> index위치에 value를 가져온다.
- .remove(index or value) -> index 또는 값으로 해당 위치를 삭제한다. 한칸씩 앞으로 당기게 되며 index가 전부 -1된다.
- .contains(value); value가 존재할경우 true, 존재하지 않을경우 faluse를 리턴한다.
- .indexOf(value); value가 존재할경우 해당index리턴, 존재하지 않을경우 -1을 리턴한다. 
- LinkedList 는 하나의 노드에 다음 노드와 이전 노드의 주소값을 갖고 있다. 사용 메서드는 ArrayList와 동일하다.
- LinkedList는 Queue의 구현체이며, 이유는 ArrayList와 같은 배열 기반의 자료구조를 사용하게 되면, 빈 공간을 채우기 위해서 데이터의 이동과 삭제가 발생하므로 Queue의 구현체이며, List의 기능을 사용하므로 List를 상속받는다.
- LinkedList에서 데이터(노드)의 추가 또는 삭제시, 선행 노드와 후행 노드의 포인터만 바뀌게 되므로, 데이터의 추가 및 삭제에 효율적이다. (단방향일경우, 선행노드는 후행노드를 가르키는 포인터x)
- 추가/삭제가 필요없거나 순차적으로 데이터를 추가/삭제 할경우 ArrayList > LinkedList 효율적
- 중간에 데이터가 추가/삭제 하는경우, LinkedList > ArrayList 효율적(메모리측면)

Map
- Map은 Key와 Value로 데이터를 저장한다. key값은 중복을 허용하지 않으며, 중복시 기존Value는 바뀌게 된다. Value는 중복이 가능하다.
- new HashMap<key(데이터 타입), value(값)>
- a.put("one", 1); "one"키 값으로 1의 값을 넣는다.
- a.get("one"); -> 1 을 리턴한다.