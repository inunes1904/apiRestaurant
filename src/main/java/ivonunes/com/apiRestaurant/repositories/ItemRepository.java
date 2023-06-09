package ivonunes.com.apiRestaurant.repositories;

import ivonunes.com.apiRestaurant.models.Item;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item, Long> {
  List<Item> findByTipoItem(String tipoItem);


}
