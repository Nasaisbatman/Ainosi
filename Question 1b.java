public class NigeriaFlagNestedLoop {
    public static void main(String[] args) {
        String green = "*"; 
        String white = "="; 

        for (int i = 0; i < 15; i++) { 
            for (int j = 0; j < 9; j++) { 
                if (j < 3 || j >= 6) {
                    System.out.print(*);
                } else {
                    System.out.print(=);
                }
            }
            System.out.println();
        }
    }
}
