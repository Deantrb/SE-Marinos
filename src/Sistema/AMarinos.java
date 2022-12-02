package Sistema;


public class AMarinos {
    int ID;
    String img;
    String nombre,descripcion,caracteristica; 

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    public String getCaracteristicas() {
        return caracteristica;
    }

    public void setCaracteristicas(String caracteristica) {
        this.caracteristica = caracteristica;
    }
}
