package koans.collections

val Customer.orderedProducts: Set<Product>
    get() {
        // Return all products this customer has ordered
        return orders.flatMap { it.products }.toSet()
    }

val Shop.allOrderedProducts: Set<Product>
    get() {
        // Return all products that were ordered by at least one customer
        return customers.flatMap { it.orderedProducts }.toSet()
    }