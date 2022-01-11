package Demo

import scala.collection.mutable.ListBuffer
// ******************** WIADOMOŚĆ DLA ADASIA*****************
//Generalnie jakbyś zerkał dzisiaj bo nie wiem czy będę nad tym siedział później to zrobiłem pare klas myśle że większość jest czytelna jeśli sie zastanawiasz co robi
//Ta funkcja sumOrderValue to generalnie powinna zwracać sumę kosztów z zamówienia (Dodałem jeszcze klasę przedmiotów bo na jednym zamówieniu może być więcej niż jeden
// przedmiot. Z tym że nie wiem dlaczego ale scala nic nie zwraca w tej funkcji pomimo że działa poprawnie później będę jeszcze nad tym pracował
class Order(private val orderId: Int, var orderedItems: List[Item]){
def sumOrderValue() {
  val x = orderedItems.length
  var costs = new ListBuffer[Float]()
  for(i <-0 until x){
    costs += orderedItems(i).getItemCost()
  }
  val costsList = costs.toList
  costsList.sum
}
}
