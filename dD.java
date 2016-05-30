import java.util.*;

public class dD{
  
  public static void main(String[] args){
    int y =1;
    int[][] z = new int[2][2];
    int number=1;
    for (int i=0; i<2;i=i+1){
      for(int j=0; j<2;j=j+1){
        z[i][j]=number;
        number=number+1;
        System.out.println(z[i][j]);
      }
    }
    

  }
}