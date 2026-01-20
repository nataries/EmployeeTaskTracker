enum class Priority {LOW, MEDIUM, HIGH}
data class Task(
    val title: String,
    val description: String,
    val priority: Priority,
    var isCompleted: Boolean = false
) {
    override fun toString(): String {
        return "Задача: $title; описание: $description; сделано?: $isCompleted"
    }
}

fun main() {
    val task = Task("Свести отчётность", "Отчет для компании", priority = Priority.MEDIUM)
    val task2 = Task("Свести отчётность", "Отчет для компании", priority = Priority.MEDIUM)
    val task3 = Task("Разработка веб-приложения", "Создание базы данных", priority = Priority.LOW, isCompleted = true)

    println(task.equals(task3))
    println(task.equals(task2))

    println(task.hashCode())
    println(task3.hashCode())

    println(task2.toString())
    println(task3.toString())

    val task4 = task.copy("Свести отчётность за квартал" )
    println(task4.toString())
}