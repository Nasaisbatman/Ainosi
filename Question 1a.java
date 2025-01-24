public class NigeriaFlagSingleLoop {
    public static void main(String[] args) {
        String green = "*"; // Green color
        String white = "+"; // White color

        for (int i = 0; i < 15; i++) { // 15 rows
            if (i % 5 == 0) System.out.println(); // Create spacing
            System.out.println(green.repeat(3) + white.repeat(3) + green.repeat(3));
        }
    }
}
