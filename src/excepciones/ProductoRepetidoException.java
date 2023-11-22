package excepciones;
/*
 * // Clase abstracta HamburguesaException
public abstract class HamburguesaException extends Exception {
    public HamburguesaException(String mensaje) {
        super(mensaje);
    }
}

// Clase IngredienteRepetidoException que extiende de HamburguesaException
public class IngredienteRepetidoException extends HamburguesaException {
    private String ingredienteRepetido;

    public IngredienteRepetidoException(String mensaje, String ingrediente) {
        super(mensaje);
        this.ingredienteRepetido = ingrediente;
    }

    public String getIngredienteRepetido() {
        return ingredienteRepetido;
    }
}

// Clase ProductoRepetidoException que extiende de HamburguesaException
public class ProductoRepetidoException extends HamburguesaException {
    private String productoRepetido;

    public ProductoRepetidoException(String mensaje, String producto) {
        super(mensaje);
        this.productoRepetido = producto;
    }

    public String getProductoRepetido() {
        return productoRepetido;
    }
}

// Ejemplo de cómo podrías utilizar estas excepciones al cargar la información del restaurante
public class Restaurante {
    public void cargarInformacion() {
        // Supongamos que tienes una lista de ingredientes y productos
        List<String> listaIngredientes = obtenerListaIngredientesDesdeArchivo();
        List<String> listaProductos = obtenerListaProductosDesdeArchivo();

        try {
            verificarIngredientesRepetidos(listaIngredientes);
            verificarProductosRepetidos(listaProductos);
            // Si no hay ingredientes ni productos repetidos, continúa con la carga
            // ...
        } catch (IngredienteRepetidoException e) {
            System.out.println("Error: Ingrediente repetido -> " + e.getIngredienteRepetido());
            // Manejar la excepción o realizar alguna acción adicional si es necesario
        } catch (ProductoRepetidoException e) {
            System.out.println("Error: Producto repetido -> " + e.getProductoRepetido());
            // Manejar la excepción o realizar alguna acción adicional si es necesario
        }
    }

    // Métodos de ejemplo para verificar ingredientes y productos repetidos
    private void verificarIngredientesRepetidos(List<String> ingredientes) throws IngredienteRepetidoException {
        // Lógica para verificar ingredientes repetidos
        // Si se encuentra un ingrediente repetido, se lanza la excepción IngredienteRepetidoException
        // ...
    }

    private void verificarProductosRepetidos(List<String> productos) throws ProductoRepetidoException {
        // Lógica para verificar productos repetidos
        // Si se encuentra un producto repetido, se lanza la excepción ProductoRepetidoException
        // ...
    }

    // Métodos de ejemplo para obtener listas de ingredientes y productos desde archivo
    private List<String> obtenerListaIngredientesDesdeArchivo() {
        // Lógica para leer el archivo y obtener la lista de ingredientes
        // ...
        return new ArrayList<>(); // Retorno simulado de lista de ingredientes
    }

    private List<String> obtenerListaProductosDesdeArchivo() {
        // Lógica para leer el archivo y obtener la lista de productos
        // ...
        return new ArrayList<>(); // Retorno simulado de lista de productos
    }
}

 * */

public class ProductoRepetidoException extends HamburguesaException {
	public ProductoRepetidoException() {
		
	}
}
