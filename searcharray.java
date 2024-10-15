public class searcharray {
  public static void main(String[] args) {
    int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

    float avg, sum = 0;
    int length = ages.length;
    int lowestAge = ages[0];
    for (int i=0;i<7;i++) {
      if (lowestAge > ages[i]) {
        lowestAge = ages[i];
      }
    }
    System.out.println("The lowest age in the array is: " + lowestAge);
    
  }
}