@file:Suppress("unused")

package day_1_kotlin.langrus.assignments

// Workshop #5 - inheritance, abstract, interface

// Не исправляй! Дано:
// Объявляем контракт, представляющий некое свойство транспорта.
interface Driveable {
    fun drive()
}

// Объявляем класс пассажирского транспорта в целом.
// Придадим такому транспорту свойство перемещаться под управлением водителя.
abstract class Transport(protected var passengersCount: Int) : Driveable

// Создадим реальный транспорт: "Велосипед". Он может управляться водителем и перевозит одного пассажира.
class Bicycle : Transport(1) {
    override fun drive() {
        println("Ride a bicycle.")
    }
}


/* Рабочая зона */

// TODO 1: Создай свой интерфейс - контракт, который бы также подошел по смыслу классу транспорт.
//  См. ниже.
// ? Имена классов и файлов Котлин принято называть с заглавной буквы, в формате "camelCase".
// Например: "SomeLongClassName"
interface Beepable {
    fun beep()
}

// TODO 2: Создай свои собственные классы, например "Bus" и "Car".
//  Эти классы не будут полностью написаны с нуля, они должны расширять общий класс "Transport",
//  и дополнительно реализовывать придуманный тобой интерфейс.
// ? Класс может наследовать только один класс, но реализовывать несколько интерфейсов, например:
// class Kitty(): Cat, Cuteable, Sleepable, Furryable {}
class Bus(passengersCount: Int) : Transport(passengersCount), Beepable {

    private var hasBeep = false

    override fun drive() {
        if (passengersCount > 0) println("Driving $passengersCount passengers")
        else println("Bus won't drive because there are no passengers")
    }

    override fun beep() {
        if (hasBeep) println("Beeeeeep!")
        else println("Don't have a beep")
    }

}
class Car(passengersCount: Int): Transport(passengersCount), Beepable {

    private var hasBeep = true

    override fun drive() {
        if (passengersCount > 0) println("Driving $passengersCount passengers")
        else println("Car won't drive because there are no passengers")

    }

    override fun beep() {
        if (hasBeep) println("Beeeeeep!")
        else println("Don't have a beep")
    }

}

// TODO 3: Протестируй работоспособность твоего транспорта.
object VehiclesTest {

    // Запусти исполнение main() функции, для выполнения кода.
    @JvmStatic
    fun main(args: Array<String>) {
        testBus()
        testCar()
        testBicycle()

        testBusParts()
    }

    private fun testBus() {
        println("Testing how bus drives...")
        val bus = Bus(20)
        bus.drive()
        bus.beep()
    }

    private fun testCar() {
        println("Testing how car drives...")
        val car = Car(3)
        car.drive()
        car.beep()
    }

    private fun testBicycle() {
        println("Testing how bicycle drives...")
        val bicycle = Bicycle()
        bicycle.drive()
    }


    /* Бонусные задания */

    // TODO 4: Протестируй агрегаты автобуса, как независимые компоненты.
    //  Т.е. каждый набор независимых свойств - отдельно, чтобы в тестируемой сущности были скрыты все свойства,
    //  не принадлежащие к данному набору.
    private fun testBusParts() {
        println("Testing bus's feature 1...")
        val regularBus = Bus(10)
        println("Testing bus possibility to drive...")
        println(regularBus.drive())

        println("Testing bus's feature 2...")
        val noPassengersBus = Bus(0)
        println("Testing bus possibility to drive with zero passengers...")
        println(noPassengersBus.drive())
    }
}