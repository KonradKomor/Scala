package pl.ka.erp

class Order(private val orderId: Int, var orderedItems: List[Item]) {
  def sumOrderValue(): BigDecimal = orderedItems.map(item => item.getItemCost()).sum
}
