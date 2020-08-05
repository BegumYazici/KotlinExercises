package exercies.warehouse

class Warehouse {
    var productListener: ProductListener? = null
    private val productMap = mutableMapOf<String, Product>()
    private val productCountMap = mutableMapOf<String, Int>()

    fun printStockInformation() {
        println("ID, Product Name, Count")
        for ((key, value) in productMap) {
            val count = productCountMap.get(key)
            println("$key, ${value.productName}, $count ")
        }
    }

    fun addProduct(product: Product, count: Int){
        if(productMap.contains(product.id)){
            var actualCount = productCountMap[product.id]!!
            actualCount += count
            productCountMap.remove(product.id)
            productCountMap.put(product.id,actualCount)
        }else{
            productMap.put(product.id, product)
            productCountMap.put(product.id, count)
            productListener?.newProductAdded(product)
        }
    }

    fun takeProduct(productID: String, count: Int) : Product?{
        if(productMap.containsKey(productID)){   //this product is available
            var countProduct = productCountMap[productID]!!
            if(countProduct >= count){
                productCountMap.replace(productID,(countProduct-count))
                checkOutOfProduct(productID)
                return productMap[productID]
            }else{
                println("No longer available ${productMap[productID]?.productName}.")
            }
        }

        return null
    }

    private fun checkOutOfProduct(productID: String){
        var actualCount= productCountMap[productID]
        actualCount?.let {
            if(it == 0){
                productListener?.outOfStockProduct(productMap[productID]!!)
            }
        }
    }
}