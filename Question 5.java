import java.util.scanner;
import java util.Arrays;
public class TwoDArraysInput{
    public class static void main(String[]args){
        int[][]array= new int[10][10];
        Sytem.out.println("Enter elements for a 10 x 10");
        for(int i=0;i<10;i++){
            for(inti=0;i<10;i++){
                System.out.print("Enter element for index["+ i + "] ["+ j + "]:");
                array[i][j]=Scanner.nextint();
            }
        }
        System.out.println("\nThe elements of the array are:");
        for(int[]row:array){
            for(int element:row){
                System.out.print(element + " ");
            }
                System.out.println();
        }
        scanner.close();
    }
}