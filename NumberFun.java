import java.util.*;
class NumberFun{
  static Scanner kbd = new Scanner(System.in);
  public static void main(String[] args){
    int n = kbd.nextInt();
    double max,min;
    int[][] a = new int[n][3];
    for(int i = 0;i < n;i++){
      for(int j = 0;j < 3;j++){
        a[i][j] = kbd.nextInt();
      }
    }
     for(int i = 0;i < n;i++){
      for(int j = 0;j < 1;j++){
         max = a[i][0];min = a[i][0];
         if(a[i][1] > a[i][0])
           max = a[i][1];

         if(max == a[i][0])
           min = a[i][1];
         else 
           min = a[i][0];
    
         if(a[i][0] + a[i][1] == a[i][2])
            System.out.println("Possible");
         else if(max - min == a[i][2])
            System.out.println("Possible");
         else if(max/min == a[i][2])
            System.out.println("Possible");
         else if(max * min == a[i][2])
            System.out.println("Possible");
         else 
            System.out.println("Impossible");
      }
    }
  }
}
