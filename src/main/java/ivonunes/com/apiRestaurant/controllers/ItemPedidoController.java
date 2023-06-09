package ivonunes.com.apiRestaurant.controllers;

import ivonunes.com.apiRestaurant.models.Item;
import ivonunes.com.apiRestaurant.models.ItemPedido;
import ivonunes.com.apiRestaurant.models.Pedido;
import ivonunes.com.apiRestaurant.repositories.ItemPedidoRepository;
import ivonunes.com.apiRestaurant.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/itemPedido")
public class ItemPedidoController {

  @Autowired
  private ItemPedidoRepository itemPedidoRepository;



  @GetMapping("/all")
  public List<ItemPedido> getAllItemsPedido(){
    return itemPedidoRepository.findAll();
  }

  @PostMapping("/newItemPedido")
  public ItemPedido createItemPedido(@RequestBody ItemPedido itemPedido){
    return itemPedidoRepository.save(itemPedido);
  }


}
