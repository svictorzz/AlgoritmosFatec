package filas;


public class Fila{
    private Pessoa[] dados;
    private int primeiro;
    private int ultimo;
    private int tamanho;

    public static final int CAP_MIN = 4;

    public Fila(){
        dados = new Pessoa[CAP_MIN];
        primeiro = 0;
        ultimo = -1;
        tamanho = 0;
    }

    public Fila(int capacidade){
        dados = new Pessoa[capacidade];
        primeiro = 0;
        ultimo = -1;
        tamanho = 0;
    }

    public Pessoa [] getDados(){
        return dados;
    }

    int proximaPosicao(int posicao){
        return (posicao + 1) % dados.length;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public boolean estaCheia(){
        return tamanho == dados.length;
    }

    public boolean enfileira(Pessoa p){
        if(!estaCheia()){
            ultimo = proximaPosicao(ultimo); //atualiza a ultima posição
            dados[ultimo] = p; // atribui a pessoa a ultima posição no vetor
            tamanho++; //incrementa a variavel tamanho para depois usar ela para testar se o vetor está cheio ou vazio.
            return true;
        }
        return false;
    }

    public Pessoa desenfileira(){
        if(estaVazia()) return null;
        Pessoa p = dados[primeiro];
        dados[primeiro] = null;
        primeiro = proximaPosicao(primeiro);
        tamanho--;
        return p; //retorna a referencia da Pessoa
    }


    // 15. exclui os numeros pares sem alterar o resto
    public void limpaFila() {
        int j = 0; // Índice para controlar a posição dos elementos na fila limpa

        for (int i = 0; i < tamanho; i++) {
            // Se o elemento não for par, mantê-lo na fila
            if (dados[i].getAnoNascimento() % 2 != 0) {
                // Se j for diferente de i, significa que encontramos um número ímpar,
                // então precisamos mover esse número para a posição j.
                if (j != i) {
                    dados[j] = dados[i];
                }
                j++; // Incrementar o índice j
            }
        }

        // Preencher o restante da fila com null (opcional)
        for (int i = j; i < tamanho; i++) {
            dados[i] = null;
        }

        // Atualizar o índice último
        ultimo = j - 1;
        // Atualizar o tamanho da fila
        tamanho = j;
    }

    // 16. Fura fila

    public void furaFila(int novoElemento) {
        // Verifica se a fila está cheia
        if (estaCheia()) {
            System.out.println("Fila cheia. Não é possível inserir um novo elemento.");
            return;
        }

        // Calcula a nova posição do primeiro elemento
        int novaPosicaoPrimeiro = (primeiro - 1 + dados.length) % dados.length;

        // Move todos os elementos para a direita para abrir espaço para o novo elemento
        for (int i = ultimo; i != primeiro; i = (i - 1 + dados.length) % dados.length) {
            dados[(i + 1) % dados.length] = dados[i];
        }

        // Insere o novo elemento na primeira posição
        dados[novaPosicaoPrimeiro] = novoElemento;

        // Atualiza o índice do primeiro elemento
        primeiro = novaPosicaoPrimeiro;

        // Incrementa o tamanho da fila
        tamanho++;
    }

    // 17. intercalar vetores
    public static Pessoa[] intercalar(Pessoa[] v1, Pessoa[] v2) {
        int tamanho1 = v1.length;
        int tamanho2 = v2.length;
        Pessoa[] intercalado = new Pessoa[tamanho1 + tamanho2];
        int i = 0, j = 0, k = 0;

        while (i < tamanho1 && j < tamanho2) {
            intercalado[k++] = v1[i++];
            intercalado[k++] = v2[j++];
        }

        while (i < tamanho1) {
            intercalado[k++] = v1[i++];
        }

        while (j < tamanho2) {
            intercalado[k++] = v2[j++];
        }

        return intercalado;
    }

    // 19. Verificar posicao de um valor
    public int verificarPosicao(int valor) {
        // Verifica se a fila está vazia
        if (estaVazia()) {
            System.out.println("A fila está vazia.");
            return -1;
        }

        // Percorre os elementos da fila
        for (int i = 0; i < tamanho; i++) {
            // Verifica se o valor é igual ao elemento na posição i da fila
            if (dados[(primeiro + i) % dados.length] == valor) {
                // Se encontrado, retorna a posição do valor na fila
                return i;
            }
        }

        // Se o valor não foi encontrado na fila, retorna -1
        System.out.println("O valor não foi encontrado na fila.");
        return -1;
    }

    //20. Maior elemento
    public int encontrarMaiorElemento() {
        // Verifica se a fila está vazia
        if (estaVazia()) {
            System.out.println("A fila está vazia.");
            return -1; // Retorna um valor inválido para indicar que não há elementos na fila
        }

        // Inicializa o maior elemento como o primeiro elemento da fila
        int maiorElemento = dados[primeiro];

        // Percorre os elementos da fila
        for (int i = 0; i < tamanho; i++) {
            // Verifica se o elemento na posição i da fila é maior que o maiorElemento atual
            if (dados[(primeiro + i) % dados.length] > maiorElemento) {
                // Se for maior, atualiza o valor do maiorElemento
                maiorElemento = dados[(primeiro + i) % dados.length];
            }
        }

        // Retorna o maior elemento encontrado na fila
        return maiorElemento;
    }

    //21. Menor elemento
    public int encontrarMenorElemento(){
        if (estaVazia()){
            System.out.println("Fila esta vazia.");
            return -1;
        }

        int menorElemento = dados[primeiro];
        for (int i = 0; i < tamanho; i++) {
            if (dados[(primeiro + i)% dados.length] < menorElemento){
                menorElemento = dados[(primeiro + i) % dados.length];
            }
        }
        return menorElemento;
    }

    //22. Encontrar o maior e colocar no final da fila

    public void acharMaiorEInserirNoFinal() {
        // Verifica se a fila está vazia
        if (estaVazia()) {
            System.out.println("A fila está vazia. Não há elementos para serem movidos para o final.");
            return;
        }

        // Encontra o maior elemento presente na fila
        int maiorElemento = encontrarMaiorElemento();

        // Remove o maior elemento de sua posição original na fila
        int posicaoMaiorElemento = -1;
        for (int i = 0; i < tamanho; i++) {
            if (dados[(primeiro + i) % dados.length] == maiorElemento) {
                posicaoMaiorElemento = i;
                break;
            }
        }

        // Movimenta os elementos antes do maior elemento para o final da fila
        for (int i = 0; i < posicaoMaiorElemento; i++) {
            int elemento = dados[primeiro];
            desenfileira();
            enfileira(elemento);
        }
    }

    //23. Encontrar o menor e colocar no inicio da fila
    public void acharMenorEInserirNoInicio() {
        // Verifica se a fila está vazia
        if (estaVazia()) {
            System.out.println("A fila está vazia. Não há elementos para serem movidos para o início.");
            return;
        }

        // Encontra o menor elemento presente na fila
        int menorElemento = encontrarMenorElemento();

        // Remove o menor elemento de sua posição original na fila
        int posicaoMenorElemento = -1;
        for (int i = 0; i < tamanho; i++) {
            if (dados[(primeiro + i) % dados.length] == menorElemento) {
                posicaoMenorElemento = i;
                break;
            }
        }

        // Movimenta os elementos após o menor elemento para o início da fila
        for (int i = 0; i < posicaoMenorElemento; i++) {
            int elemento = dados[(primeiro + tamanho - 1 - i) % dados.length];
            desenfileira();
            enfileira(elemento);
        }
    }

    @Override
    public String toString(){
        String s = "";
        if(estaVazia()){
            return "fila vazia";
        }
        int i = primeiro;
        do{
            s = s + dados[i] + " - ";
            i = proximaPosicao(i);
        } while(i != proximaPosicao(ultimo));
        return s;
    }

    public String toStringVetor(){
        String s = "";
        for(int i = 0; i < dados.length; i++){
            if(dados[i] ==  null){
                s+= " ____ ";
            }
            else{
                s += " " + dados[i].getAnoNascimento() + " ";
            }
        }
        return s;
    }

}