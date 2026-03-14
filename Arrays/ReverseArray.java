class ReverseArray{
  public static void Reverse(int[] array){
    int start = 0;
    int end = array.length-1;
     while(start < end){
      int tmp = array[start];
      array[start] = array[end];
      array[end] = tmp;

      start++;
      end--;

     }
   System.out.print("Reversed array : ");

    for(int i=0;i<array.length;i++){
      System.out.print(array[i] + " ");
    }
  }
  public static void main(String[] args) {
      int[] array = {2,4,6,7};
      Reverse(array);

  }
}