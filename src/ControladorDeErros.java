public class ControladorDeErros implements Cloneable {
    private int qtdMax, qtdErr = 0;

    public ControladorDeErros(int qtdMax) throws Exception {
        if (qtdMax < 0)
            throw new Exception("Qtd max inválida");
        this.qtdMax = qtdMax;
        // verifica se qtdMax fornecida n�o � positiva, lan�ando
        // uma excecçāo.
        // armazena qtdMax fornecida em this.qtdMax.
    }

    public void registreUmErro() throws Exception {
        if (this.qtdErr == this.qtdMax) {
            throw new Exception("Todos possiveis erros ja foram cometidos.");
        }
        this.qtdErr++;
        // verifica se this.qtdErr ja � igual a this.qtdMax,
        // lan�ando excecao em caso positivo ou
        // incrementando this.qtdErr em caso negativo
    }

    public boolean isAtingidoMaximoDeErros() {
        if (this.qtdErr == this.qtdMax)
            return true;
        return false;
        // returna true se this.qtdErr for igual a this.qtdMax,
        // ou ent�o false, caso contrario.
    }

    public String toString() {
        return this.qtdErr + "/" + this.qtdMax;
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

    public ControladorDeErros(ControladorDeErros c) throws Exception // construtor de c�pia
    {
        // copiar c.qtdMax e c.qtdErr, respectivamente em, this.qtdMax e this.qtdErr
    }

    public Object clone() {
        Object a = new Object();
        return a;

        // returnar uma c�pia de this
    }
}
