 HIBERNATE: orm tools(object relational mapping tools) 
 hibernate internally uses jdbc.
 
 JPA(jakarta persistence api) is an API
 
 HIBERNATE WITH JPA: 
 
 1) What is HIBERNATE?
 --> Hibernate is a java framework that simplify the development of java application to intrect with dB.
 It is an open source (ORM) of a relational mapping tools hibernate implements the specification of JPA to communicate with the dB.
 
 2) What is JPA?
--> It stands for jakarta persistence api which is a specification of JAva that provides certain funcanilities to ORM tools (means Hibernate).
 It contains jakarta.persistence package whis has multiple classes and interfaces. JPI acts as a bridge between object oriented domain models and relational database system.
 It is capable for verious dB operations such as Insert, Delete, Update ... etc.
 
 3) What i ORM?
--> ORM stands for object relational mapping it is a tool of framework that helps the developers to communicate with the dB with or without writting a querry.
 ORM tool will create a table automatically in dB with the help of some annotations...
  
  for example:
  @Entity
  class customer{               here customer is a table name
	 @Id         ----------------------------------------------------> primary key in table 
	 int id ;           -|
	 String name;       -|--->  here id , name , email is table column
	 String email;      -|
 }
 
 4) What is LOMBOK?
 is a java labiri whis is used to reduce the boiler plate code such as getter , setter , toString, hasCode, equals,.....etc methods with the help of annotations.
 
 ANNOTATIONS:
 
 @Getter: This is a class level and variable annotation
 example :
 
 @Getter                             if we write getter annotation on top then it will create for all 
 class Employee{
	 int id;
     @Getter                     here only for name it will create 
	 String name;
 }
 =================================================================================================
 @Setter:
 
 =================================================================================================
 @toString:
 
 =================================================================================================
 @EqualsAndHAshCode
 
 =================================================================================================
 @Data  
 
 will generate all this (
                          @Getter  
                          @Setter:
                          @toString:
                          @EqualsAndHAshCode   //to compare reference variable
                        )
 =================================================================================================
 @NoArgConstructor:  
 
 =================================================================================================
 @AllArgConstructor: 
 
 =================================================================================================
 5) What is Apache Maven?
--> Apache maven is a software project management and comprehension tool. based on the concept of a project object model(POM), maven can manage a projects build,
==================================================================================================
Gradle: is also  tool from another projects.

==================================================================================================
STEPS TO CREATE MAVEN PROJECTS:

FILE----------------------NEW--------OTHER--------SEARCH (MAVEN PROJECT) ---NEXT-------NEXT---- SEE CATOGERY(ALL CATALOG) ------FILTER (org.apache.maven)--------select(MAVEN QUICK START)--------SELECT THEN NEXT ------------GROUP ID: domain.companyName Artifact id: PrijectName
==================================================================================================
HIBERNATE ANNOTATIONS:

@Entity
@Id
@Table(name="tableName")------------->  this is used to provide name from programmer side
@column(name="columnName",length=10 , nullable=true/false)-------> this annotation is used to provide constant for table name.

@JoinColumn (name="foreginkey column mane")   used to provide foreginkey column mane from programmer side.