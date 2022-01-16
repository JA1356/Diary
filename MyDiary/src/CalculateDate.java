import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;

public class CalculateDate {
	LocalDate now = LocalDate.now();
	YearMonth yearMonth;
	LocalDate endOfMonth;

	public CalculateDate() {
		this.yearMonth = YearMonth.from(this.now);
		this.endOfMonth = this.yearMonth.atEndOfMonth();
	}

	int getSumOfDays() {
		return this.endOfMonth.getDayOfMonth();
	}

	int getFirstDay() {
		LocalDate firstDay = LocalDate.of(this.getYear(), this.getMonth(), 1);
		DayOfWeek day = firstDay.getDayOfWeek();
		int dayNumber = day.getValue();
		return dayNumber;
	}

	int getYear() {
		return this.now.getYear();
	}

	int getMonth() {
		return this.now.getMonthValue();
	}

	void draw() {
		System.out.println("\t\t    " + this.getYear() + "년 " + this.getMonth() + "월\n");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int nextWeek = 0;

		int i;
		for (i = 0; i < this.getFirstDay(); ++i) {
			System.out.print(".\t");
			++nextWeek;
		}

		for (i = 1; i <= this.getSumOfDays(); ++i) {
			if (nextWeek % 7 == 0) {
				System.out.print("\n");
			}

			System.out.print(i + "\t");
			++nextWeek;
		}

	}
}