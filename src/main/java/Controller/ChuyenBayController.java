package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.ChuyenBay;
import service.ChuyenBayService;

@RestController
@RequestMapping("/api")
public class ChuyenBayController {
	@Autowired
    private ChuyenBayService chuyenBayService;
	
	@GetMapping("/chuyenbay")
	public List<ChuyenBay> listChuyenBays() {
		return chuyenBayService.listChuyenBay();
	}
	
}
