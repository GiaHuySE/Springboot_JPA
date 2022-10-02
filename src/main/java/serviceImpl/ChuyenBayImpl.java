package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.ChuyenBayRepo;
import model.ChuyenBay;
import service.ChuyenBayService;

@Service
public class ChuyenBayImpl implements ChuyenBayService {

	@Autowired
	private ChuyenBayRepo chuyenBayRepo;
	@Override
	public List<ChuyenBay> listChuyenBay() {
		// TODO Auto-generated method stub
		return chuyenBayRepo.findAll();
	}

	@Override
	public List<ChuyenBay> doDaiNhoHon10kVaLonHon8k() {
		// TODO Auto-generated method stub
		return chuyenBayRepo.findChuyenBayDoDaiHon8VaNhoHon10();
	}

	@Override
	public List<ChuyenBay> chuyenBaySgDenBmt(String gaDi, String gaDen) {
		// TODO Auto-generated method stub
		return chuyenBayRepo.findChuyenBaySGtoiBMT();
	}

	@Override
	public Integer countChuyenBayTuSG(String gaDi) {
		// TODO Auto-generated method stub
		return chuyenBayRepo.countChuyenBayFromGaDi(gaDi);
	}

	@Override
	public List<ChuyenBay> chuyenBayDenDAD(String gaDen) {
		// TODO Auto-generated method stub
		return chuyenBayRepo.findChuyenBaystoGaDiDAD() ;
	}

}
