/*public class Conta {

    public int conta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;

    public void setConta(int c) {
        this.conta = c;
    }
    public int getConta() {
        return conta;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return tipo;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return dono;
    }
    public void setSaldo(int s){
        this.saldo = s;
    }
    public int getSaldo(){
        return saldo;
    }
    public void setStatus(boolean sl){
        this.status = sl;
    }
    public boolean getStatus(){
        return status;
    }
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if(t.equals("CC")){
            setSaldo(50);
        } else if(t.equals("CP")){
            setSaldo(150);
        }
    }
    public void fecharConta(int s){
        if (saldo > 0){
            System.out.println("Conta com dinheiro");
        } else if (saldo < 0 ){
            System.out.println("Conta com saldo negativo");
        } else {
            status = false;
        }

    }
    public void depositar(int s){
        if (status == true){
            saldo = saldo + s;
        } else if (status == false){
            System.out.println("Conta não aberta");
        }
    }
    public void sacar(int s){
        if (status == true){
            if(saldo > 0){
                saldo = saldo - s;
            } else {
                System.out.println("Conta com saldo negativo");
            }
        } else if (status == false){
            System.out.println("Conta não aberta");
        }
    }
    public void pagarMensalidade(){
        int mensalidade = 0;
        if (tipo.equals("CC")){
            mensalidade = 12;
        } else if (tipo.equals("CP")){
            mensalidade = 20;
        }
        if (status == true){
            if(saldo > 0){
                saldo = saldo - mensalidade;
            } else {
                System.out.println("Conta com saldo negativo");
            }
        } else {
            System.out.println("Conta não aberta");
        }
    }
}*/
