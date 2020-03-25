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
                while(numInicial>=numLimite){
                    for(int a = numInicial; a<=numLimite;a++){
                    int m = Tabla(a);
                    System.out.println(m);
                    }
                }
            }
        }
    }
    public int Tabla(int numero){
        int valor = -1;
        while(numero>0){
            for(int c=0;c>=0;c++){
                valor = numero * c;
                if(numeroPar(valor)==true){
                    return valor;
                }
            }
        }
        return valor;
    }
    public boolean numeroPar(int x){
        boolean par = false;
        int r = x%2;
        if(r == 1){
            par = true;
        }
        return par;
    }
}
