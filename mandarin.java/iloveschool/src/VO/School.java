package VO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class School {
	private long id;
	private String diff;
	private String schoolName;
	private String address;
	private int postCode;
	private String tel;
	private String fax;
	private String educationOffice;
	private String publicPrivate;
	private String homepage;
}
