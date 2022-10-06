public class ControladorDeErros implements Cloneable {
    private int qtdMax, qtdErr = 0;

    public ControladorDeErros(int qtdMax) throws Exception {
        if (qtdMax < 0)
            throw new Exception("Qtd max i  nválida");
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
        // // verificar se this e obj possuem o mesmo conte�do, retornando
        // // true no caso afirmativo ou false no caso negativo
        if (this == obj) {
            return true;
        }
        ControladorDeErros cControler = (ControladorDeErros) obj;

        if (this.qtdMax == cControler.qtdMax) {
            return true;

        }
        if (this.qtdErr == cControler.qtdErr) {
            return true;
        }
        return false;
        // this.qtdMax == cControler.qtdMax && this.qtdErr == cControler.qtdErr;
    }

    public int hashCode() {
        int ret = 9999;

        ret = 11 * ret + qtdErr;
        ret = 11 * ret + qtdMax;

        if (ret < 0)
            ret = -ret;
        return ret;
        // calcular e retornar o hashcode de this
    }

    public ControladorDeErros(ControladorDeErros ControladorDeErros)
            throws Exception {
        if (ControladorDeErros != null) {
            this.qtdErr = ControladorDeErros.qtdErr;
            this.qtdMax = ControladorDeErros.qtdMax;
        }
        throw new Exception("Controlador já é NULO!!!");
    }

    public Object clone() {
        ControladorDeErros cControler = null;
        try {
            cControler = new ControladorDeErros(this.qtdMax);
        } catch (Exception erro) {
            System.out.println("erro006");
        }
        return cControler;
        // criar uma c�pia do this com o construtor de c�pia e retornar
    }
}
