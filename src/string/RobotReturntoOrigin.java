package string;

public class RobotReturntoOrigin {
    public static void main(String[] args) {
        String str = "UD";
        System.out.println("Did Robot return origin :" + judgeCircle(str));
    }

    /**
     * Determines if a series of moves returns to the starting point on a 2D plane.
     * <p>
     * This function takes a string 'moves' as input, where each character represents a move
     * on a 2D plane. 'U' represents a move up (increment y-coordinate), 'D' represents
     * a move down (decrement y-coordinate), 'L' represents a move left (decrement x-coordinate),
     * and 'R' represents a move right (increment x-coordinate).
     * <p>
     * The function iterates through the 'moves' string and updates the x and y coordinates
     * accordingly. After processing all the moves, it returns true if the final coordinates
     * are the starting point (0, 0), indicating the moves form a closed loop, and false otherwise.
     *
     * @param moves The string containing the moves on a 2D plane.
     * @return true if the moves return to the starting point (0, 0), false otherwise.
     * <p>
     * @example // Example 1
     * String moves1 = "UDLR";
     * boolean result1 = judgeCircle(moves1);
     * // result1 = true, the moves form a closed loop and return to the starting point.
     * <p>
     * // Example 2
     * String moves2 = "UUDDRL";
     * boolean result2 = judgeCircle(moves2);
     * // result2 = false, the moves do not return to the starting point.
     * <p>
     * // Example 3
     * String moves3 = "RRUULLDD";
     * boolean result3 = judgeCircle(moves3);
     * // result3 = true, the moves form a closed loop and return to the starting point.
     */
    public static boolean judgeCircle(String moves) {
        int x = 0, y = 0;

        for (char ch : moves.toCharArray()) {
            if (ch == 'U') y++;
            if (ch == 'D') y--;
            if (ch == 'L') x--;
            if (ch == 'R') x++;
        }
        return x == 0 && y == 0;
    }
}
