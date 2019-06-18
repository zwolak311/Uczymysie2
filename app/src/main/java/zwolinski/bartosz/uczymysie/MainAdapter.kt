package zwolinski.bartosz.uczymysie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_main.view.*

class MainAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var list = ArrayList<Int>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MainViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.row_main, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as MainViewHolder).bindView(list[position])
    }

    override fun getItemCount(): Int = list.size


    class MainViewHolder(view: View): RecyclerView.ViewHolder(view) {

        fun bindView(int: Int){
            itemView.row_main_text.text = "To jest item numer: $int"
        }

    }

}
