public class Level1 {
    public static int[] Eight (int N, int[] data) {
        int i = 0;
        int[] result = new int[N];

        for (int x = 0; x < N; x++) {
            for (int y = 0; data[x] > 0; y++) {
                i += (int)( (data[x] % 10) * Math.pow(8, y));
                data[x] /= 10;
            }
            result[x] = i;
            i = 0;
        }
        return result;
       }

       public static int[] Sixteen (int N, int[] data) {
        int i = 0;
        int[] result = new int[N];

           for (int x = 0; x < N; x++) {
               for (int y = 0; data[x] > 0; y++) {
                   i += (int)( (data[x] % 10) * Math.pow(16, y));
                   data[x] /= 10;
               }
               result[x] = i;
               i = 0;
           }
           return result;
       }

       public static int [] UFO (int N, int [] data, boolean octal) {
        if (octal)
            return Eight(N, data);
        return Sixteen(N, data);
       }

}

