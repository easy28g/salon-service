package kg.megacom.salonservice.mappers;

import kg.megacom.salonservice.models.Branches;
import kg.megacom.salonservice.models.dto.BranchesDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BranchesMapper {
    BranchesMapper INSTANCE = Mappers.getMapper(BranchesMapper.class);

    Branches toBranche(BranchesDto branchesDto);
    BranchesDto toBrancheDto(Branches branches);

    List<Branches> toBrancheList(List<BranchesDto> branchesDtoList);
    List<BranchesDto> toBrancheDtoList(List<Branches> branchesList);

}
