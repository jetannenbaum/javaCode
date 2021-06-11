class LinkedBubbleSort {

  public static LinkedList sort(LinkedList linkedList) {
    LinkedList.Node n = linkedList.head;
    

    while ( n != null ) {
      LinkedList.Node m = linkedList.head;
      while (m != null) {
        if (n.name.compareTo(m.name) < 0) {
          String tempName = n.name;
          n.name = m.name;
          m.name = tempName;
        }
        m = m.next;
      }
      n = n.next;
    }
    return linkedList;
  }
}
