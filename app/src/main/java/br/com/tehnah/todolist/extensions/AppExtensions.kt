package br.com.tehnah.todolist.extensions

import com.google.android.material.textfield.TextInputLayout
import java.text.SimpleDateFormat
import java.util.*
import java.util.logging.SimpleFormatter

private val locale = Locale("pt", "BR")

fun Date.format() : String {
    return SimpleDateFormat("dd/mm/yyyy", locale).format(this)
}

var TextInputLayout.text : String
    get() = editText?.text?.toString() ?: ""
    set(value) {
        editText?.setText(value)
    }