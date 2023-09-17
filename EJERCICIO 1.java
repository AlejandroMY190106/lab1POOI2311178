/******************************************************************************
Cree una clase llamada Factura que una ferretería podría utilizar para representar una factura
para un artículo vendido en la tienda.
Una Factura debe incluir cuatro piezas de información como variables de instancia: 
-Un número de pieza (tipo String)
-la descripción de la pieza (tipo String)
-la cantidad de artículos de ese tipo que se van a comprar (tipo int)
-El precio por artículo (double). 
-Su clase debe tener un constructor que inicialice las cuatro variables de
instancia. 
-Proporcione un método establecer y un método obtener para cada variable de instancia.
-Además, proporcione un método llamado obtenerMontoFactura, que calcule el
monto de la factura (es decir, que multiplique la cantidad de artículos por el precio de cada uno)
-Devuelva ese monto como un valor double.
Si la cantidad no es positiva, debe establecerse en 0. Si el precio por artículo no es positivo, debe establecerse en 0.0. Escriba una
aplicación de prueba llamada PruebaFactura, que demuestre las capacidades de la clase Factura.
*******************************************************************************/

public class Main {
    public static void main(String[] args) {
        Factura factura01 = new Factura("16 piezas", "Tornillos", 8, 24.00);
        Factura factura02 = new Factura("20 piezas", "Clavos", 6, 10.00);
        System.out.println("FACTURA");
        System.out.println("1.- " + factura01.getDPiezas()+ " ("+ factura01.getNPiezas() +")"+"\nPrecio :"+factura01.precioArticulos+"\nCantidad :"+factura01.cantidadArticulos+"\nMonto :"+factura01.obtenerMontoFactura());
        System.out.println("2.- " + factura02.getDPiezas()+ " ("+ factura02.getNPiezas() +")"+"\nPrecio :"+factura02.precioArticulos+"\nCantidad :"+factura02.cantidadArticulos+"\nMonto :"+factura02.obtenerMontoFactura());
    }

    public static class Factura {
        private String nPiezas;
        private String dPiezas;
        private int cantidadArticulos;
        private double precioArticulos;

        // CONSTRUCTOR
        public Factura(String _nPiezas, String _dPiezas, int _cantidadArticulos, double _precioArticulos) {
            this.nPiezas = _nPiezas;
            this.dPiezas = _dPiezas;
            this.cantidadArticulos = _cantidadArticulos;
            this.precioArticulos = _precioArticulos;
        }

        // METODO GET Y SET
        public void setNPiezas(String _nPiezas) {
            this.nPiezas = _nPiezas;
        }

        public String getNPiezas() {
            return this.nPiezas;
        }

        public void setDPiezas(String _dPiezas) {
            this.dPiezas = _dPiezas;
        }

        public String getDPiezas() {
            return this.dPiezas;
        }

        public void setCantidadArticulos(int _cantidadArticulos) {
            this.cantidadArticulos = _cantidadArticulos;
        }

        public int getCantidadArticulos() {
            return this.cantidadArticulos;
        }

        public void setPrecioArticulos(double _precioArticulos) {
            this.precioArticulos = _precioArticulos;
        }

        public double getPrecioArticulos() {
            return this.precioArticulos;
        }

        // Obtener Monto Factura
        public double obtenerMontoFactura() {
            double MontoFactura = cantidadArticulos * precioArticulos;
            if (MontoFactura<0)
            MontoFactura = 0.0;
            return MontoFactura;
        }
    }
}
