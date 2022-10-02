package model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "chuyenbay")
public class ChuyenBay {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "macb")
	private String maCB;
	@Column(name = "gadi",nullable = true,columnDefinition = "TEXT")
	private String gaDi;
	
	@Column(name = "gaden")
	private String gaDen;
	
	@Column(name = "dodai")
	private Integer dodai;
	
	@Column(name = "giodi")
	private Date gioDi;
	
	@Column(name = "gioden")
	private Date gioDen;
	
	@Column(name = "chiphi")
	private Integer chiPhi;

	@Override
	public String toString() {
		return "ChuyenBay [maCB=" + maCB + ", gaDi=" + gaDi + ", gaDen=" + gaDen + ", doDai=" + dodai + ", gioDi="
				+ gioDi + ", gioDen=" + gioDen + ", chiPhi=" + chiPhi + "]";
	}

	
	
	
	
}
