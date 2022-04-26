//class person(_name: String){
//    var name:String = _name
//}

//class Employee,with Two Secondary Constructor
class Employee {
    var name: String = ""
    var empid:String = ""
    constructor(_name: String):this(_name,"1001")
    constructor(_name:String,_id:String){
        name = _name
        empid = _id
    }
}