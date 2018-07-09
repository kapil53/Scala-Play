package models

case class Product(productId: Int, productCategory: String, availability: Boolean, colour: String, size: String)

object Product {
  def listProducts() = {
    List(Product(1001, "M", true, "Blue", "S"),
      Product(1002, "F", false, "Green", "S"),
      Product(1003, "F", true, "Orange", "S"),
      Product(1004, "M", true, "Red", "S"))
  }
}