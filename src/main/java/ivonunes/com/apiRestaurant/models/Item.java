package ivonunes.com.apiRestaurant.models;


import jakarta.persistence.*;

@Entity
@Table(name="item")
public class Item {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private String imagem;
  private Double preco;
  private int tempoConcepcao;
  private String tipoItem;

}
