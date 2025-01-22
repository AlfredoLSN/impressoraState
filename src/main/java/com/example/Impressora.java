package com.example;

public class Impressora {
    private ImpressoraEstado estado;
    
    public Impressora(){
        this.estado = ImpressoraEstadoIniciada.getInstance();
    }
    public void setEstado(ImpressoraEstado estado){
        this.estado = estado;
    } 
}
