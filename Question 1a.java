public class NigeriaFlagSingleLoop {
    public static void main(String[] args) {
        String green ="*";
        String white = "="; 
        for (int i = 0; i < 15; i++) { 
            if (i % 5 == 0) System.out.println(); 
            System.out.println(green.repeat(3) + white.repeat(3) + green.repeat(3));
        }
    }
}
