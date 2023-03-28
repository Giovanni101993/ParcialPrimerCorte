package com.example.miprimerejemplo;

public class Calculadora {

        private int n1, n2, res;

        public void setResultadoMul(int n1, int n2){

            this.n1=n1;
            this.n2=n2;
        }

        private int operacionMult(){
            res= n1*n2;
            return res;
        }

        public int getResMult(){

            return operacionMult();
        }

/*----------------------------------------------------------------------------------*/

        public int operacionFib(int n1){
            if ((n1==0) || (n1==1))
                return n1;
            else
                    return operacionFib(n1 - 1) + operacionFib(n1 - 2);
        }

    /*----------------------------------------------------------------------------------*/

    public int operacionPot(int n1, int n2){
        if (n2==1) return n1;
        else if(n2==0) return 1;
        else return n1 * operacionPot(n1, n2-1);
    }

}




