public class Banco {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setConta(111);
        c1.setDono("Erick");
        c1.abrirConta("CC");
        c1.depositar(300);
        c1.sacar(349);

        Conta c2 = new Conta();
        c2.setConta(222);
        c2.setDono("Tayna");
        c2.abrirConta("CP");
        c2.depositar(500);
        c2.sacar(100);

        c1.estadoAtual();
        System.out.println("============================");
        c2.estadoAtual();
    }
}
