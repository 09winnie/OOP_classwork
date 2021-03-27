fun main() {
    var nganya=Car("Subaru","Ipreza","KDA 919T",0)
    nganya.start()
    println(nganya.speed)
    nganya.accelerate(35)
println(nganya.speed)
    nganya.accelerate(35)
    println(nganya.speed)
    var gari=Car("Toyota","juke","KDD 346T",10)
    gari.start()
    gari.accelerate(45)
    println(gari.speed)
   println(gari.hoot())
    gari.carName()
    var kendi=Registration("Grace","gracekendim1@gmail.com",23,"Kenya")
println(kendi.age)
    println(kendi.country)
    println(kendi.email)
    var bankAccount=BankAccount(1268987690,456,50000.544,4600.60,300)
println(bankAccount.accountNumber)
    println(bankAccount.userId)
    println(bankAccount.balance)
    println(bankAccount.transactionAmount)
    println(bankAccount.transactionFees)



}
class Car(var make:String,var model:String,var registration:String,var speed:Int){
    fun start(){
        println("i am starting...vrrooom")
    }
    fun accelerate(acceleration:Int):Int{
        speed=speed + acceleration
        return speed
    }
    fun hoot(){
   println("vrrrrooom")}
    fun carName(){
        println("$make $model")
    }

    }
data class Registration(var name:String,var email:String,var age:Int,var country:String){

}
data class BankAccount(var accountNumber:Int,var userId:Int,var balance:Double,var transactionAmount:Double,var transactionFees:Int){

}



    
