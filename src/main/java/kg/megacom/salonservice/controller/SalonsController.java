package kg.megacom.salonservice.controller;


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
}
