package org.example;

import java.util.ArrayList;

public class Universidad {
        private String cuit;
        private String razonSocial;
        private double valorHoraCatedraBase;
        private ArrayList<Docente> docentes;



    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public double getValorHoraCatedraBase() {
        return valorHoraCatedraBase;
    }

    public void setValorHoraCatedraBase(double valorHoraCatedraBase) {
        this.valorHoraCatedraBase = valorHoraCatedraBase;
    }

    public ArrayList<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(ArrayList<Docente> docentes) {
        this.docentes = docentes;
    }

    public void mostrarBonos (){
        System.out.println("Universidad: " + this.razonSocial);
        System.out.println("CUIT: " + this.cuit+ "  " + "Valor Base Hora Catedra: " + this.valorHoraCatedraBase);
        System.out.println("------------------------Docentes------------------------------");
        for (Docente docente: this.docentes){

            System.out.println("Nombre Completo: " + docente.getNombreCompleto());
            System.out.println("Catedra: " + docente.getCatedra().getDenominacion());
            System.out.println("Salario: " + docente.salarioDocenteCalculado(this.valorHoraCatedraBase));
            System.out.println("---------------------------------------------------------------------");
        }


    }
}
