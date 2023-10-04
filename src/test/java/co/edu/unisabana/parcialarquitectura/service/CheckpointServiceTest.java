package co.edu.unisabana.parcialarquitectura.service;

import co.edu.unisabana.parcialarquitectura.controller.dto.CheckpointDTO;
import co.edu.unisabana.parcialarquitectura.repository.entity.ParcialRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ExtendWith(MockitoExtension.class)
@WebAppConfiguration
class CheckpointServiceTest {
@InjectMocks

private  CheckpointService checkpointService;

@Mock
private  ParcialRepository parcialRepository;

    @Test
    void debereriaRetornarInvalidDate() {
        CheckpointDTO checkpointDTO = new CheckpointDTO();
        checkpointDTO.setDayOfMonth(1);

    }
}