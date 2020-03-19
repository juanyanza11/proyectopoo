/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author juanyanza11
 */
public class Industrial {
    
    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    public Industrial(int canti, String prodn, double valor) {
        this.canti = canti;
        this.prodn = prodn;
        this.valor = valor;
    }
    private double valor;
    private int canti;
    private String prodn;

    /**
     * @return the canti
     */
    public int getCanti() {
        return canti;
    }

    /**
     * @param canti the canti to set
     */
    public void setCanti(int canti) {
        this.canti = canti;
    }

    /**
     * @return the prodn
     */
    public String getProdn() {
        return prodn;
    }

    /**
     * @param prodn the prodn to set
     */
    public void setProdn(String prodn) {
        this.prodn = prodn;
    }

}
