package ivonunes.com.apiRestaurant.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
public class Pedido {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Boolean finalizado;
  @DateTimeFormat
  private Date dataInicio;
  @DateTimeFormat
  private Date dataFim;
  private int numeroMesa;
  private String nomeFatura;
  private String numeroContribuinte;
}
