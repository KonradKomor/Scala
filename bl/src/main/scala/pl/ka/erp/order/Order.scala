package pl.ka.erp.order

import scala.language.postfixOps

class Order(private val orderId: Int, var orderedItems: List[Item]) {
  def sumOrderValue(): BigDecimal = orderedItems.map(item => item.getItemCost()).sum
  def addItemToOrder(item: Item): Unit ={
   orderedItems= orderedItems :+ item
  }
}
