package kg.megacom.salonservice.models.dto;

import kg.megacom.salonservice.models.Salons;
import lombok.Data;

@Data
public class BranchesDto {
    private Long id;
    private Double lat;
    private Double lon;
    private boolean active;
    private Salons salonId;

}
