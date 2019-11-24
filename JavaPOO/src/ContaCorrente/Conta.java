package ContaCorrente;
public class Conta {
    //Atributos
    public int numConta;
    private String dono;
    public double saldo;
    private int operacoes;

    //Método para mostrar o extrato
    public void extrato(){
        System.out.println("Extrato Atual");
        System.out.println("Conta: "+ this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Operações: " + this.getOperacoes());
        System.out.println("------------------------");

    }

    //Métodos personalizados
    public double sacar(double v) {
        if(this.getSaldo()>= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque de "+ v +" reais realizado com sucesso da conta de " + this.getDono());
            separar();
            this.setOperacoes(this.getOperacoes()+1);
        }else{
            System.out.println("Saldo insuficiente para saque");
        }
        return v;
    }

    public void depositar(double v) {
        this.setSaldo(this.getSaldo() + v);
        System.out.println("Deposito de " + v + " reais realizado com sucesso na conta de " + this.getDono());
        separar();
        this.setOperacoes(this.getOperacoes()+1);
    }

    public void transferir(Conta outra, double v) {
        if(saldo > 0){
            this.sacar(v);
            outra.depositar(v);
            System.out.println("Tranferencia realizada com sucesso");
            separar();
        } else {
            System.out.println("Não foi possível transferir");
        }
    }

    public void saldo(){
        this.setSaldo(this.getSaldo());
        System.out.println("Consulta de saldo realizada com sucesso, seu saldo é de: " + saldo +" reais");
    }

    //Método para separar as informações
    public void separar(){
        System.out.println("------------------------");
    }

    //Métodos especiais
    public Conta(String dono, int numConta, double saldo) {
        this. dono = dono;
        this. numConta = numConta;
        this.saldo = saldo;
        this.operacoes=0;
    }

    //Getters e Setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double v) {
        this.saldo = v;
    }

    public int getOperacoes() {
        return operacoes;
    }

    public void setOperacoes(int op) {
        this.operacoes = op;
    }
}
