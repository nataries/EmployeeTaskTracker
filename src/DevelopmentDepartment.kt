class DevelopmentDepartment : Department("Отдел разработки"), ReportGenerator {
    override fun printDepartmentGoal() {
        println("Цель отдела - писать чистый код")
    }

    override fun generateReport(): String {
        return "Название отдела: $departmentName; Цель отдела - писать чистый код"
    }
}