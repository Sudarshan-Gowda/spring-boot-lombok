package com.star.sud.lombok.technique1;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Example For Generating setter, getter, constructor, tostring,
 * equalAndHashCode
 * 
 * All the above annotations(Getter, Setter, ToString, EqualsAndHashCode -> can
 * be combined using single annotation @Data
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class SetterGetterConstructorsToString {

	private int id;
	private String name;
	private String place;

}
