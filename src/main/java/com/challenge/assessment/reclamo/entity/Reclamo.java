package com.challenge.assessment.reclamo.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Reclamo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name= "id_reclamo")
    private int id_reclamo;

    @Column(name= "cod_reclamo")
    private String cod_reclamo;

    @Column(name= "cod")
    private String cod_producto;

    @Column(name= "motivo_reclamo")
    private String motivo_reclamo;

    @Column(name= "descripcion_reclamo")
    private String descripcion_reclamo;

    @Column(name= "fecha_grabacion_reclamo")
    private Date fecha_grabacion_reclamo = new Date();

}
