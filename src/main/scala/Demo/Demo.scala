package Demo

object Demo {
  def main(args: Array[String]){
 var user1= new User(1,"Konrad","Surname","Address","EmailAddress")
 var item1 = new Item(1,"Doniczka",15)
 var item2 = new Item(2,"Ziemia",10)
 val order = new Order(1,  List(item1,item2))
println(order.sumOrderValue())
  }
}
