# Lombok usage in Java- Spring Boot
Introduction to usage of Lombok

#### Introduction:

Lombok is a Java library that can plug into editors and build tools to generate boilerplate code when defining Java classes (such as constructors, field getter and setter, equals and hashCode methods) at compile time for you via annotations

#### Dependencys:

* Add the dependencys to your `pom.file` to import the library, In case for Java/J2EE project, download and add the library externally.

```
<dependency>
	<groupId>org.projectlombok</groupId>
	<artifactId>lombok</artifactId>
	<optional>true</optional>
</dependency>

```

* To work with Spring Too Suite or in Eclipse, install the lombok jar as below, <br>

<ol>
	<li>
	Got to the directory where your jar is located, for example /.m2/repository/org/projectlombok/lombok/ and execute the below command
	`java -jar lombok.jar` <br>
	<img src="https://github.com/Sudarshan-Gowda/spring-boot-lombok/blob/master/docs/Picture1.PNG" width=100%"/>	
	</li>
	<li> That will open-up lombok window asking to specify the tool, Some time that will auto detect the tools, if not specify your tool path, For Ex:  `D://tools/sts/sts-4.6.1.RELEASE`,
	And then click Install/Update option. This will install the lombok library to your tool and also make an entry in `SpringToolSuite4.ini` file.
	<img src="https://github.com/Sudarshan-Gowda/spring-boot-lombok/blob/master/docs/Picture2.PNG" width=100%"/><br>
	<img src="https://github.com/Sudarshan-Gowda/spring-boot-lombok/blob/master/docs/Picture3.PNG" width=100%"/>	<br>	
	</li>
</ol>	

### Description:

##### Generate getters, setters, toString, equals and hashCode </b><br>
Use @Getter, @Setter, @ToString, @EqualsAndHashCode to generate field getters and setters, toString, equals and hashCode methods separately.

##### @Data and @Value </b>

* You can also use @Data for the above code generation. @Data is equivalent to @Getter + @Setter + @RequiredArgsConstructor + @ToString + @EqualsAndHashCode

* Use @Value if you'd like to create an immutable entity. @Value is equivalent to @Getter + @FieldDefaults(makeFinal=true, level=AccessLevel.PRIVATE) + @AllArgsConstructor + @ToString + @EqualsAndHashCode


##### Add a Logger with @Slf4j</b>
Use @Slf4j to generate a logger field, make sure slf4j-api is already included in your project dependencies



