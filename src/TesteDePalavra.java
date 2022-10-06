class TesteDePalavra {
  public static void main(String[] args) {
    System.out.println("\n\n====================");
    System.out.println("TESTES DO PROFESSOR");
    System.out.println("====================\n\n");
    // teste 1
    try {
      Palavra p1 = new Palavra(null);
      System.out.println("Deu certo construir palavra null");

    } catch (Exception erro) {
      System.err.println("Deu erro construir palavra null");
    }
    // teste 2
    try {
      Palavra p2 = new Palavra("");
      System.out.println("Deu certo construir palavra \"\"");
    } catch (Exception erro) {
      System.err.println("Deu erro construir palavra \"\"");
    }
    // teste 3
    Palavra p3 = null;
    try {
      p3 = new Palavra("PARALELEPIPEDO");
      System.out.println("Deu certo construir palavra \"PARALELEPIPEDO\"");
    } catch (Exception erro) {
      System.err.println("Deu erro construir palavra \"PARALELEPIPEDO\"");
    }
    // teste 4
    Palavra p4 = null;
    try {
      p4 = new Palavra("PARALELEPIPEDO");
      System.out.println("Deu certo construir palavra \"PARALELEPIPEDO\"");
    } catch (Exception erro) {
      System.err.println("Deu erro construir palavra \"PARALELEPIPEDO\"");
    }
    // teste 5
    Palavra p5 = null;
    try {
      p5 = new Palavra("LAPAROSCOPIA");
      System.out.println("Deu certo construir palavra \"LAPAROSCOPIA\"");
    } catch (Exception erro) {
      System.err.println("Deu erro construir palavra \"LAPAROSCOPIA\"");
    }
    // teste 6
    System.out.println("\"PARALELEPIPEDO\" tem " +
        p3.getQuantidade('W') +
        " letras iguais a 'W'");
    // teste 7
    System.out.println("\"PARALELEPIPEDO\" tem " +
        p3.getQuantidade('E') +
        " letras iguais a 'E'");
    // teste 8
    try {
      System.out.println("A 0a letra 'E' de \"PARALELEPIPEDO\" fica na posicao " +
          p3.getPosicaoDaIezimaOcorrencia(-1, 'E'));
      System.err.println("Achamos a 0a aparicao da letra 'E' em 'PARALELEPIPEDO' E NAO ERA PARA ACHARMOS");
    } catch (Exception erro) {
      System.out
          .println("Deu erro ao achar a 0a aparicao da letra 'E' em PARALELEPIPEDO E ERA PARA DAR ERRO MESMO");
    }
    // teste 9
    try {
      System.out.println("A 1a letra 'E' de \"PARALELEPIPEDO\" fica na posicao " +
          p3.getPosicaoDaIezimaOcorrencia(-1, 'E'));
      System.out.println("Achamos a 1a aparicao da letra 'E' em PARALELEPIPEDO ");
    } catch (Exception erro) {
      System.err.println("Deu erro ao achar a 1a aparicao da letra 'E' em \"PARALELEPIPEDO\"");
    }
    // teste 10
    try {
      System.out.println("A 1a letra 'E' de \"PARALELEPIPEDO\" fica na posicao " +
          p3.getPosicaoDaIezimaOcorrencia(0, 'E'));
      System.out.println("Achamos a 1a aparicao da letra 'E' em \"PARALELEPIPEDO\"");
    } catch (Exception erro) {
      System.err.println("Deu erro ao achar a 1a aparicao da letra 'E' em \"PARALELEPIPEDO\"");
    }
    // teste 11
    try {
      System.out.println("A 2a letra 'E' de \"PARALELEPIPEDO\" fica na posicao " +
          p3.getPosicaoDaIezimaOcorrencia(1, 'E'));
      System.out.println("Achamos a 2a aparicao da letra 'E' em \"PARALELEPIPEDO\"");
    } catch (Exception erro) {
      System.err.println("Deu erro ao achar a 2a aparicao da letra 'E' em \"PARALELEPIPEDO\"");
    }
    // teste 12
    try {
      System.out.println("A 3a letra 'E' de \"PARALELEPIPEDO\" fica na posicao " +
          p3.getPosicaoDaIezimaOcorrencia(2, 'E'));
      System.out.println("Achamos a 3a aparicao da letra 'E' em \"PARALELEPIPEDO\"");
    } catch (Exception erro) {
      System.err.println("Deu erro ao achar a 3a aparicao da letra 'E' em \"PARALELEPIPEDO\"");
    }
    // teste 13
    try {
      System.out.println("A 4a letra 'E' de \"PARALELEPIPEDO\" fica na posicao " +
          p3.getPosicaoDaIezimaOcorrencia(3, 'E'));
      System.err.println("Achamos a 4a aparicao da letra 'E' em \"PARALELEPIPEDO\" E NAO ERA PARA ACHARMOS");
    } catch (Exception erro) {
      System.out
          .println("Deu erro ao achar a 4a aparicao da letra 'E' em \"PARALELEPIPEDO\" E ERA PARA DAR ERRO MESMO");

    }
    try {
      System.out.println("A 5a letra 'E' de \"PARALELEPIPEDO\" fica na posicao " +
          p3.getPosicaoDaIezimaOcorrencia(4, 'E'));
      System.err.println("Achamos a 5a aparicao da letra 'E' em \"PARALELEPIPEDO\" E NAO ERA PARA ACHARMOS");
    } catch (Exception erro) {
      System.out
          .println("Deu erro ao achar a 5a aparicao da letra 'E' em \"PARALELEPIPEDO\" E ERA PARA DAR ERRO MESMO");
    }
    // teste 14
    System.out.println("\"PARALELEPIPEDO\" tem " + p3.getTamanho() + " letras");
    // teste 15
    System.out.println(p3 + "eh a palavra que estamos testando");
    // teste 16
    System.out.println("Eh " + p3.equals(null) + " que \"PARALELEPIPEDO\" eh igual (pelo equals) a null");
    // teste 17
    System.out.println("Eh " + p3.equals(p3) + " que \"PARALELEPIPEDO\" eh igual (pelo equals) a si mesmo");
    // teste 18
    System.out.println("Eh " + p3.equals("PARALELEPIPEDO")
        + " que \"PARALELEPIPEDO\" eh igual (pelo equals) ao String \"PARALELEPIPEDO\"");
    // teste 19
    System.out.println("Eh " + p3.equals(p4) + " que \"PARALELEPIPEDO\" eh igual (pelo equals) a \"PARALELEPIPEDO\"");
    // teste 20
    System.out.println("Eh " + p3.equals(p5) + " que \"PARALELEPIPEDO\" eh igual(pelo equals) a \"LAPAROSCOPIA\"");
    // teste 21
    System.out.println("Eh " + (p3.hashCode() == p4.hashCode())
        + " que o hashCode de um \"PARALELEPIPEDO\" eh igual ao hashCode de outro \"PARALELEPIPEDO\"");
    // teste 22
    System.out.println("Eh " + (p3.hashCode() == p5.hashCode())
        + " que o hashCode de \"PARALELEPIPEDO\" eh igual ao hashCode de \"LAPAROSCOPIA\"");
    // teste 23
    System.out.println(
        "Um \"PARALELEPIPEDO\" comparado (com compareTo) com outro \"PARALELEPIPEDO\" deu " + p3.compareTo(p4));
    // teste 24
    System.out.println("\"PARALELEPIPEDO\" comparado (com compareTo) com \"LAPAROSCOPIA\" deu " + p3.compareTo(p5));
    // teste 25
    System.out.println("\"LAPAROSCOPIA\" comparado (com compareTo) com \"PARALELEPIPEDO\" deu " + p5.compareTo(p3));

    System.out.println("\n\n====================");
    System.out.println("TESTES DO NOSSO GRUPO");
    System.out.println("====================\n\n");

    // teste 26
    try {
      Tracinhos t1 = new Tracinhos(5);
      System.out.println("Deu certo construir 5 tracinhos " + t1 + "e era pra dar certo");
    } catch (Exception erro) {
      System.err.println("Deu erro construir 5 tracinhos e não era pra dar erro");
    }
    // teste 27
    try {
      Tracinhos t2 = new Tracinhos(0);
      System.out.println("Deu certo construir 0 tracinhos " + t2 + "e não era pra dar certo");
    } catch (Exception erro) {
      System.err.println("Deu erro construir 0 tracinhos e era pra dar erro");
    }
    // teste 28
    try {
      Tracinhos t3 = new Tracinhos(-1);
      System.out.println("Deu certo construir -1 tracinhos " + t3 + "e não era pra dar certo");
    } catch (Exception erro) {
      System.err.println("Deu erro construir -1 tracinhos e era pra dar erro");
    }
    // teste 29
    try {
      Tracinhos t4 = new Tracinhos(5);
      t4.revele(1, 'A');
      System.out.println("Deu certo colocar a letra A na posiçao 1 de t4 = " + t4 + "e era pra dar certo");
    } catch (Exception erro) {
      System.err.println("Deu erro colocar a letra A na posiçao 1 de t4 e não era pra dar erro");
    }
    // teste 30
    try {
      Tracinhos t5 = new Tracinhos(8);
      t5.revele(9, 'A');
      System.out.println("Deu certo colocar a letra B na posiçao 9 de t5" + t5 + "e não era pra dar certo");
    } catch (Exception erro) {
      System.err.println("Deu erro colocar a letra B na posiçao 9 de t5 e era pra dar erro");
    }
    // teste 31
    try {
      Tracinhos t6 = new Tracinhos(8);
      t6.revele(-1, 'A');
      System.out.println("Deu certo colocar a letra C na posiçao -1 de t6" + t6 + "e não era pra dar certo");
    } catch (Exception erro) {
      System.err.println("Deu erro colocar a letra C na posiçao -1 de t6 e era pra dar erro");
    }
    // teste 32
    try {
      Tracinhos t7 = new Tracinhos(6);
      System.out.println("É " + t7.isAindaComTracinhos() + " que t7 ainda tem tracinhos e era pra ser true");
    } catch (Exception erro) {
      System.err.println("Deu erro no teste 32 e não era pra dar");
    }
    // teste 33
    try {
      Tracinhos t8 = new Tracinhos(1);
      t8.revele(0, 'a');
      System.out.println("É " + t8.isAindaComTracinhos() + " que t8 ainda tem tracinhos e era pra ser false");
    } catch (Exception erro) {
      System.err.println("Deu erro no teste 33 e não era pra dar");
    }
    // teste 34

    try {
      Tracinhos t9 = new Tracinhos(1);
      Tracinhos t10 = new Tracinhos(1);
      System.out.println("Eh " + t9.equals(t10) + " que t9 eh igual t10 (pelo equals) e era pra ser true");
      System.out.println("Eh " + t9.equals(t10) + " que t9 eh igual t10 (pelo equals) e era pra ser true");

    } catch (Exception erro) {
      System.err.println("Deu erro no teste 34 e não era pra dar");
    }
    // teste 35
    try {
      Tracinhos t11 = new Tracinhos(1);
      Tracinhos t12 = new Tracinhos(2);
      System.out.println(
          "Eh " + (t11.hashCode() == t11.hashCode()) + " que t11 eh igual t11 (pelo hashCode) e era pra ser true");
      System.out.println(
          "Eh " + (t11.hashCode() == t12.hashCode()) + " que t11 eh igual t12 (pelo hashCode) e era pra ser false");

    } catch (Exception erro) {
      System.err.println("Deu erro no teste 35 e não era pra dar");
    }

    System.out.println("FIM TRACINHOS");

    // teste 36
    try {
      ControladorDeLetrasJaDigitadas cld1 = new ControladorDeLetrasJaDigitadas();
      System.out.println("Deu certo construir o ControladorDeLetrasJaDigitadas e era pra dar certo");
    } catch (Exception erro) {
      System.err.println("Deu erro construir o ControladorDeLetrasJaDigitadas e não era pra dar erro");
    }
    // teste 38

    ControladorDeLetrasJaDigitadas cld2 = new ControladorDeLetrasJaDigitadas();
    System.out.println("Eh " + cld2.isJaDigitada('a')
        + " que deu certo usar o metodo isJaDigitada antes de registrar uma letra e era pra ser false");
    // teste 39

    ControladorDeLetrasJaDigitadas cld3 = new ControladorDeLetrasJaDigitadas();
    try {
      cld3.registre('a');
      System.out.println("Eh " + cld3.isJaDigitada('a')
          + " que deu certo usar o metodo isJaDigitada(a) depois de registrar a letra(a) e era pra ser true");

    } catch (Exception erro) {
      System.err.println("Deu erro usar o metodo isJaDigitada antes de registrar uma letra e era pra dar erro");
    }

    ControladorDeLetrasJaDigitadas cld4 = new ControladorDeLetrasJaDigitadas();
    ControladorDeLetrasJaDigitadas cld5 = new ControladorDeLetrasJaDigitadas();

    System.out.println("Eh " + (cld4.hashCode() == cld5.hashCode())
        + " que o hashCode de um de cld4 eh igual ao hashCode de cld5 ");

    System.out.println("Eh " + (cld4.hashCode() == cld4.hashCode())
        + " que o hashCode de um de cld4 eh igual ao hashCode de cld4 ");

    System.out.println("Eh " + (cld4.hashCode() == cld4.hashCode())
        + " que o hashCode de um de cld4 eh igual ao hashCode de cld4 ");

    try {
      cld4.registre('a');
      System.out.println("O clone do objeto cld4 que continha apenas a letra 'a, ' é igual a '" + cld4.clone() + "'");
    } catch (Exception erro) {
      System.err.println("Deu erro usar o metodo clone");
    }

  }
}