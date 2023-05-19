package ivonunes.com.apiRestaurant.models;

import jakarta.persistence.*;

@Entity
public class ItemPedido {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  private Item itemID;

  @ManyToOne
  private Pedido pedidoID;

  @Column(nullable = false)
  private int quantidade;

}
