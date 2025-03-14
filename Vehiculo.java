public class Vehiculo {

    String Placa;
    String NombreP;
    int Cilindraje;
    String Modelo;
    Boolean Disponible;

    
    public Vehiculo() {
    }


    public Vehiculo(String placa, String nombreP, int cilindraje, String modelo, Boolean disponible) {
        Placa = placa;
        NombreP = nombreP;
        Cilindraje = cilindraje;
        Modelo = modelo;
        Disponible = disponible;
    }


    public String getPlaca() {
        return Placa;
    }


    public void setPlaca(String placa) {
        Placa = placa;
    }


    public String getNombreP() {
        return NombreP;
    }


    public void setNombreP(String nombreP) {
        NombreP = nombreP;
    }


    public int getCilindraje() {
        return Cilindraje;
    }


    public void setCilindraje(int cilindraje) {
        Cilindraje = cilindraje;
    }


    public String getModelo() {
        return Modelo;
    }


    public void setModelo(String modelo) {
        Modelo = modelo;
    }


    public Boolean getDisponible() {
        return Disponible;
    }


    public void setDisponible(Boolean disponible) {
        Disponible = disponible;
    }

    
    
}
