package kg.megacom.salonservice.service;


import kg.megacom.salonservice.models.Salons;
import kg.megacom.salonservice.models.dto.SalonsDto;
import kg.megacom.salonservice.models.objects.InputSalons;

import java.util.List;

public interface SalonService {

    List<SalonsDto> findAll();

    SalonsDto saveNewSalon(InputSalons inputSalons);

    SalonsDto findById(Long Id);
}
