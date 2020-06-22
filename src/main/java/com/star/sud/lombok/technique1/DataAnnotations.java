package com.star.sud.lombok.technique1;

import lombok.Data;
import lombok.NonNull;

/**
 * Data Annotations will include @Getter, @Setter, @ToString, @EqualsAndHashCode
 *
 */
@Data
public class DataAnnotations {

	@NonNull
	private Integer id;
	private String name;
	private String place;

}
