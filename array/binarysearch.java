// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.PrintStream;

public class binarysearch {
   public binarysearch() {
   }

   public static int binsearch(int[] var0, int var1) {
      int var2 = 0;
      int var3 = var0.length - 1;
      int var4 = (var2 + var3) / 2;

      while(var2 <= var3) {
         if (var0[var4] == var1) {
            return var4;
         }

         if (var0[var4] < var1) {
            var2 = var4 + 1;
         } else {
            var3 = var4 - 1;
         }
      }

      return -1;
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{1, 2, 3, 4, 5, 6, 88, 89, 92, 99};
      byte var2 = 88;
      PrintStream var10000 = System.out;
      int var10001 = binsearch(var1, var2);
      var10000.print("the index of key is :" + var10001);
   }
}
