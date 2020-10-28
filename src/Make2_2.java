public class Make2_2 {
  public int[] make2(int[] a, int[] b) {
    int[] result = new int[2];
    int lena = a.length;
    int lenb = b.length;

    if (lena == 0) {
      result = b;
//    not needed
//    } else if (lenb == 0) {
//      result[0] = a[0];
//      result[1] = a[1];
    } else if (lena == 1) {
      result[0] = a[0];
      result[1] = b[0];
    } else {
      result[0] = a[0];
      result[1] = a[1];
    }
    return result;
  }
// way more concise:
// public int[] make2(int[] a, int[] b) {
// if (a.length == 0) {
//   return new int[]{ b[0], b[1] };
//    }
// if (a.length == 1) {
//   return new int[]{ a[0], b[0] };
//    }
// return new int[]{ a[0], a[1] };
// }
}
