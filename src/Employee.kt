class Employee(fullName: String,
    position: String,
    salary: Int,
    yearsOfExperience: Int) : ReportGenerator{

    private val _fullName = fullName
    private val _position = position
    private var _salary = salary
    private var _yearsOfExperience = yearsOfExperience

    val fullName: String
        get()=_fullName
    val position: String
        get() = _position
    var salary: Int
        get() = _salary
        set(value) {
            if(value < 0) {
                println("Зарплата не может быть меньше 0!")
            }
            else {
                _salary = value
            }
        }
    var yearsOfExperience: Int
        get() = _yearsOfExperience
        set(value) {
            _yearsOfExperience = value.coerceIn(0, 50)
        }
    var currentTask: Task? = null
        private set
    fun assignTask(newTask: Task) {
        if(currentTask!=null && currentTask?.isCompleted == false) {
            println("Сотрудник уже занят задачей ${currentTask?.title}!")
        } else{
            currentTask = newTask
            println("Сотруднику назначена задача ${newTask.title}")
        }
    }
    override fun generateReport(): String {
        return "ФИО сотрудника: $fullName | Должность: $position | Зарплата: $salary | Стаж работы: $yearsOfExperience"
    }
}

fun main() {
//    val employee = Employee("Иванов Пётр Андреевич", "Менеджер", 50000, 5)
//    println(employee.fullName)
//    println(employee.position)
//    println(employee.salary)
//    println(employee.yearsOfExperience)
//
//    employee.salary = -5000
//    employee.yearsOfExperience = 120
//
//    println(employee.salary)
//    println(employee.yearsOfExperience)

    //Задание 5

//    val employee = Employee("Каменская Елена Ивановна", "Разработчик", 120000, 6)
//    val department = DevelopmentDepartment()
//
//    val reports: List<ReportGenerator> = listOf(employee, department)
//
//    for(rep in reports) {
//        println(rep.generateReport())
//    }

    //Задание 6

    val employee = Employee("Громов Константин Игоревич", "Разработчик", 100000, 4)
    val department = DevelopmentDepartment()

    val task1 = Task("Рефакторинг кода", "Улучшить читаемость", priority = Priority.HIGH)
    val task2 = Task("Реализация графического интерфейса", "Интерфейс приложения", priority = Priority.MEDIUM)

    employee.assignTask(task1)
    employee.assignTask(task2)

    task1.isCompleted = true

    employee.assignTask(task2)

    val reports: List<ReportGenerator> = listOf(employee, department)

    for(rep in reports) {
        println(rep.generateReport())
    }
}