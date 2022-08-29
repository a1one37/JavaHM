package board;

import HomeW_15.Main;

import java.lang.reflect.Field;

public class board {
    private static final int MAX_X = 15;
    private static final int MAX_Y = 60;

    private static boolean[][] field;

    public board(int aliveCellCount) {
        field = generateField(aliveCellCount);
    }

    private static boolean[][] generateField(int aliveCellCount) {
        for (int i = 0; i < aliveCellCount; i++) {
            int x = (int) (Math.random() * MAX_X);
            int y = (int) (Math.random() * MAX_Y);
            if (field[x][y]) {
                i--;

            } else {
                field[x][y] = true;
            }
        }


        return field;
    }

    public void print() {
        for (boolean[] row : field) {
            for (boolean cell : row) {
                System.out.println((cell));
            }
        }
    }
}

