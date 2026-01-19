abstract class Department(val departmentName: String){
    abstract fun printDepartmentGoal()

}

fun main() {
    val dev = DevelopmentDepartment()
    val test = TestingDepartment()

    println(dev.departmentName)
    dev.printDepartmentGoal()

    println(test.departmentName)
    test.printDepartmentGoal()
}