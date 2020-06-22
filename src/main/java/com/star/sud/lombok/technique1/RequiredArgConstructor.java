package com.star.sud.lombok.technique1;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
public class RequiredArgConstructor {

	@NonNull
	Integer id;
	private String name;
	private String place;

}
