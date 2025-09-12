//O QUE É PILHA: Como uma pilha de livros na sua mesa - sempre pega o de cima.

//Primeiro vc declara a merda da classe que é o mesmo nome do arquivo que vc ta mexendo.

import java.util.Stack; // Se não importar o bgl não funciona ne krl kkkkk

class Pilha {

    //não sei exatamento o pq disso.
    public static void executar() {

        /*
        * Sobre a STACK: Gerencia o fluxo de chamadas de métodos.
        * Cada vez que um método é invocado, um novo bloco de memória
        * é alocado na stack para armazenar suas variáveis locais e o
        * contexto da execução.
        */

        //Criando a pilha do 'sandubão'
        Stack<String> pilhaSanduba = new Stack<>();


        /*
         * ALGUNS COMANDOS:
         * push() = coloca a parada em cima
         * pop() = pega a parada de cima
         * peek() = olha qual a parada que tá em cima sem tirar
        */

        
        //Empilhando as paradas
        pilhaSanduba.push("Base do Pão");
        pilhaSanduba.push("Alface");
        pilhaSanduba.push("Tomate");
        pilhaSanduba.push("Hamburguer");
        pilhaSanduba.push("Alface");
        pilhaSanduba.push("Pão em cima");

        //Com isso vc ta tipo, literalmente empilhando..

        //Vamo vê como que tá essa coisa toda:
        System.out.println();
        System.out.println("Esse é o Sandubão: ");
        System.out.println(pilhaSanduba);
        System.out.println();

        //Agora so o que ta em cima:
        System.out.println("Esse é o que tá no topo: " + pilhaSanduba.peek());
        System.out.println();

        //OOOOHHHHHHH!!!!

        /* Agr vamo tirar esse pão do topo.
        *
        * Pra fazer isso é meio diferente ó:
        *
        * pilhaSanduba.pop() → chama o método que remove o topo da pilha e devolve o valor
        *
        * String itemTirado = ... → guarda esse valor (que é uma String) na variável itemTirado
        *
        * Ou seja: 
        * Você está pegando (e tirando) o item do topo da pilha.
        * Está guardando ele na variável itemTirado para usar depois (exibir, comparar, etc.).
        */

        String itemTirado = pilhaSanduba.pop();
        System.out.println("Tiramos do topo: " + itemTirado);

    }
}