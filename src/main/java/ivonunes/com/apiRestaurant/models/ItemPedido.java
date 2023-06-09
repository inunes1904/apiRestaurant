package ivonunes.com.apiRestaurant.models;

import jakarta.persistence.*;

@Entity
public class ItemPedido {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @MapsId("id")
  @JoinColumn(name = "item_id")
  private Item item;

  @ManyToOne(fetch = FetchType.LAZY)
  @MapsId("id")
  @JoinColumn(name = "pedido_id")
  private Pedido pedido;

  @Column(nullable = false)
  private Integer quantidade;


  public ItemPedido(Item item, Pedido pedido, Integer quantidade) {
    this.item = item;
    this.pedido = pedido;
    this.quantidade = quantidade;
  }

  public ItemPedido() {

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }

  public Pedido getPedido() {
    return pedido;
  }

  public void setPedido(Pedido pedido) {
    this.pedido = pedido;
  }

  public Integer getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }
}
