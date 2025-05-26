public class Compu {
    
    private String marca;
    private String modelo;
    private boolean encendida;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public boolean isEncendida() {
        return encendida;
    }
    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

        
    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("Encendido");
        }
        else {
            System.out.println("Ya esta encendido");
        }
    }
    
    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("Apagado");
        }
        else {
            System.out.println("Ya esta apagado");
        }
    }



}