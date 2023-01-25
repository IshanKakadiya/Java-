public class patterns {
    public static void main(String[] args) {
        /*
         * Holo Pattern = *****
         * *
         * *
         *****
         */
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 5; j++) {
        // if (i == 1 || j == 1 || i == 4 || j == 5) {

        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Piramid
        /*
            *
            **
            ***
            ****
        */
        // for (int i = 0; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Piramid
        /*
         * * * *
         * * *
         * *
         *
         */
        // for (int i = 1; i <= 4; i++) {
        // for (int j = i; j <= 4; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = 4; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        /*
         *
         * *
         * * *
         * * * *
         */

        // for (int i = 1; i <= 4; i++) {
        // // inner loop -> space print
        // for (int j = 1; j <= 4 - i; j++) {
        // System.out.print(" ");
        // }

        // // inner loop -> star print
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }

        /*
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         */

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        /*
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         */
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5 - i + 1; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        /*
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         * 11 12 13 14 15
         */

        int n = 5;
        // int number = 1;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(number + " ");
        // number++;
        // }

        // System.out.println();

        // }

        /*
         * 1
         * 0 1
         * 1 0 1
         * 0 1 0 1
         * 1 0 1 0 1
         */

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // // Even
        // if ((i + j) % 2 == 0) {
        // System.out.print("1 ");
        // } else { // Odd
        // System.out.print("0 ");
        // }
        // }

        // System.out.println();

        // }

        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 4; j >= i; j--) {
        // System.out.print(" ");
        // }

        // for (int j = 1; j <= 5; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        /*
         * 1
         * 2 2
         * 3 3 3
         * 4 4 4 4
         * 5 5 5 5 5
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}