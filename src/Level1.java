public class Level1 {
 public static int [] UFO (int N, int [] data, boolean octal) {
        int z = 16;
        if (octal) {
            z = 8;
        }


           int i = 0;
           int[] result = new int[N];

           for (int x = 0; x < N; x++) {
               for (int y = 0; data[x] > 0; y++) {
                   i += (int)( (data[x] % 10) * Math.pow(z, y));
                   data[x] /= 10;
               }
               result[x] = i;
               i = 0;
           }
           return result;
       }

}

