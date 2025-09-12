/* 
 * PRÁTICA 01 - ESTRUTURA DE DADOS E ALGORITMOS
 * 
 * Olha só, vou te explicar essas estruturas de dados de um jeito mais sussa!
 * 
 * Basicamente são 3 formas diferentes de guardar e organizar informação:
 * - PILHA: Como uma pilha de livros na sua mesa - sempre pega o de cima
 * - FILA: Como fila do açougue - quem chegou primeiro é atendido primeiro  
 * - LISTA: Como sua playlist - dá pra adicionar música onde você quiser
 */

import java.util.*;

// ========== EXERCÍCIO 1: PILHA ==========
class Exercicio1_Pilha {
    public static void executar() {
        System.out.println("========== EXERCÍCIO 1: PILHA ==========");
        
        /* 
         * PILHA é tipo assim: imagina uma pilha de pratos sujos na pia
         * Você sempre coloca o prato novo em cima, né?
         * E na hora de lavar, pega sempre o de cima também
         * 
         * É exatamente isso que a pilha faz!
         * push() = colocar prato em cima
         * pop() = pegar o prato de cima
         * peek() = olhar qual prato tá em cima sem tirar
         */
        
        // Criando nossa pilha pra guardar nomes de linguagens
        Stack<String> pilhaLinguagens = new Stack<>();
        
        // Vamos empilhar algumas linguagens (tipo colocar pratos na pilha)
        System.out.println("Colocando linguagens na pilha...");
        pilhaLinguagens.push("Java");        // Java vai pro fundo
        pilhaLinguagens.push("Python");      // Python vai em cima do Java
        pilhaLinguagens.push("JavaScript");  // JavaScript vai no topo
        
        /*
         * Agora tá assim (imagina de baixo pra cima):
         * JavaScript ← topo (esse aqui tá "em cima")
         * Python
         * Java       ← fundo
         */
        
        // Vamos ver como tá nossa pilha
        System.out.println("Pilha depois de colocar 3 linguagens:");
        System.out.println(pilhaLinguagens);
        System.out.println("O que tá no topo: " + pilhaLinguagens.peek());
        System.out.println();
        
        // Agora vamos tirar o que tá no topo (igual tirar o prato de cima)
        String linguagemTirada = pilhaLinguagens.pop();
        System.out.println("Tiramos do topo: " + linguagemTirada);
        
        /*
         * JavaScript saiu fora! Agora a pilha tá assim:
         * Python ← agora esse é o topo
         * Java
         */
        System.out.println("Pilha depois de tirar o de cima:");
        System.out.println(pilhaLinguagens);
        System.out.println();
        
        // Bora colocar mais algumas linguagens
        System.out.println("Colocando mais linguagens...");
        pilhaLinguagens.push("C++");  // C++ vai pro topo
        pilhaLinguagens.push("Go");   // Go vai pro topo (empurra C++ pra baixo)
        
        /*
         * Agora ficou assim:
         * Go     ← topo
         * C++
         * Python
         * Java   ← fundo
         */
        
        System.out.println("Pilha final:");
        System.out.println(pilhaLinguagens);
        System.out.println("Topo atual: " + pilhaLinguagens.peek());
        System.out.println();
    }
}

// ========== EXERCÍCIO 2: FILA ==========
class Exercicio2_Fila {
    public static void executar() {
        System.out.println("========== EXERCÍCIO 2: FILA ==========");
        
        /* 
         * FILA é o contrário da pilha, cara!
         * Sabe aquela fila chata do banco? É exatamente isso!
         * 
         * Quem chega primeiro fica na frente e é atendido primeiro
         * Quem chega depois vai pro final da fila
         * 
         * add() = entrar no final da fila
         * poll() = sair da fila (o primeiro da fila sai)
         * peek() = ver quem tá na frente da fila
         */
        
        // Vamos criar nossa fila de alunos
        Queue<String> filaAlunos = new LinkedList<>();
        // (LinkedList é só o "tipo" de fila que vamos usar, relaxa)
        
        // Chegaram 3 alunos na fila
        System.out.println("Galera chegando na fila...");
        filaAlunos.add("Ana Silva");      // Ana chegou primeiro, fica na frente
        filaAlunos.add("Carlos Santos");  // Carlos fica atrás da Ana
        filaAlunos.add("Maria Oliveira"); // Maria fica no final
        
        /*
         * A fila tá assim (da frente pro final):
         * Ana Silva → Carlos Santos → Maria Oliveira
         * (Ana vai ser atendida primeiro)
         */
        
        System.out.println("Fila depois que chegaram 3 alunos:");
        System.out.println(filaAlunos);
        System.out.println("Próximo a ser atendido: " + filaAlunos.peek());
        System.out.println();
        
        // Ana vai ser atendida e sair da fila
        String alunoAtendido = filaAlunos.poll();
        System.out.println("Foi atendido e saiu: " + alunoAtendido);
        
        /*
         * Ana foi embora, agora a fila é:
         * Carlos Santos → Maria Oliveira
         * (Carlos agora é o primeiro da fila)
         */
        System.out.println("Fila depois que Ana foi atendida:");
        System.out.println(filaAlunos);
        System.out.println();
        
        // Chegaram mais 2 pessoas e entraram no FINAL da fila
        System.out.println("Chegaram mais pessoas...");
        filaAlunos.add("João Pereira");  // João vai pro final
        filaAlunos.add("Lucia Costa");   // Lucia vai pro final (depois do João)
        
        /*
         * Agora a fila ficou:
         * Carlos Santos → Maria Oliveira → João Pereira → Lucia Costa
         */
        
        System.out.println("Fila final:");
        System.out.println(filaAlunos);
        System.out.println("Próximo a ser atendido: " + filaAlunos.peek());
        System.out.println();
    }
}

// ========== CLASSE PRODUTO ==========
class Produto {
    /*
     * Essa classe é só pra representar um produto qualquer
     * Tem nome e preço, nada demais
     * 
     * Os atributos são "private" porque é boa prática (encapsulamento)
     * Significa que só dá pra mexer neles através dos métodos da classe
     */
    
    private String nome;   // private = ninguém de fora consegue mexer diretamente
    private double preco;
    
    // Construtor: é chamado quando você faz "new Produto(...)"
    public Produto(String nome, double preco) {
        this.nome = nome;    // "this.nome" é o atributo da classe
        this.preco = preco;  // "nome" (sem this) é o parâmetro que chegou
    }
    
    // Métodos pra pegar os valores (já que os atributos são private)
    public String getNome() {
        return nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    // toString(): define como vai aparecer quando você der print no objeto
    @Override
    public String toString() {
        return String.format("Produto{nome='%s', preco=R$%.2f}", nome, preco);
    }
}

// ========== EXERCÍCIO 3: LISTA ENCADEADA ==========
class Exercicio3_ListaEncadeada {
    public static void executar() {
        System.out.println("========== EXERCÍCIO 3: LISTA ENCADEADA ==========");
        
        /* 
         * LISTA é tipo sua playlist do Spotify, sacou?
         * 
         * Você pode:
         * - Adicionar música no começo, no meio, no final... onde quiser!
         * - Tirar música de qualquer lugar
         * - Pular pra qualquer música pelo número (índice)
         * 
         * É bem mais flexível que pilha e fila
         * 
         * Métodos úteis:
         * - add() = adiciona no final
         * - addFirst() = adiciona no começo  
         * - addLast() = adiciona no final (mesmo que add())
         * - add(posição, item) = adiciona numa posição específica
         * - remove(posição) = tira o item daquela posição
         * - get(posição) = pega o item daquela posição
         */
        
        // Criando nossa lista de produtos
        LinkedList<Produto> listaProdutos = new LinkedList<>();
        
        // Vamos criar alguns produtos primeiro
        System.out.println("Criando alguns produtos...");
        Produto produto1 = new Produto("Notebook", 2500.00);
        Produto produto2 = new Produto("Mouse", 50.00);
        Produto produto3 = new Produto("Teclado", 150.00);
        
        // Agora vamos adicionar eles em posições específicas:
        
        // 1º produto vai pro COMEÇO da lista
        System.out.println("Botando Notebook no começo...");
        listaProdutos.addFirst(produto1);
        /*
         * Lista: [Notebook]
         *        posição 0
         */
        
        // 2º produto vai pro FINAL da lista
        System.out.println("Botando Mouse no final...");
        listaProdutos.addLast(produto2);
        /*
         * Lista: [Notebook, Mouse]
         *        posição 0  posição 1
         */
        
        // 3º produto vai na posição 1 (entre Notebook e Mouse)
        System.out.println("Enfiando Teclado na posição 1 (no meio)...");
        listaProdutos.add(1, produto3);
        /*
         * Lista: [Notebook, Teclado, Mouse]
         *        posição 0  posição 1  posição 2
         * 
         * O Mouse "deslizou" pra direita pra dar espaço pro Teclado
         */
        
        // Vamos ver como ficou
        System.out.println("\nLista depois de adicionar os 3 produtos:");
        for (int i = 0; i < listaProdutos.size(); i++) {
            System.out.println("Posição " + i + ": " + listaProdutos.get(i));
        }
        System.out.println();
        
        // Agora vamos REMOVER o produto da posição 1 (o Teclado)
        Produto produtoRemovido = listaProdutos.remove(1);
        System.out.println("Produto que tiramos da posição 1: " + produtoRemovido);
        
        /*
         * Teclado saiu fora! Lista agora:
         * [Notebook, Mouse]
         * posição 0  posição 1
         * 
         * O Mouse "voltou" pra posição 1
         */
        
        System.out.println("Lista depois de tirar o Teclado:");
        for (int i = 0; i < listaProdutos.size(); i++) {
            System.out.println("Posição " + i + ": " + listaProdutos.get(i));
        }
        System.out.println();
        
        // Vamos adicionar mais produtos: um no começo e um no final
        Produto produto4 = new Produto("Monitor", 800.00);
        Produto produto5 = new Produto("Webcam", 200.00);
        
        System.out.println("Colocando Monitor no começo...");
        listaProdutos.addFirst(produto4);
        
        System.out.println("Colocando Webcam no final...");
        listaProdutos.addLast(produto5);
        
        /*
         * Lista final:
         * [Monitor, Notebook, Mouse, Webcam]
         * posição 0  posição 1  posição 2  posição 3
         */
        
        System.out.println("\nLista final:");
        for (int i = 0; i < listaProdutos.size(); i++) {
            System.out.println("Posição " + i + ": " + listaProdutos.get(i));
        }
        System.out.println("Total de produtos: " + listaProdutos.size());
        System.out.println();
    }
}

// ========== CLASSE PRINCIPAL ==========
public class Pratica01_EstruturaDados {
    /*
     * Método main = onde tudo começa
     * É tipo o "play" do programa
     */
    public static void main(String[] args) {
        System.out.println("CENTRO UNIVERSITÁRIO DE PATOS DE MINAS - UNIPAM");
        System.out.println("ESTRUTURA DE DADOS E ALGORITMOS");
        System.out.println("PRÁTICA 01 - Pilha, Fila e Lista Encadeada");
        System.out.println("=============================================");
        System.out.println();
        
        // Vamos rodar os 3 exercícios
        Exercicio1_Pilha.executar();
        Exercicio2_Fila.executar();
        Exercicio3_ListaEncadeada.executar();
        
        System.out.println("========== FIM! ==========");
        
        /*
         * RESUMÃO PRA VOCÊ NÃO ESQUECER:
         * 
         * 🥞 PILHA: Como pilha de panquecas
         *    - Sempre mexe no topo
         *    - Último que entra é o primeiro que sai
         *    - Bom pra: Ctrl+Z, histórico do navegador
         * 
         * 🚶‍♀️ FILA: Como fila do pão
         *    - Primeiro que chega é o primeiro atendido
         *    - Entra no final, sai no começo
         *    - Bom pra: impressora, processar tarefas em ordem
         * 
         * 🎵 LISTA: Como playlist
         *    - Flexível total! Adiciona/remove onde quiser
         *    - Acessa qualquer posição diretamente
         *    - Bom pra: quando você não sabe quantos itens vai ter
         * 
         * É isso aí! Cada uma tem seu rolê específico 😎
         */
    }
}