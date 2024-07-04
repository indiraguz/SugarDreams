
package com.Proyecto.domain;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table (name="curso")
public class Curso {
    private static  final long serialVersionUID=11;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_curso")
    private long idCurso;
    private String descripcion;
    private double precio;
    private String duracion;
    private String nombre;
}
