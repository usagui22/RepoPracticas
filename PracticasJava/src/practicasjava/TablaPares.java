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
                for(int a = numInicial; a<= numLimite ;a++){
                Tabla(a);                
                }
                    
            }
        }
    }
    public void Tabla(int mdor){
        int valor = -3;        
        int mando2 = 1;
            while(mando2 <=100 ){
                valor = mdor * mando2;
                if(numeroPar(valor))
                System.out.println(valor);
                mando2=mando2+1;
            }
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
