package Lab01;
public class Lab1A {
    public static void main(String[] args) {
        char[] [] regularPixel = make_forward();
        for (int i = 0; i < regularPixel.length; i++) {
            for (int b = 0; b < regularPixel[i].length; b++) {
                System.out.print(regularPixel[i][b]);
            }
            System.out.println(" ");
        }
        char[] [] mirrorPixel = make_mirror(regularPixel);
        for (int i = 0; i < mirrorPixel.length; i++) {
            for (int b = 0; b < mirrorPixel[i].length; b++) {
               if (mirrorPixel[i][b] == "(".charAt(0)) {
                   mirrorPixel[i][b] = ")".charAt(0);
               } else if (mirrorPixel[i][b] == ")".charAt(0)) {
                   mirrorPixel[i][b] = "(".charAt(0);
               } else if (mirrorPixel[i][b] == "/".charAt(0)) {
                   mirrorPixel[i][b] = "\\".charAt(0);
               } else if (mirrorPixel[i][b] == "\\".charAt(0)) {
                   mirrorPixel[i][b] = "/".charAt(0);
               }

                System.out.print(mirrorPixel[i][b]);
            }
            System.out.println(" ");
        }

        for (int rows = 0; rows < regularPixel.length; rows++) {
            for (int cols = 0; cols < regularPixel[0].length; cols++) {
                System.out.print(regularPixel[rows][cols]);
            }
            System.out.print(" ");
            for (int n = 0; n < regularPixel[0].length; n++) {
                System.out.print(mirrorPixel[rows][n]);
            }
            System.out.println();
        }

    }

    public static char[][] make_mirror(char[][] regularPixel) {
        char [] [] mirrorPixel = new char[4][13];
        for (int i = 0; i < regularPixel.length; i++) {
            for (int b = 0; b < regularPixel[i].length; b++) {
                mirrorPixel[i][b] = regularPixel[i][regularPixel[i].length - b - 1];
            }
        }
    return mirrorPixel;
    }

    public static char[][] make_forward() {
        char[][] pixel = new char[4][13];
        pixel[0][0]=' ';
        pixel[0][1]=' ';
        pixel[0][2]='_';
        pixel[0][3]='_';
        pixel[0][4]='_';
        pixel[0][5]='_';
        pixel[0][6]='_';
        pixel[0][7]='_';
        pixel[0][8]=' ';
        pixel[0][9]=' ';
        pixel[0][10]=' ';
        pixel[0][11]=' ';
        pixel[0][12]=' ';
        pixel[1][0]=' ';
        pixel[1][1]='/';
        pixel[1][2]='|';
        pixel[1][3]='_';
        pixel[1][4]='|';
        pixel[1][5]='|';
        pixel[1][6]='_';
        pixel[1][7]='\\';
        pixel[1][8]='\'';
        pixel[1][9]='.';
        pixel[1][10]='_';
        pixel[1][11]='_';
        pixel[1][12]=' ';
        pixel[2][0]='(';
        pixel[2][1]=' ';
        pixel[2][2]=' ';
        pixel[2][3]=' ';
        pixel[2][4]='_';
        pixel[2][5]=' ';
        pixel[2][6]=' ';
        pixel[2][7]=' ';
        pixel[2][8]=' ';
        pixel[2][9]='_';
        pixel[2][10]=' ';
        pixel[2][11]='_';
        pixel[2][12]='\\';
        pixel[3][0]='=';
        pixel[3][1]='\'';
        pixel[3][2]='-';
        pixel[3][3]='(';
        pixel[3][4]='_';
        pixel[3][5]=')';
        pixel[3][6]='-';
        pixel[3][7]='-';
        pixel[3][8]='(';
        pixel[3][9]='_';
        pixel[3][10]=')';
        pixel[3][11]='-';
        pixel[3][12]='\'';
        return pixel;
    }
}

