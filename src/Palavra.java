public class Palavra implements Comparable<Palavra> {
    private String texto;

    public Palavra(String texto) throws Exception {
        if (texto == null || texto == "") {
            throw new Exception("Inválido");
        }
        this.texto = texto;
        // verifica se o texto recebido � nulo ou ent�o vazio,
        // ou seja, sem nenhum caractere, lan�ando exce��o.
        // armazena o texto recebido em this.texto.
    }

    public int getQuantidade(char letra) {
        int total = 0;
        for (int i = 0; i < this.texto.length(); i++) {
            char aux = this.texto.charAt(i);
            if (aux == letra)
                total++;
        }
        return total;
        // percorre o String this.texto, conta e retorna
        // quantas letras existem nele iguais a letra fornecida
    }

    public int getPosicaoDaIezimaOcorrencia(int i, char letra) throws Exception {

        if (i == 0) {
            return this.texto.indexOf(letra);
        }
        ;
        if (i == 1) {
            return this.texto.indexOf(letra);
        }
        ;
        if (i == 2) {

        }
        for (int j = 0; j < i; j++)
            ;
        // se i==0, retorna a posicao em que ocorre a primeira
        // aparicao de letra fornecida em this.texto;
        // se i==1, retorna a posicao em que ocorre a segunda
        // aparicao de letra fornecida em this.texto;
        // se i==2, retorna a posicao em que ocorre a terceira
        // aparicao de letra fornecida em this.texto;
        // e assim por diante.
        // lan�ar excecao caso nao encontre em this.texto
        // a I�zima apari��o da letra fornecida.
        return 1;
    }

    public int getTamanho() {
        return this.texto.length();
    }

    public String toString() {
        return this.texto;
    }

    public boolean equals(Object obj) {
        return false;
        // verificar se this e obj possuem o mesmo conte�do, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode() {
        return 1;

        // calcular e retornar o hashcode de this
    }

    public int compareTo(Palavra palavra) {
        return this.texto.compareTo(palavra.texto);
    }
}
