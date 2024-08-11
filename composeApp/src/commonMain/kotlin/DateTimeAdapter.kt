import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime

interface DateTimeAdapter {
    fun formatLocalDateTime(dateTime: LocalDateTime): String
    fun formatLocalTime(time: LocalTime): String
    fun formatLocalDate(date: LocalDate): String
}

expect fun getDateTimeAdapter(): DateTimeAdapter