import kotlinx.datetime.*
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

actual fun getDateTimeAdapter(): DateTimeAdapter = object : DateTimeAdapter {
    override fun formatLocalDateTime(dateTime: LocalDateTime): String = dateTime.toJavaLocalDateTime().format(
        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM)
    )

    override fun formatLocalTime(time: LocalTime): String = time.toJavaLocalTime().format(
        DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)
    )

    override fun formatLocalDate(date: LocalDate): String = date.toJavaLocalDate().format(
        DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
    )
}