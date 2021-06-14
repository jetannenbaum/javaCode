class LinkedInsertionSort {

  public static LinkedList sort(LinkedList linkedList) {
    for (LinkedList.Node i = linkedList.head.next; i != null; i = i.next) {
      String current = i.name;
      LinkedList.Node j = i.prev;
      while (j !=null && j.name.compareTo(current) > 0) {
        j.next.name = j.name;
        j = j.prev;
      }
      // at this point we've exited, so j is either -1
      // or it's at the first element where current >= a[j]
      if (j == null) {
          j = linkedList.head;
          j.name = current;
      }
      else {
          j.next.name = current;
      }
    }
    return linkedList;
  }
}