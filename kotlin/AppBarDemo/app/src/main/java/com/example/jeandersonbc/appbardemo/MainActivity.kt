package com.example.jeandersonbc.appbardemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    // Have some time to appreciate this construction:
    override fun onOptionsItemSelected(item: MenuItem) =
            when (item.itemId) {
                R.id.action_someAction1 -> {
                    Toast.makeText(this, "Action 1 Triggered!", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.action_someAction2 -> {
                    Toast.makeText(this, "Action 2 Triggered!", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> {
                    super.onOptionsItemSelected(item)
                }
            }
}
