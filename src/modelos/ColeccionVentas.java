package modelos;

import java.util.ArrayList;

public class ColeccionVentas {

    private ArrayList<Venta> base;

    public ColeccionVentas() {
        this.base = new ArrayList<Venta>();
    }

    public ArrayList<Venta> Listar() {
        return this.base;
    }

    public boolean Agregar(Venta venta) {
        return this.base.add(venta);
    }

    public boolean modificar(Venta venta) {
        for (int i = 0; i < this.base.size(); i++) {
            if (this.base.get(i).getCodigo().equals(venta.getCodigo())) {
                this.base.get(i).setCodigo(venta.getCodigo());
                this.base.get(i).setPrecio(venta.getPrecio());
                this.base.get(i).setCantidad(venta.getCantidad());
                return true;
            }
        }
        return false;
    }

    public boolean Eliminar(String codigo) {
        for (int i = 0; i < this.base.size(); i++) {
            if (this.base.get(i).getCodigo().equals(codigo)) {
                this.base.remove(i);
                return true;
            }
        }
        return false;
    }

    public int subTotal() {
        int subTotal = 0;
        for (int i = 0; i < this.base.size(); i++) {
            subTotal += base.get(i).getCantidad() * base.get(i).getPrecio();
        }
        return subTotal;
    }
}
