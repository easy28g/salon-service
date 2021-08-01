package kg.megacom.salonservice.service;


import kg.megacom.salonservice.models.dto.SalonsDto;

import java.util.List;

public interface SalonService {
    List<SalonsDto> findAll();
}
