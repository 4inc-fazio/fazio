package tuttovettori;
import java.util.Random;

public class TuttoVettori {
    private int[] vettore;
    private int dimLog;
    
    public int[] getVettore(){
        return vettore;
    }
    public TuttoVettori(int dimLog, int[] vettore){
        this.dimLog = dimLog;
        this.vettore = new int[this.vettore.length];
        for(int i=0; i<vettore.length; i++){
            this.vettore[i] = vettore[i];
        }
    }
    public void copiaVettore(){
        int[] vettore2 = new int[vettore.length];
        for(int i=0; i<vettore.length; i++){
            vettore2[i] = this.vettore[i];
        }
    }
    public TuttoVettori(int dimLog){
        this.dimLog = dimLog;
    }
    
    public void caricamentoRandom(int min, int max){
        Random rand = new Random();
        for(int i=0; i<vettore.length; i++)
            vettore[i] = rand.nextInt(max);
    }
    public void scambioCelle(int posOrig, int posDest){
        int orig = vettore[posOrig-1];
        vettore[posOrig-1] = vettore[posDest-1];
        vettore[posDest-1] = orig;
    }
    public void modificaCella(int posiz, int valore){
        vettore[posiz-1] = valore;
    }
    public void cancellaCella(int posiz){
        int[] vettore2 = new int[vettore.length-1];
        int o = 0;
        for(int i=0; i<vettore2.length; i++){
            if(i!=(posiz-1)){
                vettore2[i] = vettore[o];
                o++;
            }
        }
        vettore = vettore2;
    }
    public String cercaCella(int valore){
        String celle = "";
        int o = 0;
        for(int i=0;i<vettore.length;i++){
            if(vettore[i]==valore){
                celle+=i;
                o++;
            }
        }
        if(o==0){
            celle = "-1";
        }
        return celle;
    }
    public void sommaCelle(int posOrig, int posDest){
        vettore[posDest-1]+=vettore[posOrig-1];
    }
    public void shift(){
        
    }
    public String stampaVettore(){
        String s ="";
        for(int i=0; i<vettore.length; i++){
            s+="Cella "+i+": "+vettore[i]+"\n";
        }
        return s;
    }
}
