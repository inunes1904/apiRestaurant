package ivonunes.com.apiRestaurant.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="item")
public class Item {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @Column(unique = true)
  private String nome;
  private String imagem;
  private Double preco;
  private Integer tempoConcepcao;
  private String tipoItem;

  @OneToMany(mappedBy = "items",fetch = FetchType.EAGER)
  private List<ItemPedido> items;

  public Item(String nome, String imagem, Double preco, Integer tempoConcepcao, String tipoItem) {
    this.nome = nome;
    this.imagem = imagem;
    this.preco = preco;
    this.tempoConcepcao = tempoConcepcao;
    this.tipoItem = tipoItem;
  }
  public Item() {

  }
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getImagem() {
    return imagem;
  }

  public void setImagem(String imagem) {
    this.imagem = imagem;
  }

  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

  public Integer getTempoConcepcao() {
    return tempoConcepcao;
  }

  public void setTempoConcepcao(Integer tempoConcepcao) {
    this.tempoConcepcao = tempoConcepcao;
  }

  public String getTipoItem() {
    return tipoItem;
  }

  public void setTipoItem(String tipoItem) {
    this.tipoItem = tipoItem;
  }
}
