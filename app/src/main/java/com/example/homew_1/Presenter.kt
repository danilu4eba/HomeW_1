package com.example.homew_1

import android.graphics.Color

class Presenter {
    lateinit var view: CounterView
    var model = CounterModel()
    fun increment() {
        model.increment()
        view.showCount(model.count.toString())
        if (model.count == 10) {
            view.showToast("Поздравляем")
        }
        if (model.count == 15) {
            view.changeColor(Color.GREEN)
        }


    }

    fun init(view: CounterView) {
        this.view = view
    }
}