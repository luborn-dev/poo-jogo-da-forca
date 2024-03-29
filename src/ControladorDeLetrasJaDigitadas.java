public class ControladorDeLetrasJaDigitadas implements Cloneable {
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas() {
        this.letrasJaDigitadas = "";
        // torna this.letrasJaDigitadas igual ao String vazio
    }

    public boolean isJaDigitada(char letra) {

        for (int i = 0; i < this.letrasJaDigitadas.length(); i++) {
            char c = this.letrasJaDigitadas.charAt(i);
            if (c == letra) {
                return true;
            }
        }
        return false;
        // percorrer o String this.letrasJaDigitadas e verificar se ele
        // possui a letra fornecida, retornando true em caso afirmativo
        // ou false em caso negativo
    }

    public void registre(char letra) throws Exception {

        if (this.isJaDigitada(letra))
            throw new Exception("Já digitada");

        letrasJaDigitadas += letra;

        // verifica se a letra fornecida ja foi digitada (pode usar
        // o método this.isJaDigitada, para isso), lancando uma exce��o
        // em caso afirmativo.
        // concatena a letra fornecida a this.letrasJaDigitadas.
    }

    public String toString() {
        String ret = "";

        for (int i = 0; i < this.letrasJaDigitadas.length(); i++) {
            ret += letrasJaDigitadas.charAt(i) + ", ";
        }
        return ret;
        // retorna um String com TODAS as letras presentes em
        // this.letrasJaDigitadas separadas por v�rgula (,).
    }

    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        ControladorDeLetrasJaDigitadas cContLetras = (ControladorDeLetrasJaDigitadas) obj;
        if (this.letrasJaDigitadas.equals(cContLetras.letrasJaDigitadas)) {
            return true;
        }
        return false;
        // // verificar se this e obj s�o iguais
    }

    public int hashCode() {
        int ret = 9999;

        ret = 11 * ret + letrasJaDigitadas.hashCode();

        if (ret < 0)
            ret = -ret;
        return ret;
        // calcular e retornar o hashcode de this
    }

    public ControladorDeLetrasJaDigitadas(
            ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas)
            throws Exception {
        if (controladorDeLetrasJaDigitadas != null) {
            this.letrasJaDigitadas = controladorDeLetrasJaDigitadas.letrasJaDigitadas;
        }
        throw new Exception("Controlador já é NULO!!!");
        // copiar c.letrasJaDigitadas em this.letrasJaDigitadas
    }

    public Object clone() {
        ControladorDeLetrasJaDigitadas cContLetras = null;
        try {
            cContLetras = new ControladorDeLetrasJaDigitadas();
            cContLetras = this;
        } catch (Exception erro) {
            System.out.println("erro005");
        }
        return cContLetras;
        // criar uma c�pia do this com o construtor de c�pia e retornar
    }
}
