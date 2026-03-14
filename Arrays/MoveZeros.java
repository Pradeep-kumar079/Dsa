
import java.util.Arrays;

class MoveZeros{
  public static void Movezeros(int[] arr){
    int pos = 0;
    for(int i=0;i<arr.length;i++){
      if(arr[i] != 0){
        arr[pos] = arr[i];
         pos++;
      }
     
    }
    while (pos<arr.length) {
        arr[pos] = 0;
        pos++;
    }
    System.out.println(Arrays.toString(arr));

  }
  public static void main(String[] args) {
      int[] arr = {2,4,0,0,4,0,44,0,3};
      Movezeros(arr);
  }
}