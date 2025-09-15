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

         Queue<String> filaPao = new LinkedList<>();
        // (LinkedList é só o "tipo" de fila que vamos usar, relaxa)

        //Chegaram 3 pessoas na fila, lembra 'primeiro que chega é o primeiro que sai'

        filaPao.add("Deywid"); //Chegou primeiro então é o primeiro da fila
        filaPao.add("James");
        filaPao.add("Jack");

        System.out.println("Essa é a nossa fila, olha que gracinha: " + filaPao);
        System.out.println();

        //Vamos remover o primeiro:
        System.out.println("O Primeiro da fila é o " + filaPao.peek());
        System.out.println();

        //Vamos remove-lo
        filaPao.poll();
        System.out.println("Após remover o primeiro fica assim: " + filaPao);
    }
}