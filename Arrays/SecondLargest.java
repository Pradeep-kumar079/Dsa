class SecondLargest{
  public static void  Largest(int[] Arrays){
    int len = Arrays.length;
    int largest = 0;
    int secondlargest = 0;
    for (int i = 0; i < len; i++){
      if(Arrays[i]>=largest){
        secondlargest = largest;
        largest = Arrays[i];
      }
      else if(Arrays[i]>secondlargest && Arrays[i]!=largest){
        secondlargest = Arrays[i];

      }
    }
   System.out.println("The largest element is :" + secondlargest);

  }
  public static void main(String[] args) {
      int[] Arrays = {2,5,33,55,7,9,77};

      Largest(Arrays);

  }
}