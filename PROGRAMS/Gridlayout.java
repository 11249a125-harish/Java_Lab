public class Gridlayout {
    public static void main(String[] args) {
        String[][] buttons = {
            {"A", "B"},
            {"C", "D"},
            {"E", "F"},
            {"G", "H"},
            {"I", "J"}
        };

        System.out.println("Grid Layout (5 Rows x 2 Columns)");
        System.out.println("+----------+----------+");

        for (int i = 0; i < buttons.length; i++) {
            System.out.printf("| %-8s | %-8s |%n",
                    buttons[i][0], buttons[i][1]);
            System.out.println("+----------+----------+");
        }
    }
}
