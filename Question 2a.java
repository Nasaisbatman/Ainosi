public class PatternStarsEquals {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                System.out.println("* * * * = = = = = = =");
            } else {
                System.out.println("= = = = = = = = = = =");
            }
        }
    }
}
