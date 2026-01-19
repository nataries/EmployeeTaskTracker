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

    val employee = Employee("Каменская Елена Ивановна", "Разработчик", 120000, 6)
    val department = DevelopmentDepartment()

    val reports: List<ReportGenerator> = listOf(employee, department)

    for(rep in reports) {
        println(rep.generateReport())
    }
}