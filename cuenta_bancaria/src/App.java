public class App {
    public static void main(String[] args) throws Exception {
        
        CuentaBancaria cuentaBancaria = new CuentaBancaria();


        cuentaBancaria.depositar(1000);
        cuentaBancaria.retirar(200);
        cuentaBancaria.retirar(10000);


    }
}