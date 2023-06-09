package ivonunes.com.apiRestaurant.repositories;

import ivonunes.com.apiRestaurant.models.Item;
import ivonunes.com.apiRestaurant.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long>  {
}
