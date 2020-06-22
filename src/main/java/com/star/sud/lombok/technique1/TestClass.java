package com.star.sud.lombok.technique1;

public class TestClass {

	public static void main(String[] args) {

		// Using constructor & tostring
		SetterGetterConstructorsToString obj1 = new SetterGetterConstructorsToString(1, "Java basic",
				"Using constructor");
		System.out.println(obj1);

		// Using setter/getter
		SetterGetterConstructorsToString obj2 = new SetterGetterConstructorsToString();
		obj2.setId(1);
		obj2.setName("Lombok");
		obj2.setPlace("Using Java");
		System.out.println(obj2);
		System.out.println(obj2.getId() + ", " + obj2.getName() + ", " + obj2.getPlace());

		// DataAnnotations
		DataAnnotations dobj = new DataAnnotations(1);
		dobj.setName("Spring Boot");
		dobj.setPlace("Pivotal");
		System.out.println(dobj);

		// Required Arg Constructors
		RequiredArgConstructor arg = new RequiredArgConstructor(5);
		System.out.println(arg);

		// Value Annotations
		ValueAnnotations vanot = new ValueAnnotations(1, "Sudarshan", "Bangalore");
		System.out.println(vanot);

	}

}
