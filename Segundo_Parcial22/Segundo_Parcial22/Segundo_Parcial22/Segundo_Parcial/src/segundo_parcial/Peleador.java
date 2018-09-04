
package segundo_parcial;

import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Peleador {
    public Icon Imagen;
    public int puntos_vida;
    public int movimiento_x;
    public int movimiento_y;
    public String estado;
    public String direccion;

    public Peleador(Icon Imagen, int puntos_vida, int movimiento_x, int movimiento_y, String estado, String direccion) {
        this.Imagen = Imagen;
        this.puntos_vida = puntos_vida;
        this.movimiento_x = movimiento_x;
        this.movimiento_y = movimiento_y;
        this.estado = estado;
        this.direccion=direccion;
    }

    public Peleador() {
    }
    
    
    
    public Icon getImagen() {
        return Imagen;
    }

    public void setImagen(Icon Imagen) {
        this.Imagen = Imagen;
    }

    public int getPuntos_vida() {
        return puntos_vida;
    }

    public void setPuntos_vida(int puntos_vida) {
        this.puntos_vida = puntos_vida;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getMovimiento_x() {
        return movimiento_x;
    }

    public void setMovimiento_x(int movimiento_x) {
        this.movimiento_x = movimiento_x;
    }

    public int getMovimiento_y() {
        return movimiento_y;
    }

    public void setMovimiento_y(int movimiento_y) {
        this.movimiento_y = movimiento_y;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
            
}
