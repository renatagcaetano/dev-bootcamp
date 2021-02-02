package br.com.bootcamp.exer5;

public class Exer5 {

    public static void main(String[] args) {
//        Pessoa pessoa = new Empregado("Renata", "123");
//        double valor1 = ((Empregado)pessoa).calculaValorTotalSalario();
//        System.out.println(valor1);

        Empregado empregado = new Empregado("Renata",
                                            "123",
                                            0,
                                            0
        );
        double valor2 = empregado.calculaValorTotalSalario();
        empregado.setNome("Renata Caetano");
        System.out.println(empregado.getNome());
        System.out.println(valor2);
    }

}
