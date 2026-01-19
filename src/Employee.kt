class Employee(fullName: String,
    position: String,
    salary: Int,
    yearsOfExperience: Int) {

    private val _fullName = fullName
    private val _position = position
    private var _salary = salary
    private var _yearsOfExperience = yearsOfExperience
}