package com.example.mykeyboard

import android.inputmethodservice.InputMethodService
import android.view.View
import android.widget.Button

class MyKeyboardService : InputMethodService() {

    override fun onCreateInputView(): View {
        val view = layoutInflater.inflate(R.layout.keyboard_view, null)
        val ic = currentInputConnection

        view.findViewById<Button>(R.id.btn_hello)?.setOnClickListener {
            ic?.commitText("こんにちは", 1)
        }
        view.findViewById<Button>(R.id.btn_thanks)?.setOnClickListener {
            ic?.commitText("ありがとう", 1)
        }
        view.findViewById<Button>(R.id.btn_a)?.setOnClickListener {
            ic?.commitText("あ", 1)
        }
        view.findViewById<Button>(R.id.btn_i)?.setOnClickListener {
            ic?.commitText("い", 1)
        }
        view.findViewById<Button>(R.id.btn_u)?.setOnClickListener {
            ic?.commitText("う", 1)
        }
        view.findViewById<Button>(R.id.btn_delete)?.setOnClickListener {
            ic?.deleteSurroundingText(1, 0)
        }

        return view
    }
}
