/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deporte;

/**
 *
 * @author LEARNING CENTER
 */
public class Pelota {
    private String nombreDeporte;
    private String descripcion;
    private String tipo;
    private Float peso;
    private Float diametro;
    private boolean rebote;
    private String color;
    private String material;

    public Pelota() {
    }

    public Pelota(String nombreDeporte, String descripcion, String tipo, Float peso, Float diametro, boolean rebote, String color, String material) {
        this.nombreDeporte = nombreDeporte;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.peso = peso;
        this.diametro = diametro;
        this.rebote = rebote;
        this.color = color;
        this.material = material;
    }

    public Pelota(String nombreDeporte, String tipo, Float peso, Float diametro, String material) {
        this.nombreDeporte = nombreDeporte;
        this.tipo = tipo;
        this.peso = peso;
        this.diametro = diametro;
        this.material = material;
    }

    public Pelota(String nombreDeporte, String descripcion, Float diametro, boolean rebote, String material) {
        this.nombreDeporte = nombreDeporte;
        this.descripcion = descripcion;
        this.diametro = diametro;
        this.rebote = rebote;
        this.material = material;
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getDiametro() {
        return diametro;
    }

    public void setDiametro(Float diametro) {
        this.diametro = diametro;
    }

    public boolean isRebote() {
        return rebote;
    }

    public void setRebote(boolean rebote) {
        this.rebote = rebote;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
          
    
    
    
}
