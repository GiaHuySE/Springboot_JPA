package Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import model.MayBay;

@Repository
public interface MayBayRepo extends JpaRepository<MayBay, String>{
	
	@Query(value = "SELECT * FROM kttkpm_qlchuyenbay_db.maybay where TamBay > 10000;", nativeQuery = true)
	public List<MayBay> findMayBaysByTamBay();
	
	@Query(value = "SELECT count(*) FROM kttkpm_qlchuyenbay_db.maybay where Loai like 'Boeing%';", nativeQuery = true)
	public Integer countMayBaysByLoaiBoeing();
	
	
}