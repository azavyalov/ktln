package koans.convensions

/*
operator fun MyDate.rangeTo(other: MyDate) = DateRangeTo(this, other)

class DateRangeTo(override val start: MyDate, override val endInclusive: MyDate): ClosedRange<MyDate>

fun checkInRangeTo(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}*/
