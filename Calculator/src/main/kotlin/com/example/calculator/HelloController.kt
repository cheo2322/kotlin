package com.example.calculator

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.Label

class HelloController {

  @FXML
  private lateinit var display: Label

  private var state: Operator = Operator.add(0)

  private fun onAction(fn: Operator) {
    state = fn
    display.text = ""
  }

  private val displayValue: Long
    get() = when (display.text) {
      "" -> 0
      else -> display.text.toLong()
    }

  private fun operator(x: String) {
    if (Regex("[0-9]").matches(x)) {
      display.text += x
    } else {
      when (x) {
        "+" -> onAction(Operator.add(displayValue))
        "-" -> onAction(Operator.sub(displayValue))
        "/" -> onAction(Operator.div(displayValue))
        "X" -> onAction(Operator.mul(displayValue))
        "%" -> {
          onAction(Operator.add(displayValue / 100))
          operator("=")
        }

        "C" -> onAction(Operator.add(0))
        "+/-" -> {
          onAction(Operator.add(-1 * displayValue))
          operator("=")
        }

        "=" -> display.text = state.calculate(displayValue).toString()
      }
    }
  }

  @FXML
  fun pressButton(actionEvent: ActionEvent) {
    operator(actionEvent.source.toString().split('\'')[1])
    println(actionEvent.source.toString())
  }
}
