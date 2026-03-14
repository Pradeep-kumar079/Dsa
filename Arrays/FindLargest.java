class FindLargest{
  public static void  Largest(int[] Arrays){
    int len = Arrays.length;
    int max = Arrays[0];
    for (int i = 0; i < len; i++){
      if(Arrays[i]>=max){
        max = Arrays[i];
      }
    }
   System.out.println("The largest element is :" + max);

  }
  public static void main(String[] args) {
      int[] Arrays = {2,5,33,55,7,9,77};

      Largest(Arrays);

  }
}