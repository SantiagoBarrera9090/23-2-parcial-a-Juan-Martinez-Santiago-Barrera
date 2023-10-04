package co.edu.unisabana.parcialarquitectura.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CheckpointDTO {

  public String facility;

  public String driver;
  @JsonProperty("day_of_month")
  public int dayOfMonth;
}