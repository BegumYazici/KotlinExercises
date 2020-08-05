package exercies.warehouse

interface ProductListener {

    fun newProductAdded(product: Product)

    fun outOfStockProduct(product: Product)
}