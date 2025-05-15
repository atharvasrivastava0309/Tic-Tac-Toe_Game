import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                board[row][col] = ' ';
            }
        }
        Scanner scanner = new Scanner(System.in);
        char player = 'X';
        boolean gameOver = false;

        while (!gameOver) {
            printBoard(board);
            System.out.print("Player " + player + " Enter position you want to insert (row and column 0-2): ");
            try {
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                System.out.println();

                if (board[row][col] == ' ') {
                    board[row][col] = player;
                    if (hasWon(board, player)) {
                        System.out.println("GAME OVER: Player " + player + " has won");
                        gameOver = true;
                    } else {
                        player = (player == 'X') ? 'O' : 'X';
                    }
                } else {
                    System.out.println("Invalid move, cell already occupied. Try again!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid input! Please enter row and column between 0 and 2.");
                scanner.nextLine(); // Clear the buffer
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter numeric values.");
                scanner.nextLine(); // Clear the buffer
            }
        }
        printBoard(board);
    }

    public static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print("|" + board[row][col] + "|");
            }
            System.out.println();
        }
    }

    public static boolean hasWon(char[][] board, char player) {
        // check for row
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) return true;
        }
        // check for column
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) return true;
        }
        // check for diagonal
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;

        return false;
    }
}
