package kg.megacom.salonservice.mappers;


import kg.megacom.salonservice.models.Salons;
import kg.megacom.salonservice.models.dto.SalonsDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SalonsMapper {

    SalonsMapper INSTANCE = Mappers.getMapper(SalonsMapper.class);

    Salons toSalons(SalonsDto salonsDto);
    SalonsDto toSalonsDto(Salons salons);

    List<Salons> toSalonsList(List<SalonsDto> salonsDtoList);
    List<SalonsDto> toSalonsDto(List<Salons> salonsList);

}
