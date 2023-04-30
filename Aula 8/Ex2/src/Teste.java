public class Teste {
    public static void main(String[] args) {
        Desempregado desempregado = new Desempregado("João", "Silva", 123456789, 1000.0);
        Empregado empregado = new Empregado("Maria", "Souza", 987654321, 2000.0);
        Horista horista = new Horista("José", "Santos", 123456789, 10.0, 160);
        Mensalista mensalista = new Mensalista("Ana", "Oliveira", 987654321, 3000.0);
        Tarefeiro tarefeiro = new Tarefeiro("Carlos", "Pereira", 123456789, 0.0, new String[] {"100", "200", "300"});

        PessoaFisica pessoas = new PessoaFisica();
        System.out.println(pessoas.dados());
        /* 
        System.out.println(desempregado.dados());
        System.out.println(empregado.dados());
        System.out.println(horista.dados());
        System.out.println(mensalista.dados());
        System.out.println(tarefeiro.dados());
        */
    }
}
