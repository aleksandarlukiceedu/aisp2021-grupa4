package zadaci;

public class Zadatak1 {

    public static int suma(int x1, int x2){
        return x1+x2;
    }

    public static double suma(double x1, double x2){
        return x1+x2;
    }

    public static void main(String[] args){
        double rez = Zadatak1.suma(1.0, 2);
        System.out.println(rez);

        int[] niz = {3,2,3,4,5,6,7,8};

        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);
        }

        for (int element: niz){
            System.out.println(element);
        }
    }
}
