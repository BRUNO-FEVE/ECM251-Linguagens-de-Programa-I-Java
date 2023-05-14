public class Teste {
    public static void main(String[] args) {
        Caixa caixaUm = new Caixa("primeiro", 2, 0.7, "Bruno");
        Caixa caixaDois = new Caixa("primeiro", 2, 1.7, "Jofief");

        System.out.println(caixaUm.getDono());

        Deposito deposito = new Deposito();

        deposito.addCaixas(caixaUm);
        deposito.addCaixas(caixaDois);

        //System.out.println(deposito.getCaixas() + "\n\n");

        //deposito.changeInfo("segundo", 0, 0, "Bruno");

        //System.out.println(deposito.getCaixas());
        
        System.out.println(deposito.weigthAbove(1));
        
        //System.out.println(deposito.getIndex("Bruno"));

        //deposito.removeCaixa(deposito.getCaixa("Jofief"));
        //System.out.println(deposito.getCaixas());
        //System.out.println(deposito.getCaixa(null));
    }
}
