public class _27_Remove_Element {

  public static int removeElement(int[] a, int val) {
    int n = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] != val) {
        a[n] = a[i];
        n++;
      }
    }
    return n - 1;
  }

  public static void main(String[] args) {
    int[] input_1 = { 1, 2, 3, 2, 4, 5 };
    int[] input_2 = { 0, 2, 0, 0, 4, 5 };

    System.out.println("case 1: " + removeElement(input_1, 2));
    System.out.println("case 2: " + removeElement(input_2, 0));
  }
}