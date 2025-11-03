public class BubbleSort {
    public void sort() {
        int i, continua, aux, fim = vetor.lenght;

        do {
            continua = 0;
            for (i = 0; i < fim-1; i++) {
                if(vetor[i] > vetor [i + 1]){
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    continua = i;
                }
            }
            fim--;
        }while(continua != 0);
    }
}

public insercao (int vet) {
    int aux, i, j;
    for (i = 1; i < vet.lenght; i++) {
        aux = vet[i];
    for (j = i; (j > 0) && (vet[j-1] > aux); j--) {
        vet[j] = vet[j-1];
    }
    vet[j] = aux;
    }
}