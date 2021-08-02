package kg.megacom.salonservice.service.impl;

import kg.megacom.salonservice.dao.BranchesRepository;
import kg.megacom.salonservice.execptions.BranchesNullExecption;
import kg.megacom.salonservice.mappers.BranchesMapper;
import kg.megacom.salonservice.models.Branches;
import kg.megacom.salonservice.models.dto.BranchesDto;
import kg.megacom.salonservice.service.BranchService;
import kg.megacom.salonservice.service.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BranchServiceImpl implements BranchService {

    @Autowired
    private BranchesRepository branchesRepository;

    private SalonService salonService;

    @Override
    public List<BranchesDto> findAllBranchesBySalon(Long id) {
        return null;
    }

    @Override
    public BranchesDto findById(Long id) {
        Optional<Branches> branchesOptional = branchesRepository.findById(id);
        if(branchesOptional.isPresent()){
            Branches branches = branchesOptional.get();
            return BranchesMapper.INSTANCE.toBrancheDto(branches);
        } else {
            throw new BranchesNullExecption("Branche is Null");
        }
    }


}
