package task1;

import javax.swing.*;
import java.util.Scanner;

public class calc {

    static int[][] ms;

    static void outGame() {
        String str = "";
        for (int i = 0; i < ms.length; i++) {
            str += "-----";
        }

        for (int i = 0; i < ms.length; i++) {
            System.out.println(str);
            for (int j = 0; j < ms.length; j++) {
                System.out.print("| ");
                if (ms[i][j] == 1) {
                    System.out.print("X ");
                }

                if (ms[i][j] == 0) {
                    System.out.print("O ");
                }

                if (ms[i][j] == -1) {
                    System.out.print("  ");
                }

            }
            System.out.println("|");
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("write size (min = 3)");
        int sz;
        do {
            sz = in.nextInt();
        } while (sz < 3);

        ms = new int[sz][sz];
        for (int i = 0; i < sz; i++) {
            for (int j = 0; j < sz; j++) {
                ms[i][j] = -1;
            }
        }

        outGame();

        int x, y;
        boolean isWin = false;
        boolean isX = true;
        while (!isWin) {
            System.out.println("write coordinates(x,y):");
            x = in.nextInt();
            y = in.nextInt();
            x--;
            y--;
            if (isX) {
                ms[x][y] = 1;
                isX = false;
            } else {
                ms[x][y] = 0;
                isX = true;
            }

            isWin = check();
            if(pare()){
                break;
            }
        }
        if(isWin) {
            if (isX) {
                System.out.println("O is win");
            } else {
                System.out.println("X is win");
            }
        }else {
            System.out.println("x=o");
        }

    }

    static boolean pare(){
        boolean rez = false;

        for (int i = 0; i <ms.length ; i++) {
            for (int j = 0; j <ms.length ; j++) {
                if(ms[i][j] != -1){
                    rez = true;
                }else
                    return false;
            }
        }

        return rez;
    }

    static boolean check() {
        boolean win = false;
        for (int j = 0; j < ms.length; j++) {
            for (int i = 0; i < ms.length - 1; i++) {
                if (ms[i][j] == ms[i + 1][j] && ms[i][j] != -1) {
                    win = true;
                } else {
                    win = false;
                    break;
                }
            }
        }

        if (win)
            return true;

        for (int i = 0; i < ms.length; i++) {
            if (ms[i][i] == ms[i + 1][i + 1] && ms[i][i] != -1) {
                win = true;
            } else {
                win = false;
                break;
            }
        }
        if (win)
            return true;

        for (int i = ms.length - 1; i > 0; i--) {
            int j = ms.length - i - 1;
            if (ms[i][i] == ms[i - 1][j + 1] && ms[i][i] != -1) {
                win = true;
            } else {
                win = false;
                break;
            }
        }

        if (win)
            return true;

        return false;
    }
}