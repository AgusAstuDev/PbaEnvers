package entidades;
import java.io.Serializable;

import javax.persistence.*;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity //va a ser una entidad y se va a guardar en la DB
@Table(name = "domicilio") //nombre en tabla
public class Domicilio implements Serializable{
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombreCalle")
    private String nombreCalle;

    @Column(name="numeroCalle")
    private int numeroCalle;
}