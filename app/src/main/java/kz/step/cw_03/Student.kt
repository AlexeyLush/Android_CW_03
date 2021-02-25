package kz.step.cw_03

public class Student(_lastname: String, _firstname: String) {

    public var lastname: String? = null
    public var firstname: String? = null

    init{
        firstname = _firstname
        lastname = _lastname
    }

}