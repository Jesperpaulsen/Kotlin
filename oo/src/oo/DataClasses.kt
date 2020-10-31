package oo

class Book(val title: String, val author: String, val publicationYear: Int, var price: Double) {

    override fun toString(): String {
        return "Book[title=$title, author=$author, publicationYear=$publicationYear, price=$price]"
    }
}

data class DataBook(val title: String, val author: String, val publicationYear: Int, var price: Double) {

}

fun main() {
    val book = Book("Super book", "John Doe", 2017, 99.99);
    val book2 = Book("Super book", "John Doe", 2017, 99.99);

    val dataBook = DataBook("Data book", "John Doe", 2017, 99.99)
    val dataBook2 = DataBook("Data book", "John Doe", 2017, 99.99)
    val dataBook3 = dataBook2.copy(price = 89.99)

    val (title, author, year, price) = dataBook;

    println("Title: $title, author: $author")

    val set = hashSetOf<DataBook>(dataBook, dataBook2, dataBook3)

    println(book)
    println(dataBook)
    println(dataBook3)

    println(dataBook == dataBook2) // Returns true
    println(book == book2)

    println(set)
}