public class Factorial {
    public static long calcFactorial(int n){
        int x = 1;
        long total = 1;
        while (n>x){
            total *= x;
            x++;
        }
        total *= n;
        return total;
    }
    public static double calcE(){
        double e =1, olde =0;
        int n = 1;
        while (e -olde >.001){
            olde = e;
            e += 1/(double)calcFactorial(n);
            n++;
        }
        return e;
    }
    public static void calcEx(int x){
        double e = 1, olde =0;
        int base =1;
        int n = 1;
        double numerator = Math.pow(base, x);
        while (e - olde >.001){
           olde = e;
           e += numerator/ (double)calcFactorial(base)
        }
        System.out.printf("e is %2.3f \n", e);
    }
    public static void main(String [] args){
        for (int i = 1; i <=20; i++){   // when testing 1-20 some numbers become negative
            System.out.println(i + " = " + calcFactorial(i));
        }
        System.out.println();
        System.out.println(calcE());
        System.out.println();

        for (int j = 1; j <= 5; j++){
            calcEx(j);
        }
    }

}
