package dong2mon.mylibrary

object NumberUtil {

    fun parseInt(args: String): Int {
        return try {
            Integer.parseInt(args)
        } catch (e: Exception) {
            0
        }
    }
}