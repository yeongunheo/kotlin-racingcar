package racingcar.ui

import racingcar.domain.RacingCar
import racingcar.domain.RacingCarGame

private const val RACING_CAR_RESULT_DELIMITER = " : "
private const val WINNER_NAMES_DELIMITER = ", "

object ResultView {
    fun printInitMessage() {
        println()
        println("실행 결과")
    }

    fun printResult(racingCarGame: RacingCarGame) {
        racingCarGame.racingCars.forEach { printEachResult(it) }
        println()
    }

    private fun printEachResult(racingCar: RacingCar) {
        println("${racingCar.name}${RACING_CAR_RESULT_DELIMITER}${"-".repeat(racingCar.position)}")
    }

    fun printWinners(winners: List<RacingCar>) {
        val winnerNames = winners.joinToString(WINNER_NAMES_DELIMITER) { racingCar -> racingCar.name }
        println(winnerNames + "가 최종 우승했습니다.")
    }
}
