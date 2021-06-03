class BubbleSort {

  public static String[] sort(String[] stringList) {
    int listLen = stringList.length;

    for (int i = 0; i < listLen - 1; i++) {
      for (int j = 0; j < listLen - i - 1; j++) {
        if (stringList[j].compareTo(stringList[j + 1]) > 0) {
          String tempName = stringList[j];
          stringList[j] = stringList[j + 1];
          stringList[j + 1] = tempName;
        }
      }
    }
    return stringList;
  }
}
