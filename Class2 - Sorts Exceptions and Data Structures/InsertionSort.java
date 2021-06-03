class InsertionSort {

  public static String[] sort(String[] stringList) {
    for (int i = 1; i < stringList.length; i++) {
      String current = stringList[i];
      int j = i - 1;
      while (j >= 0 && stringList[j].compareTo(current) > 0) {
        stringList[j + 1] = stringList[j];
        j--;
      }
      // at this point we've exited, so j is either -1
      // or it's at the first element where current >= a[j]
      stringList[j + 1] = current;
    }
    return stringList;
  }
}