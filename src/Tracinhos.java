public class Tracinhos implements Cloneable {
    private char texto[];

    public Tracinhos(int qtd) throws Exception {

        if (qtd < 0)
            throw new Exception("Quantidade inválida");
        this.texto = new char[qtd];
        for (int i = 0; i < qtd; i++) {
            this.texto[i] = '_';
        }
    }

    public void revele(int posicao, char letra) throws Exception {
        if (posicao < 0 || posicao >= this.texto.length) {
            throw new Exception("Posição inválida");
        }

        this.texto[posicao] = letra;

        // verifica se posicao � negativa ou ent�o igual ou maior
        // do que this.texto.length, lan�ando uma exce��o.
        // armazena a letra fornecida na posicao tambem fornecida
        // do vetor this.texto
    }

    public boolean isAindaComTracinhos() {
        for (int i = 0; i < this.texto.length; i++) {
            if (this.texto[i] == '_') {
                return true;
            }
        }
        return false;
        // percorre o vetor de char this.texto e verifica
        // se o mesmo ainda contem algum underline ou se ja
        // foram todos substituidos por letras; retornar true
        // caso ainda reste algum underline, ou false caso
        // contrario
    }

    public String toString() {
        String string = "";
        for (int i = 0; i < this.texto.length; i++) {
            string += this.texto[i] + " ";
        }
        return string;
        // retorna um String com TODOS os caracteres que h�
        // no vetor this.texto, intercalados com espa�os em
        // branco
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;

        Tracinhos newTracinho = (Tracinhos) obj;

        for (int i = 0; i < this.texto.length; i++) {
            if (this.texto[i] != newTracinho.texto[i]) {
                return false;
            }
        }

        return true;

        // verificar se this e obj possuem o mesmo conte�do, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode() {
        return 1; // Implementar
    }

    public Tracinhos(Tracinhos t) throws Exception // construtor de c�pia
    {
        // intanciar this.texto um vetor com o mesmo tamanho de t.texto
        // e copilar o conte�do de t.texto para this.texto
    }

    public Object clone() {
        Object a = new Object();
        return a;
        // Retornar uma copia de this
    }
}
