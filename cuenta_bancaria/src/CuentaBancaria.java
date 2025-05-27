public class CuentaBancaria {
    
    private String titular;
    private double saldo;


 public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    

    
    public void depositar(double monto){
        if(monto > 0){
            saldo = monto + saldo;
            System.out.println("Se ha depositado el monto de " + monto + " el saldo total es " + saldo);
        }
    }

   
    public boolean retirar(double monto){
        if(monto > 0 && saldo >= monto){
            saldo = saldo - monto;
            System.out.println("Se ha retirado el monto de " + monto + " el saldo totales " + saldo);
            return true;
        }else{
            System.out.println("No se puede retirar el monto indicado " + monto + "\n saldo insuficiente: " + saldo);
            return false;
        }

    }




}