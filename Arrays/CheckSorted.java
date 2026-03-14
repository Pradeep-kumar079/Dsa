class CheckSorted{
  public static void isSorted(int[] arr){
     
    boolean sorted = true;
    for(int i=0; i<arr.length-1;i++){
      if(arr[i]>arr[i+1]){
        sorted = false;
      }
    }
    if(sorted){
      System.err.println("Array is sorted : True");
    }else{
      System.out.println("Array is sorted : False");
    }
  }
  public static void main(String[] args) {
      int[] arr = {2,5,7,8,9,34};
      isSorted(arr);
  }
}