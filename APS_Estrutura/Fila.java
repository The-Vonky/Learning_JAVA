// O QUE É FILA: É como fila do açougue, quem chegou primeiro é atendido primeiro.

import java.util.*;
//Primeiro declara a porra da classe que vc vai usar.
class Fila {
    public static void main(String[] args){
        

        /*
         * Alguns comandos í seu otário.
         * 
         * add() = pra entrar no final da fila
         * poll() = pra sair da fila (o primeiro da fila sai)
         * peek() = pra ver quem tá na frente da fila
         * 
         */

         //É parecido tá vendo?

         //Agora vamos criar a fila, pode ser de qualquer merda.

         Queue<String> filaPão = new LinkedList<>();
        // (LinkedList é só o "tipo" de fila que vamos usar, relaxa)

        //Chegaram 3 pessoas na fila, lembra 'primeiro que chega é o primeiro que sai'

        filaPão.add("Deywid"); //Chegou primeiro então é o primeiro da fila
        filaPão.add("James");
        filaPão.add("Jack");

        System.out.println("Essa é a nossa fila, olha que gracinha: " + filaPão);
        System.out.println();
    }
}