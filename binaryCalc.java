import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

public class binaryCalc {

    public static void main(String[] args){
        
        
        Scanner numberIn = new Scanner(System.in);
        System.out.println("What number do you want to convert?");
        int firstNo = numberIn.nextInt();
        
            List<Integer> myList = new ArrayList<Integer>();
                try {
                
                    int originalNo = firstNo;
                
                    while(firstNo > 0){
                
                
                        if (firstNo % 2 == 0) {
                            myList.add(0);
                        }else{
                    
                            myList.add(1);
                        }
                firstNo = firstNo/2;
                System.out.println(myList);
                Thread.sleep(1000);
                }
                
                Collections.reverse(myList);
                System.out.println(myList);
                
                
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        
        
    }

}
