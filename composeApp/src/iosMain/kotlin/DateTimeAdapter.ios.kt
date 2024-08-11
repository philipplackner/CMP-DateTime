import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime

/**
 * Use iOS DateFormatter: https://stackoverflow.com/a/41769435/4024146"
 */
actual fun getDateTimeAdapter(): DateTimeAdapter = object : DateTimeAdapter {
    override fun formatLocalDateTime(dateTime: LocalDateTime): String {
        TODO("Not yet implemented")
    }

    override fun formatLocalTime(time: LocalTime): String {
        TODO("Not yet implemented")
    }

    override fun formatLocalDate(date: LocalDate): String {
        TODO("Not yet implemented")
    }
}