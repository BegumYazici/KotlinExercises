package exercies.warehouse

fun main(args: Array<String>) {

    val product = Product("1","book",4.5)

    val warehouse = Warehouse()
    warehouse.addProduct(product,3)
    warehouse.printStockInformation()
    warehouse.addProduct(Product("2","pencil",3.1),4)
    warehouse.printStockInformation()

    var takenProduct= warehouse.takeProduct("1",4)
    takenProduct?.let {      //takenProduct degiskeni null değilse fonksiyonun icine gir.
        print(it.productName)
    }

    //cagrılma kısme ne zaman tetiklenirse interface      //interfaceden obje olusturma
    warehouse.productListener = object: ProductListener{
        override fun newProductAdded(product: Product) {
            println("${product.productName} is added.")
        }

        override fun outOfStockProduct(product: Product) {
            println("${product.productName} is out of the stock.")
          }
    }

    warehouse.addProduct(Product("3","lamp",3.2),2)
    warehouse.addProduct(Product("3","lamp",3.2),1)
    warehouse.printStockInformation()

    warehouse.takeProduct("3",3)

    warehouse.printStockInformation()
}