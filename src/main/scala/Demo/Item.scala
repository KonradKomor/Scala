package Demo

class Item(private val itemId: Int, private var itemName: String, private var itemCost: Float){
  def setItemName(x:String){
    itemName=x
  }
  def setItemCost(x:Float){
    itemCost=x
  }
  def getItemName():String={
    return itemName
  }

  def getItemCost(): Float = {
return itemCost
  }
}
