
public class Persona {

    private String nombre;
    private String documento;
    private String direccion;

    Persona(String nom, String doc, String dir) {
        nombre = new String(nom);
        documento = new String(doc);
        direccion = new String(dir);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nom) {
        nombre = new String(nom);
    }

    public void setDocumento(String doc) {
        documento = new String(doc);
    }

    public void setDireccion(String dir) {
        direccion = new String(dir);
    }

    public void imprimirPersona() {

        System.out.println("Nombre:" + this.nombre + "\n");
        System.out.println("Documento:" + this.documento + "\n");
        System.out.println("Dirección:" + this.direccion + "\n");
    }
}