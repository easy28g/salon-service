package kg.megacom.salonservice.controller;


import kg.megacom.salonservice.models.dto.BranchesDto;
import kg.megacom.salonservice.models.dto.SalonsDto;
import kg.megacom.salonservice.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/branches")
public class BranchesController {

    @Autowired
    private BranchService branchService;

    @GetMapping("/{id}")
    public BranchesDto oneBranche(Long id){
        return branchService.findById(id);
    }
    
    


    
}
