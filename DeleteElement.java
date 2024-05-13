public class DeleteElement {
    public static int[] DeleteElement(int[] array, int indexToDelete ){
         if(indexToDelete < 0 && indexToDelete >= array.length){
             System.out.println("Invalid index");
             return array;
         }
         int[] newArray = new int[array.length - 1];
         for (int i = 0, j = 0; i < array.length; i++) {
             if (i != indexToDelete) {
                 newArray[j] = array[i];
                 j++;
             }
          }
          return newArray;
    }
     public static void main(String[] args) {
         int[] array = {3, 7, 1, 9, 4};
         DeleteElement(array, 2);
 
     }
 }
 