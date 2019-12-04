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
            e += 1/calcFactorial(n);
            n++;
        }
        return e;
    }
    public static void main(String [] args){
        for (int i = 1; i <=20; i++){   // when testing 1-20 some numbers become negative
            System.out.println(i + " = " + calcFactorial(i));
        }
        System.out.println(calcE());
    }
}
