
package Modelo;

public class ItemVenta {
    int codigo,cant;
    float precio;
    String descripcion;

    public ItemVenta(int codigo, float precio, String descripcion) {
        this.codigo = codigo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.cant = 1;
    }

    public ItemVenta(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cant = 1;
    }

    @Override
    public String toString() {
        return "codigo: " + codigo + " cant: " + cant + " precio: " + precio + " descripcion: " + descripcion + "\n";
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void agregar(){
        this.cant = this.cant + 1;
    }
    
    public void quitar(){
        this.cant = this.cant - 1;
    }
    
    
    
}
