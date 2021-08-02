package kg.megacom.salonservice.controller;


import kg.megacom.salonservice.execptions.GetNullSalonExecption;
import kg.megacom.salonservice.models.Salons;
import kg.megacom.salonservice.models.dto.BranchesDto;
import kg.megacom.salonservice.models.dto.SalonsDto;
import kg.megacom.salonservice.models.objects.InputSalons;
import kg.megacom.salonservice.service.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/salons")
public class SalonsController {

    @Autowired
    private SalonService salonService;

    @GetMapping("/all")
    public List<SalonsDto> all(){
        return salonService.findAll();
    }

    @PostMapping("/save-salon")
    public SalonsDto saveNewSalon(@RequestBody InputSalons inputSalons){
        return  salonService.saveNewSalon(inputSalons);
    }

    @GetMapping("/all/{id}")
    public SalonsDto oneSalon(@PathVariable Long id){
//        return salonService.findAll().stream()
//                .filter(salonsDto -> salonsDto.getId().equals(id))
//                .findFirst()
//                .orElseThrow(()-> new GetNullSalonExecption("Null Value of Salon"));
        return salonService.findById(id);
    }

}
