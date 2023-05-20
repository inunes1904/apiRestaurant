package ivonunes.com.apiRestaurant.models;

import jakarta.persistence.*;

@Entity
public class ItemPedido {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  private Item items;

  @ManyToOne
  private Pedido pedidos;

  @Column(nullable = false)
  private Integer quantidade;

}
