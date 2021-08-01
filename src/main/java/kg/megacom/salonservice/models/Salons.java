package kg.megacom.salonservice.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Salons {

    @Id
    private Long id;
    private String name;
    private boolean active;
}
