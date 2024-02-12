import java.io.BufferedReader
import java.io.InputStreamReader

fun task1(bufferedReader: BufferedReader){
    println("Завдання №1")

    print("Введіть довжину ребра A: ")
    val A: Double = bufferedReader.readLine().toDouble()

    print("Введіть довжину ребра B: ")
    val B: Double = bufferedReader.readLine().toDouble()

    print("Введіть довжину ребра C: ")
    val C: Double = bufferedReader.readLine().toDouble()

    val volume = A * B * C
    println("Об'єм паралелепіпеда: $volume")

    val surfaceArea = 2 * (A * B + A * C + B * C)
    println("Площа поверхні паралелепіпеда: $surfaceArea")
}

fun task2(bufferedReader: BufferedReader){
    println("Завдання №2")

    print("Введіть чотирицифрове натуральне число: ")
    val number: Int = bufferedReader.readLine().toInt()

    val firstDigit = number / 1000
    val fourthDigit = number % 10

    val secondDigit = (number / 100) % 10
    val thirdDigit = (number / 10) % 10

    val productOfOuterDigits = firstDigit * fourthDigit
    val productOfInnerDigits = secondDigit * thirdDigit

    val difference = productOfOuterDigits - productOfInnerDigits

    println("Різниця добутків крайніх і внутрішніх цифр: $difference")
}

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))

    task1(bufferedReader)

    task2(bufferedReader)
}