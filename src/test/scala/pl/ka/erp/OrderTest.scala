package pl.ka.erp

import org.scalatest.FunSuite

class OrderTest extends FunSuite {

  test("Order.sumOrderValue") {
    val items = List(new Item(1, "Kwiatek", 25.55), new Item(1, "Doniczka", 17.37))
    val order = new Order(1, items);

    assert(order.sumOrderValue() == 42.92)
  }
  test("Order.addItemToOrder") {
    var items = List(new Item(1, "Kwiatek", 25.55), new Item(1, "Doniczka", 17.37))
    val order = new Order(1, items);
    var item = new Item(2,"Ziemia",10)
    order.addItemToOrder(item)
    assert(order.orderedItems.length ==3)
  }
}
