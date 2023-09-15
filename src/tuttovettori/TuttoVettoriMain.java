package tuttovettori;
import java.util.Scanner;

public class TuttoVettoriMain {

    public static void main(String[] args){
        Scanner tastiera = new Scanner(System.in);
        
        System.out.print("Inserire lunghezza vettore: ");
        int dimLog = tastiera.nextInt();
        int[] vettore = new int[dimLog];
        int i;
        for(i=0; i<vettore.length; i++){
            System.out.println("Inserisci un valore in posiz."+(i+1)+": ");
            vettore[i] = tastiera.nextInt();
        }
        i = 0;
        TuttoVettori v1 = new TuttoVettori(dimLog, vettore);
        System.out.println("Vettore=\n"+v1.stampaVettore());
        int ripeti = 0;
        while(ripeti==0){
            System.out.print("\nSCEGLI L'OPERAZIONE:\n1.Esci\n2.Caricamento random del vettore\n3.Scambio di due celle\n4.Modifica contenuto cella\n5.Elimina cella\n6.Trova cella\n7.Somma contenuti celle\n");
            int scelta = tastiera.nextInt();
            switch(scelta){
                case 1:
                    ripeti++;
                    break;
                case 2:
                    System.out.print("\nInserisci il range dei numeri random\nmin: ");
                    int input = tastiera.nextInt();
                    System.out.print("\nmax: ");
                    int input2 = tastiera.nextInt();
                    v1.caricamentoRandom(input, input2);
                    System.out.println("VETTORE GENERATO=\n"+v1.stampaVettore());
                    break;
                case 3:
                    System.out.println("Inserisci posiz. delle 2 celle da invertire:");
                    input = tastiera.nextInt();
                    input2 = tastiera.nextInt();
                    v1.scambioCelle(input, input2);
                    System.out.println("VETTORE CON CELLE "+input+" e "+input2+" INVERITE=\n"+v1.stampaVettore());
                    break;
                case 4:
                    System.out.println("Inserisci posiz. della cella da modificare: ");
                    input = tastiera.nextInt();
                    System.out.println("Inserisci valore da inserire: ");
                    input2 = tastiera.nextInt();
                    v1.modificaCella(input, input2);
                    System.out.println("VETTORE MODIFICATO=\n"+v1.stampaVettore());
                    break;
                case 5:
                    System.out.println("Inserisci la posiz. della cella da eliminare:\n");
                    input = tastiera.nextInt();
                    v1.cancellaCella(input);
                    System.out.println(v1.stampaVettore());
                    break;
                case 6:
                    System.out.println("Inserisci il valore da trovare: ");
                    input = tastiera.nextInt();
                    input2 = Integer.valueOf(v1.cercaCella(input));
                    if(input2>=0){
                        System.out.println("Il valore "+input+" e' presente nella cella "+v1.cercaCella(input));
                    }else{
                        System.out.println("Il valore inserito non è presente nel vettore.");
                    }
                    break;
                case 7:
                    System.out.println("(IL RISULTATO VERRA' SOVRASCRITTO NELLA SECONDA CELLA)\nInserisci la posiz. della prima cella:");
                    input = tastiera.nextInt();
                    System.out.println("Inserisci la posiz. della seconda cella:");
                    input2 = tastiera.nextInt();
                    v1.sommaCelle(input, input2);
                    System.out.println("VETTORE SOMMATO=\n"+v1.stampaVettore());
                    System.out.println(v1.getVettore());
                    break;
            }
        }
    }
}