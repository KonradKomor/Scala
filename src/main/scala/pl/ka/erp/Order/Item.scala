package pl.ka.erp

class Item(private val itemId: Int, private var itemName: String, private var itemCost: BigDecimal){
  def setItemName(x:String){
    itemName=x
  }
  def setItemCost(x:Float){
    itemCost=x
  }
  def getItemName():String={
    return itemName
  }

  def getItemCost(): BigDecimal = {
return itemCost
  }
}
