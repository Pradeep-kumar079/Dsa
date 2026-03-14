import java.util.LinkedHashSet;

class RemoveDuplicatesHashSet {

    public static void remove(int[] arr){

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }

        int pos = 0;

        for(int num : set){
            arr[pos] = num;
            pos++;
        }

        for(int i = 0; i < pos; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){

        int arr[] = {2,4,56,7,7,7,4,3,33};

        remove(arr);
    }
}