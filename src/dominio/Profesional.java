package dominio;

import java.util.ArrayList;
import javax.swing.ImageIcon;

public final class Profesional extends Persona {

    public String tituloProfesional;
    private String fechaGraduacion;
    private String paisGraduacion;
    private ArrayList<String> listaPlanesPendientes; 

    public Profesional(String unNombre,
            String unApellido,
            String unaFechaNacimiento,
            ImageIcon unaFoto,
            String unTitulo,
            String unaFechaGraduacion,
            String unPaisGraduacion) {

        setNombre(unNombre);
        setApellido(unApellido);
        setFechaNacimiento(unaFechaNacimiento);
        setFotoDePerfil(unaFoto);
        setTituloProfesional(unTitulo);
        setFechaGraduacion(unaFechaGraduacion);
        setPaisGraduacion(unPaisGraduacion);
        this.listaPlanesPendientes = new ArrayList<String>(); 
    }

    public String getTituloProfesional() {
        return this.tituloProfesional;
    }

    public void setTituloProfesional(String unTitulo) {
        if (unTitulo == null || unTitulo.isEmpty()) {
            this.tituloProfesional = "Titulo no declarado";
        } else {
            this.tituloProfesional = unTitulo;
        }
    }

    public String getFechaGraduacion() {
        return this.fechaGraduacion;
    }

    public void setFechaGraduacion(String unaFechaGraduacion) {
        if (unaFechaGraduacion == null || unaFechaGraduacion.isEmpty()) {
            this.fechaGraduacion = "Fecha no ingresada";
        } else {
            this.fechaGraduacion = unaFechaGraduacion;
        }
    }

    public String getPaisGraduacion() {
        return this.paisGraduacion;
    }

    public void setPaisGraduacion(String unPaisGraduacion) {
        paisGraduacion = unPaisGraduacion;
        
    }
    
    public void agregarSolicitudPendiente(Usuario usuario){
        this.listaPlanesPendientes.add(usuario.getNombreCompleto());
    }
    
    public void borrarSolicitudPendiente(Usuario usuario){
        for (int i = 0; i < this.listaPlanesPendientes.size(); i++) {
            if (usuario.getNombreCompleto().equals(this.listaPlanesPendientes.get(i))) {
                    this.listaPlanesPendientes.remove(i);
                    return;
            }
        }
        
    }
    
    public ArrayList<String> getListaPlanesPendientes(){
        return this.listaPlanesPendientes;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
