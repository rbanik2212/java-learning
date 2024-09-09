import java.util.ArrayList;
import java.util.Arrays;

public class Wordsearch {

    private char[][] board;
    private String word;


    public Wordsearch(char[][] board, String word) {
        this.word = word;
        this.board = board;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[0].length; j++) {
                sb.append(this.board[i][j] + " ");
            }
            sb.append("\n");
        }

        return "Wordsearch{ \n" +
                "board=\n" + sb +
                ",word='" + word + '\'' +
                '}';
    }


    public static boolean letterCheck(String word, char[][] board, int indexR, int indexC) {

        String newWord = word;
        boolean rowCheck = (indexR >= 0 && indexR < board.length);
        boolean colCheck = (indexC >= 0 && indexC < board[0].length);
        boolean result =false;

        System.out.printf("row num %d and col num is %d\n", indexR, indexC);
        System.out.println("Row check " + rowCheck);
        System.out.println("Col check " + colCheck);
        System.out.println(word);
        if (!word.isEmpty() && ((indexR >= 0 && indexR < board.length) && (indexC >= 0 && indexC < board[0].length))) {
            if (board[indexR][indexC] == word.charAt(0)) {
//                System.out.println("FOUND: " + board[indexR][indexC]);
                newWord = newString(word, word.charAt(0));
            }
//            System.out.println("sending " + board[indexR][indexC + 1]);
            letterCheck(newWord, board, indexR, indexC + 1);

//            System.out.println("sending2 " + board[indexR][indexC + 1]);
            letterCheck(newWord, board, indexR + 1, indexC);

//            System.out.println("sending3 " + board[indexR][indexC - 1]);
            letterCheck(newWord, board, indexR, indexC - 1);

//            System.out.println("sending4 " + board[indexR - 1][indexC]);
            letterCheck(newWord, board, indexR - 1, indexC);

        } else {
            System.out.println("not found");
        }

        if (word.isEmpty()){
            result= true;
        }
        return result;

    }


    private static String newString(String word, char ch) {
        String result = "";
        int charIndex = word.indexOf(ch);

        if (!word.isEmpty() &&charIndex >= 0) {
            result = word.substring(0, charIndex) + word.substring(charIndex + 1);
            System.out.println("new substring: " + result);
            return result;
        } else {
            System.out.println("Index out of bounds");
        }
        return result;


    }


    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        String word2 = "SEE";
        String test = "test";

//        String res = newString(test, 't');
//        System.out.println(res);


//        System.out.println(board[0][1]);
//        int halfRows = board[0].length / 2;
//        int halfCol = board[0].length / 2;
//        for (int i = 0; i < halfRows; i++) {
//            for (int j = 0; j < halfCol; j++) {
//                System.out.print(board[i][j]);
//            }
//            System.out.println();
//        }


        /* Here is the main implementation */
        System.out.println(letterCheck(word2, board, 0, 0));

//        System.out.println(board[0][1]);
//        System.out.println(board[0][1]);
//        System.out.println(board[0][1]);
//        Wordsearch ws = new Wordsearch(board, word);
//        ws.letterCheck();
//
//        System.out.println(ws);
    }

}
