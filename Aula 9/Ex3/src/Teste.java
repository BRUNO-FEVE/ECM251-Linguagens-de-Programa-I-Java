public class Teste {
    public static void main(String[] args) {
        BlocoDeNotas blocoDeNotas = new BlocoDeNotas();
        blocoDeNotas.insiraUmaNota("OLAAA");
        blocoDeNotas.insiraUmaNota("oeofjefj");
        blocoDeNotas.insiraUmaNota("bbhbhbh");

        System.out.println(blocoDeNotas.getBlocoDeNotas());

        //blocoDeNotas.removaUmaNotaPorIndex(0);
        //blocoDeNotas.removaUmaNotaPorString("OLAAA");
        //blocoDeNotas.altereUmaNotaPorIndex(0, "EAIII");
        //blocoDeNotas.altereUmaNotaPorString("OLAAA", "eaiii");
        //blocoDeNotas.altereUmaNotaPorString("OLAAA", "eaiii");

    }
}
