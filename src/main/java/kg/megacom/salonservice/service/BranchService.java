package kg.megacom.salonservice.service;

import kg.megacom.salonservice.models.dto.BranchesDto;

import java.util.List;

public interface BranchService {

    List<BranchesDto> findAllBranchesBySalon(Long id);

    BranchesDto findById(Long id);
}
