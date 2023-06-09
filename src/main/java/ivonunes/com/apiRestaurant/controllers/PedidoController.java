package ivonunes.com.apiRestaurant.controllers;

import ivonunes.com.apiRestaurant.models.Pedido;
import ivonunes.com.apiRestaurant.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pedidos")
public class PedidoController {
  @Autowired
  private PedidoRepository pedidoRepository;



  @GetMapping("/all")
  public List<Pedido> getAllPedidos(){
    return pedidoRepository.findAll();
  }

  @PostMapping("/newPedido")
  public Pedido createPedido(@RequestBody Pedido pedido){
    return pedidoRepository.save(pedido);
  }
}

