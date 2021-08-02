package kg.megacom.salonservice.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Branches {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double lat;
    private Double lon;
    private boolean active;

    @ManyToOne
    @JoinColumn(name = "salon_id")
    private Salons salonId;

}
