package matrizes;

public class Ex3 {
    public static void main(String[] args){
        int[][] mat = new int[8][8];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i - j >= 0 ){
                    mat[i][j] = 1;
                } else {
                    mat[i][j] = 0;
                }
            }
        }

        System.out.println("Matriz: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
