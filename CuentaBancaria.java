//Vadhir Santiago Jaime Salamanca 3C DSM (27/05/2025)
public class CuentaBancaria {

    private String titular;
    private double saldo;


    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //Metodo para retirar dinero
    public boolean retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            return true;
        }
        System.out.println("Saldo insuficiente");
        return false;

    }

    //Metodo para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Bronx");

        System.out.println("Retirar 1000");
        cuenta.depositar(1000);
        System.out.println( + cuenta.getSaldo());

        System.out.println("Retirar 200");
        cuenta.retirar(200);
        System.out.println( + cuenta.getSaldo());

        System.out.println("Retirar 10000");
        cuenta.retirar(10000);
        System.out.println( + cuenta.getSaldo());
        

    }
}
