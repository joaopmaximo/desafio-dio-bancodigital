public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco");

        Cliente cliente1 = new Cliente("Marcos");
        Cliente cliente2 = new Cliente("Nilton");

        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente2);
        
        banco.addConta(cc);
        banco.addConta(cp);

        System.out.println(banco.getContas());

        cc.depositar(100);
        cc.transferir(cp, 30);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
