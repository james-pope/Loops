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
    publi

    public static void main(String [] args){
        System.out.println(addOdds(8));
        System.out.println(addOdds(13));
        System.out.println(addOdds(10));
        System.out.println();

        System.out.println(howManyYears(120, 150));

    }
}