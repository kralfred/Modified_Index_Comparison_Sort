public class Main {
    public static void main(String[] args) {



     int[] a = new int[] {1,5,4,18,3,8,11,7,16,2};

     Main m = new Main();
     m.sort(a, 1);

    }






    public void sort(int[] a, int filled){
        int minimum = a[0];
        int minIndex = 0;

        for (int i = 0; i < a.length; i++){
             if(a[i] < minimum){
                 minimum = a[i];
                 minIndex = i;
             }
         }
        a[minIndex] = a[0];
        a[0] = minimum;



        for(int i = 1; i < a.length; i++){
           int sorted = 1;
           int mi = i + minimum;

           if(a[i] <= mi){

               int point = a[i];
               int full = 1;
               int sc = sorted;
               int max = 0;
               for(int r = i + 1; r < a.length; r++){


                   sc = sorted;
                   while(a[r] < point){

                           if(a[r] < a[sc]){
                               System.out.println("switch right");
                               int inst = a[r];
                               a[r] = a[sc];
                               a[sc] = inst;


                           }
                       if(sc > full){
                           full = sc;
                       }
                       sc++;
                   }

               }

               full ++;

               System.out.println("sc " + sc);
               System.out.println("smax " + max);

               for(int b = 0; b < a.length; b++){
                   System.out.println(a[b]);
               }

               for(int l = full; l < point - 1; l++){

                   System.out.println("left l " + l);

                   if(a[l] < point){
                       System.out.println("switch l    " + l);
                   for(int c = sorted; c < l; c++){

                         if(a[l] < a[c]){
                             System.out.println("left switch");
                             int inst = a[l];
                             a[l] = a[c];
                             a[c] = inst;

                         }


                       }
                   }

               }



             a[i] = a[full];
             a[full] = point;
               if(a[i] < point){

               }

               System.out.println("sorted " + sorted);
               System.out.println("full " + full);
               System.out.println("mi " + mi);
               for(int b = 0; b < a.length; b++){
                   System.out.println(a[b]);
               }

           }


        }

      for(int i = 0; i < a.length; i++){
          System.out.println(a[i]);
      }
    }

    public void Switch(){

    }

}