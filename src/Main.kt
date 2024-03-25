import kotlin.math.abs

fun task1() {
    println("Завдання №1")

    var A: Double
    var B: Double
    var C: Double

    do {
        print("Введіть довжину ребра A: ")
        A = readln().toDouble()
    } while (A <= 0)

    do {
        print("Введіть довжину ребра B: ")
        B = readln().toDouble()
    } while (B <= 0)

    do {
        print("Введіть довжину ребра C: ")
        C = readln().toDouble()
    } while (C <= 0)

    val volume = A * B * C
    println("Об'єм прямокутного паралелепіпеда: $volume")

    val surfaceArea = 2 * (A * B + A * C + B * C)
    println("Площа поверхні прямокутного паралелепіпеда: $surfaceArea")
}

fun task2() {
    println("Завдання №2")

    var number: Int

    do {
        print("Введіть чотирицифрове натуральне число: ")
        number = readln().toInt()
    } while (abs(number.toDouble()).toString().length != 4 && number < 0)

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