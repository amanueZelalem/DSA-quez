import java.util.*;
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print(" enter the size of the array ");
		int size =  sc.nextInt();
		
		//
		int[] num = new int[size];
		for (int i = 0 ; i < size; i++){
			System.out.printf(" enter number " + (i+1) + " ");
			int input =  sc.nextInt();
			//grades[i] = Double.parseDouble(args[i]);
			num[i] = input;
		}
        System.out.println("enter the number to be searched ");
        int serchedNumber =  sc.nextInt();
        int count = 0;
        for(int i = 0; i < size; i++){
            if(num[i] == serchedNumber){
                count++;

            }
        }
        if (count == 0){System.out.println("the elemnt does not exit");}
        else {System.out.println("the elemnt presnt " + count + " times");}
    }
    
}
