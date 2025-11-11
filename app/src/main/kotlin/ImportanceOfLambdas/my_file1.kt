package theImportanceOfLambdasExercise4

import atomictest.eq

fun other(s: String): String =
	s.filterIndexed { index, it -> it != 'm' && index % 2 == 0 }

fun main() {
	other("cement") eq "cn"
}
/*
cn
 */