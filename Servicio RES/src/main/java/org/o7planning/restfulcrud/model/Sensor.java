package org.o7planning.restfulcrud.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "sensor")
@XmlAccessorType(XmlAccessType.FIELD)
public class Sensor {
    private String identificacion_dispositivo;
    private String ultima_actualizacion;
    private String actuador_temperatura;
    private String actuador_riego;
    private String actuador_luz;
    private String temperatura;
    private String humedad;
    private String presion;

    public String getIdentificacion_dispositivo() {
        return identificacion_dispositivo;
    }

    public void setIdentificacion_dispositivo(String identificacion_dispositivo) {
        this.identificacion_dispositivo = identificacion_dispositivo;
    }

    public String getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(String ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }

    public String getActuador_temperatura() {
        return actuador_temperatura;
    }

    public void setActuador_temperatura(String actuador_temperatura) {
        this.actuador_temperatura = actuador_temperatura;
    }

    public String getActuador_riego() {
        return actuador_riego;
    }

    public void setActuador_riego(String actuador_riego) {
        this.actuador_riego = actuador_riego;
    }

    public String getActuador_luz() {
        return actuador_luz;
    }

    public void setActuador_luz(String actuador_luz) {
        this.actuador_luz = actuador_luz;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getHumedad() {
        return humedad;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }

    public String getPresion() {
        return presion;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }

}