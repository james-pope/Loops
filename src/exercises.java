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
        int i, j;
        for (i = 3; i < 10; i++){
            for (j = 1; j < i; j++){
                System.out.print(j);
            }
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

        sillyNumbers();
    }
}