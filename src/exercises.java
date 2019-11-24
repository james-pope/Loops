public class exercises {
    public static int addOdds(int n){
        int count = 0;
        for (int i = 1; i <= n; i = i + 2){
            count += i;
        }
        return count;
    }
    public static int howManyYears(double startpop, double endpop){
        int year = 0;
        while (startpop <= endpop) {
            double growth = startpop* 0.0113;
            startpop += growth;
            year++;
        }
        return year;
    }
    public static int sumDigits(int n){
        int count = 1;
        int sum = 1;
        while (count < n){
            count++;
            sum += count;
        }
        return sum;
    }
    public static void sillyNumbers(){
        int i, j, k;
        for (k = 0; k <= 3; k++){
            for (i = 0; i < 10; i++) {
                for (j = 0; j < 3; j++) {
                    System.out.print(i);
                }
            }
        System.out.println();
        }
    }
    public static void sillyNumbers2(){
        int i, j, k;
        for (k = 0; k <= 3; k++) {          //creates the 4 lines
            for (i = 9; i >= 0; i--) {
                for (j = 0; j < i; j++) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
    public static void dollarsAndStars() {
        int i, j, k, m, a, b;
        for (i = 1; i < 8; i++) {
            for (k = i -1; k > 0; k--){
                System.out.print("**");
            }
            for (j = 7; j >=i; j--){   // outputs $$$$$$, $$$$$, $$$$, $$$ etc.
                System.out.print("$"); 
            }
            for (m = 1; m <= 7-j; m++){
                System.out.println("**");
            }
            for (a = 7; a >= i; a--){
                System.out.print("$");
            }
            for (b = i -1; b > 0; b--){
                System.out.print("**");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        System.out.println(addOdds(8));
        System.out.println(addOdds(13));
        System.out.println(addOdds(10));
        System.out.println();

        System.out.println(howManyYears(120, 150));
        System.out.println();

        System.out.println(sumDigits(5));
        System.out.println(sumDigits(8));
        System.out.println(sumDigits(11));
        System.out.println();

        sillyNumbers();
        System.out.println();

        sillyNumbers2();
        System.out.println();

        dollarsAndStars();
    }
}
