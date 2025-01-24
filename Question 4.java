import java.util.scanner;
import.java.util.Arrays;
public class Arrayexample{
    public static void main(String[]args){
        Scanner scanner = new scanner(System.in);
        String[]names= new string[10];
        for(int i=0;i<name.length;i++){
            System.out.println("Enter name for index" + i + " :")
            names[i]= scanner.nextLine();
        } 
        System.out.println("You entered;");
        for(String name:names){
            System.out.println(name);
        }
    }
}