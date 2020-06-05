package dominio;

import javax.swing.ImageIcon;
/**
 * Esta clase hace referencia al profesional e informacion relevante del mismo.
 * @author Usuario
 */
public final class Profesional extends Persona {
    /**
     * Esta variable hace referencia al titulo del profesional.
     */
    private String tituloProfesional;
    /**
     * Esta variable hace referencia a la fecha de graduacion.
     */
    private String fechaGraduacion;
    /**
     * Esta variable hace referencia al pais de graduacion.
     */
    private String paisGraduacion;
    /**
     * Este es el constructor del profesional.
     * @param unNombre recibe el nombre del nuevo profesional
     * @param unApellido recibe su apellido
     * @param unaFechaNacimiento su fecha de nacimiento
     * @param unaFoto recibe su foto
     * @param unTitulo tambien su titulo
     * @param unaFechaGraduacion la fecha de graduacion
     * @param unPaisGraduacion y el pais de graduacion
     */
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
    }
    /**
     * Este metodo devuelve el titulo del profesional.
     * @return retorna un string
     */
    public String getTituloProfesional() {
        return this.tituloProfesional;
    }
    /**
     * Este metodo modifica el titulo del profesional.
     * @param unTitulo este es el nuevo titulo
     */
    public void setTituloProfesional(String unTitulo) {
        if (unTitulo == null || unTitulo.isEmpty()) {
            this.tituloProfesional = "Titulo no declarado";
        } else {
            this.tituloProfesional = unTitulo;
        }
    }
    /**
     * Este metodo devuelve la fecha de graduacion.
     * @return retorna un string
     */
    public String getFechaGraduacion() {
        return this.fechaGraduacion;
    }
    /**
     * Este metodo modifica la fecha de graduacion.
     * @param unaFechaGraduacion esta es la fecha de graduacion nueva
     */
    public void setFechaGraduacion(String unaFechaGraduacion) {
        if (unaFechaGraduacion == null || unaFechaGraduacion.isEmpty()) {
            this.fechaGraduacion = "Fecha no ingresada";
        } else {
            this.fechaGraduacion = unaFechaGraduacion;
        }
    }
    /**
     * Este metodo devuelve el pais de graduacion.
     * @return retrona un string
     */
    public String getPaisGraduacion() {
        return this.paisGraduacion;
    }
    /**
     * Este metodo modifica el pais de graduacion.
     * @param unPaisGraduacion este es el nuevo pais
     */
    public void setPaisGraduacion(String unPaisGraduacion) {
        paisGraduacion = unPaisGraduacion;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
