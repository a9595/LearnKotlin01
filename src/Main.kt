import java.util.*

/**
 * Created by tieorange on 17/02/2017.
 */
public class Main {
    companion object {


        @JvmStatic fun main(args: Array<String>) {
            val list: ArrayList<Int> = ArrayList()
            list.add(2)
            for (i in 1..5) list.add(i)

            //
            println("hello, args = ${list}")
            val max = max(4, 3)
            println(max)

            //
            val parsedInt = parseInt("s")
            if (parsedInt != null) println(parsedInt * 3)

            //
            var strLength: String = "s"
            strLength = "su"
            val stringLength = getStringLength(strLength);
            if (stringLength != null) {
                println("stringLength ${stringLength * 1}")
            }

            // while
            var i = 0;
            while (i < 3)
                println("while ${i++}")

            // ranges
            val x = 10;
            if (x in 1..10) println("x is in 1..10")
            else println("x is NOT in 1..10")

            // cases
            cases("hh")

            // Pair
            val pair = Pair(1, "one")
            val (num, name) = pair
            println("num = $num, name = $name")

            // Data class
            println(getUser())

            // Extension function
            val strGreeting = "hello"
            println("isGreeting = ${strGreeting.isGreeting()}")
            println("isHello = ${strGreeting.isHello()}") // func imported from other Kotlin file

            //
        }

        fun String.isGreeting() = equals("hello")

        fun getUser(): User {
            return User("Andrii", 666)
        }

        data class User(val name: String, var id: Int)


        fun cases(obj: Any) {
            val r: Any
            when (obj) {
                1 -> r = "One"
                "Hello" -> r = "Greeting"
                is String -> r = "Is String"
                else -> r = "Unknown"
            }
            println(r)
        }

        fun getStringLength(str: Any): Int? {
            if (str is String) {
                return str.length
            } else return null
        }

        fun max(a: Int, b: Int): Int = if (a > b) a else b

        fun parseInt(str: String): Int? {
            try {
                return Integer.parseInt(str)
            } catch (e: NumberFormatException) {
                println("One of arguments isn't Int")
            }
            return null;
        }
    }

}