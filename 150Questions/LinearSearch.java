package ClassQuestion;

public class LinearSearch {
    static  int linearSearch(int []arr,int key){
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == key) {
                return i;
            }
        }
            return  -1;

    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        int key=0;
        int result=linearSearch(arr,key);
        if(result!=-1){
            System.out.print("Element found at index "+ result);




        }
        else{
            System.out.print("Element not found");
        }


    }
}
