public class Dispositivo {

    // ===== Ejercicio 2, Paso 1: atributos private =====
    private String nombre;
    private String tipo;
    private boolean activo;

    // ===== Ejercicio 3: atributo static (compartido por toda la clase) =====
    private static int contador = 0;

    // Desafío adicional: identificador automático
    private int id;

    // ===== Ejercicio 3, Pasos 2 y 3: constructor =====
    public Dispositivo(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.activo = false;      // por defecto nace inactivo
        contador++;               // Paso 6: incrementa el contador
        this.id = contador;       // Desafío: ID automático
    }

    // ===== Ejercicio 3, Paso 7: método static =====
    public static int getTotalCreados() {
        return contador;
    }

    // ===== Ejercicio 2, Pasos 3 a 7: getters y setters =====
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        // Validación: no guardar un nombre vacío
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre no válido: no puede estar vacío.");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    // ===== Métodos de acción =====
    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Activo: " + activo);
    }

    public void activar() {
        if (!activo) {
            activo = true;
            System.out.println(nombre + " ha sido activado.");
        }
    }

    // Desafío adicional del Ejercicio 2
    public void desactivar() {
        if (activo) {
            activo = false;
            System.out.println(nombre + " ha sido desactivado.");
        }
    }

    public void mostrarEstado() {
        String estado = activo ? "está activo" : "está inactivo";
        System.out.println(nombre + " " + estado);
    }
}
