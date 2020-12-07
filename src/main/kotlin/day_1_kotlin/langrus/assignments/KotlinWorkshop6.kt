package day_1_kotlin.langrus.assignments


// Workshop #6 - special classes, objects, data classes


/* Рабочая зона */

// TODO 1: Добавь в data class 2-4 свойства.
data class VideoGame(
    var name: String,
    var genre: Genre,
    var price: Int,
    var year: Int = 2020
)

// TODO 2: Создай объект "VideoGamesTest", который будет использоваться для тестирования игр.
object VideoGamesTest {

    // Раскомментируй после объявления объекта.
    @JvmStatic
    fun main(args: Array<String>) {
        // TODO 3: Создай экземпляр класса "VideoGame".
        //  Создай копию игры с помощью функции ата класса ".copy()", сохрани копию в другой переменной.
        val game = VideoGame("Warcraft 3", Genre.STRATEGY, 50, 2002)
        val copy = game.copy(price = 51)

        // TODO 4: Выведи в консоль результат сравнения игры и её копии, используя оператор сравнения "==".
        //  Результат должен быть типа Boolean "true".
        val equal = game == copy
        println("Objects are equal $equal")

        // TODO 5: Создай массив игр. В момент создания, наполни его несколькими играми и массив в консоль.
        val games = arrayOf(
            game,
            copy,
            VideoGame("The Witcher 3", Genre.ACTION, 32),
            VideoGame("Resident Evil 3", Genre.HORROR, 40, 2018)
        )

        games.forEach {
            println("$it, ")
        }
    }
}


/* Бонусные задания */

// TODO 6: Создай "enum class", назови его "Genre", добавь в него несколько вариантов значений.
//  Добавь его, как новое свойство класса "VideoGame".
//  Поправь созданные сущности видеоигр в коде коде воркшопа.
//  Запусти выполнение функции "main()" и посмотри результат.
enum class Genre {
    ACTION,
    STRATEGY,
    HORROR
}


// TODO 7: Добавь новое свойство класса "VideoGame", присвой ему значение "по-умолчанию".
//  Как ты можешь убедиться, новое свойство со значением "по-умолчанию" не требует делать исправлений в таком коде.
//  Но надо помнить, что поведение созданных сущностей может измениться.
//  Запусти выполнение функции "main()" и посмотри результат.