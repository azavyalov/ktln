package academy.langrus.info

object B_HowToRunProgram {

    // Точкой входа исполняемой программы является функция "main".
    // Это статическая функция и она имеет зарезервированный синтаксис.

    // Внутри класса или объекта, где ещё нет main() функции, начни писать "ma" и подожди.
    // Среда разработки Intellij Idea предложит тебе авто-дополнить вводимый код с помощью шортката "maino".

    // Когда увидишь предложение дополнить код, нажми "Enter":
    @JvmStatic
    fun main(args: Array<String>) {
        // Собрать проект и запустить программу можно из верхнего меню "Run", или зажав "Ctrl+Shift+F10".
        // Или нажав на зелёный треугольник на полях, слева от кода, возле объявления функции main(), см. строку 13.
    }

    // Можно проверить некоторый код, не создавая функции main().
    // Запусти тестовую среду Котлина: в верхнем меню перейди в "Tools -> Kotlin -> Kotlin REPL".
    // Кликни в области открывшегося снизу окна консоли. Можешь ввести код там, а для исполнения зажать "Ctrl+Enter".
}