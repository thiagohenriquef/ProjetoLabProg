package br.com.IngressosJa.model;

public class Evento {
    private Ingresso ingressos;
    private String localEvento;
    private String nomeEvento;
    private String dataEvento;

    public Evento(Ingresso ingressos, String localEvento, String nomeEvento, String dataEvento) {
        this.ingressos = ingressos;
        this.localEvento = localEvento;
        this.nomeEvento = nomeEvento;
        this.dataEvento = dataEvento;
    }

    public Evento() {
    }
    
    
    public Ingresso getIngressos() {
        return ingressos;
    }

    
    public void setIngressos(Ingresso ingressos) {
        this.ingressos = ingressos;
    }

    public String getLocalEvento() {
        return localEvento;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public void setLocalEvento(String localEvento) {
        this.localEvento = localEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }
           
}
