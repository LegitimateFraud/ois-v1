import java.util.*;
public class Gravitacija {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double visina = sc.nextDouble();
        
        double rez = izracunG(visina);
        izpis(visina, rez);
    }

    public void izpis(double nmv, double g) {
        System.out.println(nmv);
        System.out.println(g);
        }
    }
    public static double izracunG(double v){
        float nadmorskavisina = sc.nextFloat();
        double gravitacijskipospesek = 6,674* Math.pow(10,-11);
        double masaZemlje = 5,972* Math.pow(10, 24);
        double radijZemlje = 6,371 * Math.pow(10,6);
        return ((gravitacijskipospesek*masaZemlje)/Math.pow((radijZemlje + v), 2));
    }
}