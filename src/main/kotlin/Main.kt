fun main(args: Array<String>) {
    /*val car1 = Car("Tesla", "S Plaid", "Red", 4)        //Create object
    car1.name = "Tesla"
    car1.model = "S Plaid"
    car1.color = "Red"
    car1.doors = 4

    println("Car name: ${car1.name}")
    println("Car model: ${car1.model}")
    println("Car color: ${car1.color}")
    println("Car doors: ${car1.doors}")

    car1.move()
    car1.stop()

    val car2 = Car("BMW", "M5", "Black", 2)        //Create object

    println("\n")
    println("Car name: ${car2.name}")
    println("Car model: ${car2.model}")
    println("Car color: ${car2.color}")
    println("Car doors: ${car2.doors}")

    car2.move()
    car2.stop()*/

    /*val user = User("Alex", "Dobinca", 23)
    val friend = User("John", "Doe", 25)
    val coworker = User("Adam")
    val  dude = User(age = 9, lastName = "Smith", name = "Bob")

    user.name = "Dobinca"

    println("User name: ${user.name}")
    println("User name: ${friend.name}")

    println("User name: ${coworker.name}")
    println("User last name: ${coworker.lastName}")
    println("User age: ${coworker.age}")*/
}

/*
class User(name: String, var lastName: String = "LastName", var age: Int = 0) {     //Constructor with parameters (name, lastName, age)
    */
/*************************************************************************************//*


    */
/******************************* INITIALIZER BLOCKS *********************************//*

    */
/*    var name:String

    init {                                                                          //init is a block of code that is executed when
        if (name.lowercase().startsWith("a")) {                               //the object is created
            this.name = name
        }
        else {
            this.name = "User"
            println("The name doesn't start with the letter 'a ' or 'A'")
        }
    }*//*

    */
/*************************************************************************************//*


    */
/******************************* GETTERS AND SETTERS *********************************//*

    */
/*var name = name                                                                 //Property, can be accessed outside the class

    //get() = field
    //OR
    get() {                                                                         //Getter for the name property
        println("Get")                                                              //field is a keyword that refers to the property, in this case name property
        return "First name: $field"
    }
    //Equivalent to:
    *//*
*/
/*fun getName(): String {
        return this.name
    }*//*
*/
/*

    set(value) {                                                                    //Setter, value is a keyword that refers to the value that is assigned to the property
        println("Set")
        println("$value is assigned to the name property")
        field = value
    }
    //Equvalent to:
    *//*
*/
/*fun setName(newValue: String) {
        this.name = newValue
    }*//*

    */
/*************************************************************************************//*


    */
/********************************** CONSTRUCTORS *************************************//*

    */
/*constructor(name: String) : this(name, "LastName", 0) {            //Secondary constructor, calls the primary constructor
        println("2nd constructor")                                                  //with the parameters (name, lastName, age) and sets
    }                                                                               //the default values for lastName and age
    constructor(name: String, lastName: String) : this(name, lastName, 0) {
        println("3rd constructor")
    }*//*

}*/

class User(var name: String, var lastName: String, var age: Int) {

}