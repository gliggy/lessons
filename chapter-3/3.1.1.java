public class Main {
    public enum rainbow {
        RED,
        GREEN,
        YELLOW,
        BLUE,
        PURPLE,
        CYAN;
    }
    public static void main(String[] args) {
        int i = 1;
        /**
         * in linux, there are ansi escape codes (such as "033[0;31m"
         * be a certain color, in this case, red. the code increments the
         * last number so that the colors match the value.
         */
        for (rainbow color : rainbow.values()) {
            System.out.println("\033[0;3" + i + "m" + color);
            i++;
        }
    }
}

