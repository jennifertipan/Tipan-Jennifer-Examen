
package Test;

import dominio.PlanoCarteciano;
import java.util.Scanner;


public class TestPlano {

    public static void main(String[] args) {
        PlanoCarteciano p;
        Scanner e = new Scanner(System.in);
        int a, b = 0;
        p = new PlanoCarteciano();
        System.out.println("**El punto inicial esta ubicado en x=0;y=0**");
        System.out.println("Cuantas veces desea a mover: ");
        a = e.nextInt();
          
        do{
            if(a<1){
                System.out.println("***Ingrese solo numeros positivos.***");
                    System.out.println("Ingrese un numero diferente: ");
                    b = e.nextInt();
            }else{
                b=1;
            }
        }while(b!=1);
           
        mover(p,a);
            
    }
        
        public static void mover(PlanoCarteciano p, int l) {
        
        int x, y, a, r = 0, h, n = 0;
        double j;
        Scanner e = new Scanner(System.in);
        do{       
        System.out.println("Ingrese el numero de espacios que va mover: ");
            h = e.nextInt();
            do {
                a = 0;
                if (h < 0) {
                    System.out.println("***Ingrese solo numeros positivos.***");
                    System.out.println("Ingrese un numero diferente: ");
                    h = e.nextInt();
                } else {
                    a = 1;
                }
            } while (a != 1);
            n = n + h;
            j = Math.random() * 4 + 1;
            if (j > 1) {
                if (j < 2) {
                    x = p.getX() + h;
                    p.setX(x);
                    System.out.println("El punto se encuentra en la posicion." + p.mostrar());
                    System.out.println("El punto se a desplazado: " + h + " hacia la derecha.");
                }
            }
            if (j > 2) {
                if (j < 3) {
                    y = p.getY() + h;
                    p.setY(y);
                    System.out.println("El punto se encuentra en la posicion." + p.mostrar());
                    System.out.println("El punto se a desplazado: " + h + " hacia arriba.");
                }
            }
            if (j > 3) {
                if (j < 4) {
                    x = p.getX() - h;
                    p.setX(x);
                    System.out.println("El punto se encuentra en la posicion.." + p.mostrar());
                    System.out.println("El punto se a desplazado: " + h + " hacia la izquierda.");

                }
            }
            if (j > 4) {
                if (j < 5) {
                    y = p.getY() - h;
                    p.setY(y);
                    System.out.println("El punto se encuentra en la posicion." + p.mostrar());
                    System.out.println("El punto se a desplazado: " + h + " hacia abajo.");
                }
            }
            r++;
    }while(r!=l);
        System.out.println("La distancia total del punto que se a desplazado es: ");
        System.out.println(n);

    }
}
    

  

