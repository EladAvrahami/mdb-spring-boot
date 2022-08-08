# mdb-spring-boot

@Document(collation = "student") - define the class who has the collection fildes
</br>
@Field(name = "mail") - wiil be wrritten above variable in the bean class in order to fit it to the  filed name in the Database (like in compass "spring" database) 
</br>
@Repository - will be add interface in every repo package classes 
</br>
@EnableMongoRepositories("com.mdbspringboot.repo") //need to provide the packages where our repositories are located (add this config annotation in the main class)

<!-- https://poalim.udemy.com/course/mongodb-with-spring-boot-spring-data-mongorepository-mlab-cloudfoundry/learn/lecture/18336206#overview -->

