
package com.Proyecto.domain;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table (name="personalizar")
public class Personalizar {
    private static  final long serialVersionUID=11;
    @Id
   
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_queque")
    private long idQueque;
    private String rutaImagen;
    private String relleno;
    private String sabor;
    private String cobertura;
    private String tamaño;
    private String altura; 
    private String descripcion;
    
}
