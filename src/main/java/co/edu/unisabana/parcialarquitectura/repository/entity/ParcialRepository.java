package co.edu.unisabana.parcialarquitectura.repository.entity;

import co.edu.unisabana.parcialarquitectura.service.model.Checkin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcialRepository  extends JpaRepository<Checkin, Integer> {


    void saveChekin(Checkin checkin);
}
