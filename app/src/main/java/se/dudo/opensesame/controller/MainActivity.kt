package se.dudo.opensesame.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import se.dudo.opensesame.R
import se.dudo.opensesame.model.Door

class MainActivity : AppCompatActivity() {

    private var layout: LinearLayout? = null

    private var doors: ArrayList<Door> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initMainActivity()
    }

    fun initMainActivity() {
        layout = findViewById(R.id.main_vert_layout)

        doors.add(Door("K01", "EB80 Ytter"))
        doors.add(Door("K02", "EB80 Inner"))
        doors.add(Door("J01", "John Ytter"))
        doors.add(Door("J02", "John Sopr"))

        for (door: Door in doors) {
            var button = Button(this)
            button.setText(door.name)
            layout?.addView(button)
        }

    }
}
