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
    val task = Task("Приготовить обед", "Сварить грибной суп", priority = Priority.MEDIUM)
    val task2 = Task("Приготовить обед", "Сварить грибной суп", priority = Priority.MEDIUM)
    val task3 = Task("Убраться в комнате", "Подмести полы", priority = Priority.LOW, isCompleted = true)

    println(task.equals(task3))
    println(task.equals(task2))

    println(task.hashCode())
    println(task3.hashCode())

    println(task2.toString())
    println(task3.toString())

    val task4 = task.copy("Заготовки на неделю", )
    println(task4.toString())
}