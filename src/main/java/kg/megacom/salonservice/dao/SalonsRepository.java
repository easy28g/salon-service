package kg.megacom.salonservice.dao;


import kg.megacom.salonservice.models.Salons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalonsRepository extends JpaRepository<Salons, Long> {
//    List<Salons> findAll();
}
