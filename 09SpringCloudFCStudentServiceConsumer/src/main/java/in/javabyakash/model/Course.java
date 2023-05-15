package in.javabyakash.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
	private Integer crsId;
	private String crsName;
	private String crsFacultyName;
	private Double crsFee;
}
