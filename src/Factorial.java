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
        int n = 1;
        while (e - olde >.001){
            olde = e;
            e += Math.pow(x, n) / (double)calcFactorial(n);
            n++;
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
/*
OUTPUT
1 = 1
2 = 2
3 = 6
4 = 24
5 = 120
6 = 720
7 = 5040
8 = 40320
9 = 362880
10 = 3628800
11 = 39916800
12 = 479001600
13 = 6227020800
14 = 87178291200
15 = 1307674368000
16 = 20922789888000
17 = 355687428096000
18 = 6402373705728000
19 = 121645100408832000
20 = 2432902008176640000

2.7182539682539684

e is 2.718
e is 7.389
e is 20.085
e is 54.598
e is 148.413

 */
}
