package Food.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Food.model.Cozinha;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Controller
@RequestMapping("/cozinha")
public class CozinhaController {
	
	
	@Autowired
	private EntityManager manager;
	
	@GetMapping
	public List<Cozinha> listar(){
		TypedQuery<Cozinha> query = manager.createQuery("from Cozinha", Cozinha.class );
		return query.getResultList();
	}
	

}
