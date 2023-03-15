fun main(args: Array<String>) {
    val car1 = Car()        //Create object
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

    val car2 = Car()
    car2.name = "BMW"
    car2.model = "M5"
    car2.color = "Black"
    car2.doors = 2

    println("\n")
    println("Car name: ${car2.name}")
    println("Car model: ${car2.model}")
    println("Car color: ${car2.color}")
    println("Car doors: ${car2.doors}")

    car2.move()
    car2.stop()
}

class Car {
    var name = ""
    var model = ""
    var color = ""
    var doors = 0

    fun move() {
        println("The $name is moving")
    }

    fun stop() {
        println("The $name is stopped")
    }
}