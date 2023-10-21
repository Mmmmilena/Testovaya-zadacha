package Lesson5;

public class MethodsArray {
    public static void main(String[] args) {

       int[] array3 = {343,43,43,4343,321};
      int[] newMass = removeElement(array3,43);

      for (int i = 0; i < newMass.length;i++){
          System.out.print(newMass[i] + " ");
      }
     }

    static int[] removeElement(int[] arr,int delete){
        if (arr == null){
            return  arr;
        }
        int count = 0;

        for (int i = 0; i < arr.length;i++ ){
            if (arr[i] == delete){
                count ++;
            }else {
                arr[i - count] = arr[i];
            }
        }
        int[] newArray = new int[arr.length - count];
        for (int i = 0; i < newArray.length;i++){
            newArray[i] = arr[i];
        }
        return newArray;
    }

}
