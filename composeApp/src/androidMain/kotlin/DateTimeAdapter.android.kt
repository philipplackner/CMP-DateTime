import kotlinx.datetime.*
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

/**
 * You should use standard date and time formatting patterns for the platform you are targeting.
 * The reason is that every Locale uses different patterns for formatting dates and times.
 * Standard FormatStyle.[SHORT|MEDIUM|LONG] solve this problem for you.
 * For example 12/24-hour format, dividers, order of day/month/year in output, etc...
 *
 * Try to change Locale of your system from US/FR/DE and see how the output changes.
 *
 * We can create our domain FormatStyle of course and propagate expected format from common
 * module and not use only MEDIUM format here...
 */
actual fun getDateTimeAdapter(): DateTimeAdapter = object : DateTimeAdapter {
    override fun formatLocalDateTime(dateTime: LocalDateTime): String {
        return dateTime.toJavaLocalDateTime().format(
            DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM)
        )
    }

    override fun formatLocalTime(time: LocalTime): String = time.toJavaLocalTime().format(
        DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)
    )

    override fun formatLocalDate(date: LocalDate): String = date.toJavaLocalDate().format(
        DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
    )
}