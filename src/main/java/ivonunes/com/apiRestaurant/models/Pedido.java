package ivonunes.com.apiRestaurant.models;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Pedido {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private Boolean finalizado;
  @DateTimeFormat
  private Date dataInicio;
  @DateTimeFormat
  private Date dataFim;
  @Column(nullable = false)
  private Integer numeroMesa;
  private String nomeFatura;
  @Column(length = 9)
  private String numeroContribuinte;

  @OneToMany(mappedBy = "pedidos", fetch = FetchType.EAGER)
  private List<ItemPedido> pedidos;


  public Pedido() {
  }

  public Pedido(Boolean finalizado, Date dataInicio, Date dataFim, Integer numeroMesa) {
    this.finalizado = finalizado;
    this.dataInicio = dataInicio;
    this.dataFim = dataFim;
    this.numeroMesa = numeroMesa;
  }

  public Pedido(Long id, Boolean finalizado, Date dataInicio, Date dataFim, Integer numeroMesa,
                String nomeFatura, String numeroContribuinte) {
    this.id = id;
    this.finalizado = finalizado;
    this.dataInicio = dataInicio;
    this.dataFim = dataFim;
    this.numeroMesa = numeroMesa;
    this.nomeFatura = nomeFatura;
    this.numeroContribuinte = numeroContribuinte;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Boolean getFinalizado() {
    return finalizado;
  }

  public void setFinalizado(Boolean finalizado) {
    this.finalizado = finalizado;
  }

  public Date getDataInicio() {
    return dataInicio;
  }

  public void setDataInicio(Date dataInicio) {
    this.dataInicio = dataInicio;
  }

  public Date getDataFim() {
    return dataFim;
  }

  public void setDataFim(Date dataFim) {
    this.dataFim = dataFim;
  }

  public Integer getNumeroMesa() {
    return numeroMesa;
  }

  public void setNumeroMesa(Integer numeroMesa) {
    this.numeroMesa = numeroMesa;
  }

  public String getNomeFatura() {
    return nomeFatura;
  }

  public void setNomeFatura(String nomeFatura) {
    this.nomeFatura = nomeFatura;
  }

  public String getNumeroContribuinte() {
    return numeroContribuinte;
  }

  public void setNumeroContribuinte(String numeroContribuinte) {
    this.numeroContribuinte = numeroContribuinte;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Pedido pedido = (Pedido) o;
    return id.equals(pedido.id) && finalizado.equals(pedido.finalizado) &&
            dataInicio.equals(pedido.dataInicio) && dataFim.equals(pedido.dataFim)
            && numeroMesa.equals(pedido.numeroMesa) && nomeFatura.equals(pedido.nomeFatura)
            && numeroContribuinte.equals(pedido.numeroContribuinte) &&
            pedidos.equals(pedido.pedidos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, finalizado, dataInicio, dataFim, numeroMesa,
            nomeFatura, numeroContribuinte, pedidos);
  }

}
