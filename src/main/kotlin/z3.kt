open class Animal(
    val food: String,
    val location: String
) {
    open fun makeNoise() {
        println("Животное издает звук.")
    }

    open fun eat() {
        println("Животное ест $food.")
    }

    fun sleep() {
        println("Животное спит.")
    }
}

class Dog(food: String, location: String, val breed: String) : Animal(food, location) {
    override fun makeNoise() {
        println("Собака лает.")
    }

    override fun eat() {
        println("Собака ест $food.")
    }
}

class Cat(food: String, location: String, val color: String) : Animal(food, location) {
    override fun makeNoise() {
        println("Кошка мяукает.")
    }

    override fun eat() {
        println("Кошка ест $food.")
    }
}

class Horse(food: String, location: String, val speed: Int) : Animal(food, location) {
    override fun makeNoise() {
        println("Лошадь ржет.")
    }

    override fun eat() {
        println("Лошадь ест $food.")
    }
}

class Veterinarian {
    fun treatAnimal(animal: Animal) {
        println("Животное ест: ${animal.food}, находится: ${animal.location}")
    }
}

fun main() {
    val animals = arrayOf(
        Dog("кость", "дом", "овчарка"),
        Cat("рыба", "квартира", "черная"),
        Horse("сено", "стойло", 50)
    )

    val vet = Veterinarian()
    for (animal in animals) {
        vet.treatAnimal(animal)
        animal.makeNoise()
        animal.eat()
        animal.sleep()
        println()
    }
}