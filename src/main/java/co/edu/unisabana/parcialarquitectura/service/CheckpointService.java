package co.edu.unisabana.parcialarquitectura.service;

import co.edu.unisabana.parcialarquitectura.controller.dto.CheckpointDTO;
import co.edu.unisabana.parcialarquitectura.repository.entity.ParcialRepository;
import co.edu.unisabana.parcialarquitectura.service.model.Checkin;
import co.edu.unisabana.parcialarquitectura.repository.CheckpointPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@AllArgsConstructor
public class CheckpointService {

  private final ParcialRepository parcialRepository;

  @Transactional
  public void checkin(CheckpointDTO checkpoint) {
    if (checkpoint.dayOfMonth > 30 || checkpoint.dayOfMonth < 1) {
      throw new IllegalArgumentException("Invalid date");
    }
    Checkin checkin = new Checkin(checkpoint.facility, checkpoint.driver, checkpoint.dayOfMonth);
    parcialRepository.saveChekin(checkin);

  }
}
