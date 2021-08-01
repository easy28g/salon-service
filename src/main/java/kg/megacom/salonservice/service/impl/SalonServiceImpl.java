package kg.megacom.salonservice.service.impl;

import kg.megacom.salonservice.dao.SalonsRepository;
import kg.megacom.salonservice.mappers.SalonsMapper;
import kg.megacom.salonservice.models.Salons;
import kg.megacom.salonservice.models.dto.SalonsDto;
import kg.megacom.salonservice.models.objects.InputSalons;
import kg.megacom.salonservice.service.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SalonServiceImpl implements SalonService {

    @Autowired
    private SalonsRepository salonsRepository;

    @Override
    public List<SalonsDto> findAll() {

        List<Salons> salonsList = salonsRepository.findAll();
        return SalonsMapper.INSTANCE.toSalonsDto(salonsList);
    }

    @Override
    public SalonsDto saveNewSalon(InputSalons inputSalons) {

        SalonsDto salonsDto = new SalonsDto();
//        salonsDto.setId(inputSalons.getId());   т.к. id=IDENTITY
        salonsDto.setName(inputSalons.getName());
        salonsDto.setActive(inputSalons.isActive());

        return SalonsMapper.INSTANCE.toSalonsDto(salonsRepository.save(SalonsMapper.INSTANCE.toSalons(salonsDto)));
    }
}
