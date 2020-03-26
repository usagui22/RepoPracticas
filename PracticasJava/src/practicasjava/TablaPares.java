/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasjava;

/**
 *
 * @author Usagui
 */
class TablaPares {
    private int numInicial;
    private int numLimite;
    
    public TablaPares(int ni, int nf){
        numInicial = ni;
        numLimite = nf;
    }
    public void GenerarTabla(){
        if(numInicial>0){
            if(numLimite>0){
                int m = -1;
                for(int a = numInicial; a<= numLimite ;a++){
                m = Tabla(a);
                System.out.println(m);
                }
                    
            }
        }
    }
    public int Tabla(int mdor){
        int valor = -1;        
        if(mdor>0){ 
            int mando2 = 1;
            while(mando2 <=100){
            valor = mdor * mando2;
            if(numeroPar(valor))
            System.out.println(mdor + " * "+ mando2+ " = "+ valor);
            mando2=mando2+1;
            }
            
            /*for(int mando =1;mando <= 100;mando++){
                valor = mdor * mando;  
                System.out.println(mdor + " * "+ mando + " = " + valor);
                if(numeroPar(valor)==true){
                    return valor;
                }
            }**/
        }
        return valor;
    }
    
    public boolean numeroPar(int x){
        boolean par = false;
        int r = x%2;
        if(r == 0){
            par = true;
        }
        return par;
    }
}
