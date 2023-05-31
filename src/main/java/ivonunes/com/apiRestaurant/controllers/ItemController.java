package ivonunes.com.apiRestaurant.controllers;

import ivonunes.com.apiRestaurant.models.Item;
import ivonunes.com.apiRestaurant.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/items")
public class ItemController {


  @Autowired
  private ItemRepository itemRepository;

  @GetMapping("/tipo")
  public List<Item> findItemByTipoItem( @RequestParam("tipoItem") String tipoItem,  Pageable pageable) {
      return itemRepository.findByTipoItem(tipoItem);
  }

  @GetMapping("/all")
  public List<Item> getAllItems() {
    return itemRepository.findAll();
  }

  @PostMapping("/newitem")
  public Item createItem(@RequestBody  Item item){
    return itemRepository.save(item);
  }

  @GetMapping("/{id}")
  public Optional<Item> getSingleItem(@PathVariable Long id) {
    return itemRepository.findById( id );
  }

}
