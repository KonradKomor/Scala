package pl.ka.erp.client

import pl.ka.erp.order.Order

// Komentarz; listOfOrders imo powinno być połączone w bazie danych (@JoinColumn)  z zamówieniami nie wiem tylko jak z implementacją dodania klienta przez usera
// Ponieważ myślę o tym żeby zamówienie dodawać z poziomu klienta. User story: "Użytkownik dodaje klienta i potem już bezpośrednio do dodanego klienta może dla niego dodać zamówienia do systemu
class Client(private val clientId: Int, private  var clientName: String, private var clientAddress: String, private var listOfOrders: List[Order] ) {
}
