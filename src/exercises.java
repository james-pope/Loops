public class exercises {
    public static int addOdds(int n){
        int count = 0;
        for (int i = 1; i <= n; i += 2){    
            count += i;  //adds the sum off all previous odds by the next odd
        }
        return count;
    }
    public static int howManyYears(double startpop, double endpop){
        int year = 0;
        while (startpop <= endpop) {
            double growth = startpop* 0.0113;   //stores how much the pop. grew
            startpop += growth;     //adds how much it grew by the previous pop.
            year++;
        }
        return year;
    }
    public static int sumDigits(int n){
        int count = 1;  
        int sum = 1;    //n is postive, so if n =1 it will still return 1
        while (count < n){
            count++;
            sum += count;
        }
        return sum;
    }
    public static void sillyNumbers(){
        int i, j, k;
        for (k = 0; k < 3; k++){   //repeats the nested loops 3 times
            for (i = 0; i <= 9; i++) {  
                for (j = 0; j < 3; j++) {   //prints i, 3 times before incrementing i
                    System.out.print(i);
                }
            }
        System.out.println();
        }
    }
    public static void sillyNumbers2(){
        int i, j, k;
        for (k = 0; k < 4; k++) {          //repeats nested loops 4 times
            for (i = 9; i >= 0; i--) {
                for (j = 0; j < i; j++) {   //prints i, n number of times based on value of i
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
    public static void dollarsAndStars() {
        int i, j, k, m, a, b;
        for (i = 1; i < 8; i++) {
            for (k = i -1; k > 0; k--){     //adds * before $
                System.out.print("**");
            }
            for (j = 7; j >=i; j--){   // $$$$$$, $$$$$, $$$$, $$$ etc.
                System.out.print("$"); 
            }
            for (m = 1; m <= 7-j; m++){   //middle *
                System.out.print("**");
            }
            for (a = 7; a >= i; a--){      //second set of $
                System.out.print("$");
            }
            for (b = i -1; b > 0; b--){     // last * after second set of $
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
/* OUTPUT
16
49
25

20

15
36
66

000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999

999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221

$$$$$$$**************$$$$$$$
**$$$$$$************$$$$$$**
****$$$$$**********$$$$$****
******$$$$********$$$$******
********$$$******$$$********
**********$$****$$**********
************$**$************

 */