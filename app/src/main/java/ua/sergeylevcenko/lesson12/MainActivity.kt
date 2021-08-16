package ua.sergeylevcenko.lesson12

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        val imageView = findViewById<ImageView>(R.id.imageView)
        button.setOnClickListener(viewClickListener)
        textView.setOnClickListener(viewClickListener)
        imageView.setOnClickListener(viewClickListener)
    }

    var viewClickListener =
        View.OnClickListener { v -> showPopupMenu(v) }

    private fun showPopupMenu(v: View) {
        val popupMenu = PopupMenu(this, v)
        popupMenu.inflate(R.menu.popupmenu)
        popupMenu
            .setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.menu1 -> {
                        Toast.makeText(
                            applicationContext,
                            "Вы выбрали PopupMenu 1",
                            Toast.LENGTH_SHORT
                        ).show()
                        true
                    }
                    R.id.menu2 -> {
                        Toast.makeText(
                            applicationContext,
                            "Вы выбрали PopupMenu 2",
                            Toast.LENGTH_SHORT
                        ).show()
                        true
                    }
                    R.id.menu3 -> {
                        Toast.makeText(
                            applicationContext,
                            "Вы выбрали PopupMenu 3",
                            Toast.LENGTH_SHORT
                        ).show()
                        true
                    }R.id.menu4 -> {
                        Toast.makeText(
                            applicationContext,
                            "Вы выбрали PopupMenu 4",
                            Toast.LENGTH_SHORT
                        ).show()
                        true
                    }R.id.menu5 -> {
                        Toast.makeText(
                            applicationContext,
                            "Вы выбрали PopupMenu 5",
                            Toast.LENGTH_SHORT
                        ).show()
                        true
                    }
                    else -> false
                }
            }
        popupMenu.setOnDismissListener {
            Toast.makeText(
                applicationContext, "onDismiss",
                Toast.LENGTH_SHORT
            ).show()
        }
        popupMenu.show()
    }
}