package zwolinski.bartosz.uczymysie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapter = MainAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        setupRecyclerView()
        listenToClicks()
    }

    private fun listenToClicks() {
        main_fab.setOnClickListener {
            adapter.list.add(adapter.itemCount + 1)
            adapter.notifyDataSetChanged()
        }
    }

    private fun setupRecyclerView() {
        main_activity_recycler.setHasFixedSize(true)
        main_activity_recycler.layoutManager = LinearLayoutManager(this)
        main_activity_recycler.adapter = adapter
    }
}
