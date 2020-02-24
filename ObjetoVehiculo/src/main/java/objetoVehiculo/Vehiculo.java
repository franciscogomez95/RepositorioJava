package objetoVehiculo;

public class Vehiculo {
    
    protected String marca;
    protected String cilindraje;
    protected String modelo;
    protected String placa;
    protected String color;

    public Vehiculo() {
    }
    
    public Vehiculo(String marca, String cilindraje, String modelo, String placa, String color) {
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
