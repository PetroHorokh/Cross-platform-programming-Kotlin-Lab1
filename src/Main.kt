import java.io.BufferedReader
import java.io.InputStreamReader

fun task1(){
    println("Завдання №1")

    print("Введіть довжину ребра A: ")
    val A: Double = readln().toDouble()

    print("Введіть довжину ребра B: ")
    val B: Double = readln().toDouble()

    print("Введіть довжину ребра C: ")
    val C: Double = readln().toDouble()

    val volume = A * B * C
    println("Об'єм паралелепіпеда: $volume")

    val surfaceArea = 2 * (A * B + A * C + B * C)
    println("Площа поверхні прямокутного паралелепіпеда: $surfaceArea")
}

fun task2(){
    println("Завдання №2")

    print("Введіть чотирицифрове натуральне число: ")
    val number: Int = readln().toInt()

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
    task1()

    task2()
}