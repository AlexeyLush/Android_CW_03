package kz.step.cw_03

public class SortStudentsByName{
    var students: ArrayList<Student> = arrayListOf(Student("Гордеев" ,"Фёдор" ),
        Student("Быков" ,"Тарас" ) ,
        Student("Сидоров" ,"Кристиан" ) ,
        Student("Владов" ,"Филипп" ),
        Student("Волков" ,"Георгий" ),
        Student("Романов" ,"Михаил" ),
        Student("Искаков" ,"Павел" ),
        Student("Колесниклв" ,"Никаолй" ),
        Student("Соколов" ,"Константин" ),
        Student("Воронцов" ,"Ярослав" ),
        Student("Беляев" ,"Анатолий" ),
        Student("Блинов" ,"Дмитрий" ),
        Student("Фомин" ,"Родион" ),
        Student("Петров" ,"Михаил" ),
        Student("Никольский" ,"Руслан" ),
        Student("Волошин" ," Александр" ))


    fun sortByName(): ArrayList<Student> {
        students.sortBy { it.firstname }
        return students
    }

    fun sortRandom(): ArrayList<Student>{
        students.shuffle()
        return students
    }

    fun stringForTable(): String{
        var result: String = ""
        for (student in students){
            result += student.firstname + " " + student.lastname + "\n"
        }
        return result
    }



}