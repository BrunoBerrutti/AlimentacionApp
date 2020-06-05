package dominio;

import java.io.Serializable;
/**
 * Esta clase hace referencia al plan de alimentacion.
 * @author Usuario
 */
public final class PlanAlimentacion implements Serializable {
    /**
     * Esta variable hace referencia al nombre del plan.
     */
    private String nombreDelPlan;
    /**
     * Esta variable hace referencia al usuario.
     */
    private Usuario usuario;
    /**
     * Esta variable hace referencia al profesional.
     */
    private Profesional profesional;
    /**+
     *  Esta variable hace referencia a si fue atenidido el plan o no.
     */
    private boolean fueAtendidoElPlan;
    /**
     * Esta variable hace referencia al plan del dia a dia.
     */
    private String[][] planDiaADia;
    /**
     * Este es el constructor de la clase plan de alimentacion.
     * @param np este es el nombre del plan
     * @param usu recibe el usuario que desea el plan
     * @param pro recibe el profesional que lo otorga
     * @param fueAtendido dice si fue atendido o no
     * @param unPlan este es el plan dia a dia
     */
    public PlanAlimentacion(String np,
            Usuario usu,
            Profesional pro,
            boolean fueAtendido,
            String[][] unPlan) {

        setNombreDelPlan(np);
        setUsuario(usu);
        setProfesional(pro);
        setFueAtendidoElPlan(fueAtendido);
        setPlanDiaADia(unPlan);
    }
    /**
     * Este metodo devuelve el usuario.
     * @return retorna una persona
     */
    public Persona getUsuario() {
        return usuario;
    }
    /**
     * Este metodo modifica el usuario.
     * @param unUsuario este es el nuevo usuario
     */
    public void setUsuario(Usuario unUsuario) {
        usuario = unUsuario;
    }
    /**
     * Este metodo devuelve el profesional.
     * @return retorna un profesional
     */
    public Profesional getProfesional() {
        return this.profesional;
    }
    /**
     * Este metodo modifica el profesional.
     * @param unProfesional este es el nuevo profesional
     */
    public void setProfesional(Profesional unProfesional) {
        if (unProfesional == null) {
            this.profesional =
                    new Profesional(null, null, null, null, null, null, null);
        } else {
            this.profesional = unProfesional;
        }
    }
    /**
     * Este metodo retorna true si fue atendido el plan.
     * @return retorna un booleano
     */
    public boolean getFueAtendidoElPlan() {
        return fueAtendidoElPlan;
    }
    /**
     * Este metodo modifica la variable fueatendido.
     * @param fueAtendido modifica el valor de la variable por este nuevo
     */
    public void setFueAtendidoElPlan(boolean fueAtendido) {
        this.fueAtendidoElPlan = fueAtendido;
    }
    /**
     * Este metodo retorna el plan del dia a dia.
     * @return retorna el plan
     */
    public String[][] getPlanDiaADia() {
        return this.planDiaADia;
    }
    /**
     * Este metodo modifica el plan.
     * @param unPlan este es el nuevo plan
     */
    public void setPlanDiaADia(String[][] unPlan) {
        this.planDiaADia = unPlan;
    }
    /**
     * Este metodo retorna el nombre del plan.
     * @return retorna un string
     */
    public String getNombreDelPlan() {
        return this.nombreDelPlan;
    }
    /**
     * Este metodo modifica el nombre del plan.
     * @param unNombreDelPlan este es el nuevo nombre
     */
    public void setNombreDelPlan(String unNombreDelPlan) {
        nombreDelPlan = unNombreDelPlan;
    }

    @Override
    public String toString() {
        return this.getNombreDelPlan();
    }

    @Override
    public boolean equals(Object obj) {
        PlanAlimentacion otroPlanAlimentacion = (PlanAlimentacion) obj;
        return (this.getNombreDelPlan().equals(otroPlanAlimentacion.
                getNombreDelPlan())
                && this.getUsuario().equals(otroPlanAlimentacion.getUsuario())
                && this.getProfesional().equals(otroPlanAlimentacion.
                        getProfesional()));
    }

}
