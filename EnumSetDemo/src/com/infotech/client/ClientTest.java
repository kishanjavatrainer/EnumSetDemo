package com.infotech.client;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class ClientTest {

	public static void main(String[] args) {
		// Creating EnumSet using range
		EnumSet<WeekDay> weekDaySet = EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY);
		System.out.println("Using for each:Iterating EnumSet");
		for (WeekDay weekDay : weekDaySet) {
			System.out.println("WeekDay: " + weekDay);
		}
		System.out.println("------------------------------------------------------");
		// Another way of Creating EnumSet using of Method
		// EnumSet<WeekDay> weekEndSet = EnumSet.of(WeekDay.SATURDAY, WeekDay.SUNDAY);

		// Creating EnumSet using complementOf method, The created
		// set will contain all elements of the Enum not contained in the specified set
		EnumSet<WeekDay> weekEndSet = EnumSet.complementOf(weekDaySet);
		System.out.println("Using itertor:Iterating weekEndSet");
		Iterator<WeekDay> itr = weekEndSet.iterator();
		while (itr.hasNext()) {
			System.out.println("WeekDay: " + itr.next());
		}
		System.out.println("------------------------------------------------------");
		System.out.println("Need to work? " + isWorkingDay(weekDaySet, WeekDay.MONDAY));
		System.out.println("Need to work? " + isWorkingDay(weekDaySet, WeekDay.SATURDAY));
		System.out.println("Need to work? " + isWorkingDay(weekDaySet, WeekDay.SUNDAY));
	}

	private static boolean isWorkingDay(Set<WeekDay> daysSet, WeekDay day) {
		return daysSet.contains(day);

	}
}
