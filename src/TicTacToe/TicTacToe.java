package tictactoe;

import java.util.Scanner;

public class TicTacToe {

    private static enum CellState {
        X, O, E
    }

    CellState[][] board;
    int turn; // 1 = X, 2 = 0
    int moves = 0;

    public TicTacToe() {
        this(3, 1);
        // more code here
    }

    public TicTacToe(int size) {
        this(size, 1);
    }

    public TicTacToe(int size, int turn) {
        board = new CellState[size][size];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = CellState.E;
            }
        }
        this.turn = turn;
    }

    @Override
    public String toString() {
        String out = "";
        for (CellState[] row : board) {
            for (CellState cell : row) {
                out += cell + " ";
            }
            out += "\n";
        }
        if (turn == 1) {
            out += "It's X's Turn\n";
        } else {
            out += "It's O's Turn\n";
        }
        return out;

    }

    public boolean play(int row, int col) {
        if (row < 0 || row >= board.length || col < 0 || col >= board.length
                || board[row][col] != CellState.E) {
            System.out.println("BAD MOVE");
            return false;
        }
        if (turn == 1) {
            board[row][col] = CellState.X;
            turn = 2;
        } else {
            board[row][col] = CellState.O;
            turn = 1;
        }
        moves++;
        return true;
    }

    /**
     * Example helper method - you could use methods like this to check for
     * wins. Breaking things down like this can help you solve a complex problem
     * like determining the winner.
     *
     * @param row the row we're checking
     * @param player the CellState we're looking for
     * @return true if all cells in the row are equal to player, false
     * otherwise.
     */
    public boolean checkRow(int row, CellState player) {
        for (int col = 0; col < board[row].length; col++) {
            if (board[row][col] != player) {
                return false;
            }
        }
        return true;
    }

    /**
     * Here's a more complex way of checking the status. This method handles all
     * the cases at once. A simpler way to do it would be to make helper methods
     * like the one above and call those.
     *
     * A more efficient solution would be to check whenever a move is made. That
     * way, you only have to check the current row, column and diagonal. You
     * could store the game status as an instance variable.
     *
     * @return The current game status
     */
    public Status status() {
        for (int row = 0; row < board.length; row++) {
            CellState player = board[row][0];
            if (player != CellState.E) {
                boolean winner = true;
                for (int col = 1; col < board.length; col++) {
                    if (board[row][col] != player) {
                        winner = false;
                        break;
                    }
                }
                if (winner) {
                    if (player == CellState.X) {
                        return Status.WIN_X;
                    } else {
                        return Status.WIN_O;
                    }
                }
            }
        }
        for (int col = 0; col < board.length; col++) {
            CellState player = board[0][col];
            if (player != CellState.E) {
                boolean winner = true;
                for (int row = 1; row < board.length; row++) {
                    if (board[row][col] != player) {
                        winner = false;
                        break;
                    }
                }
                if (winner) {
                    if (player == CellState.X) {
                        return Status.WIN_X;
                    } else {
                        return Status.WIN_O;
                    }
                }
            }
        }
        CellState player = board[0][0];
        if (player != CellState.E) {
            boolean winner = true;
            for (int row = 1; row < board.length; row++) {
                if (board[row][row] != player) {
                    winner = false;
                    break;
                }
            }
            if (winner) {
                if (player == CellState.X) {
                    return Status.WIN_X;
                } else {
                    return Status.WIN_O;
                }
            }
        }
        player = board[0][board.length - 1];
        if (player != CellState.E) {
            boolean winner = true;
            for (int col = board.length - 2; col >= 0; col--) {
                if (board[(board.length - 1) - col][col] != player) {
                    winner = false;
                    break;
                }
            }
            if (winner) {
                if (player == CellState.X) {
                    return Status.WIN_X;
                } else {
                    return Status.WIN_O;
                }
            }
        }
        if (moves == board.length * board.length) {
            return Status.DRAW;
        }
        return Status.GAMEON;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int size = 3;
        TicTacToe ttt = new TicTacToe(size);
        System.out.println(ttt);
        while (ttt.status() == Status.GAMEON) {
            int row, col;
            do {
                Thread.sleep(1000);
                System.out.print("Your Move: ");
                row = sc.nextInt();
                col = sc.nextInt();
            } while (ttt.play(row, col) == false);
            System.out.println(ttt);
            if (ttt.status() == Status.GAMEON) {
                do {
                    Thread.sleep(1000);
                    row = (int) (Math.random() * size);
                    col = (int) (Math.random() * size);
                    System.out.println("My Move: " + row + " " + col);
                } while (ttt.play(row, col) == false);
            }
            System.out.println(ttt);
        }
        Status finalstate = ttt.status();
        System.out.println("Game Over: " + finalstate);

    }
}
