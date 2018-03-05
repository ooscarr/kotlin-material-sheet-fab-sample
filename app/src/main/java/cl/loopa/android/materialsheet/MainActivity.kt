package cl.loopa.android.materialsheet

import android.content.Context
import android.os.Bundle
import android.support.annotation.Nullable
import android.support.design.widget.Snackbar
import android.support.v4.app.DialogFragment
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*
import com.gordonwong.materialsheetfab.MaterialSheetFab
import android.support.v7.widget.RecyclerView
import android.widget.AdapterView
import android.view.ContextMenu
import android.widget.Toast
import android.view.ViewGroup
import android.view.LayoutInflater






class MainActivity : AppCompatActivity() {

    private var mRecyclerView: RecyclerView? = null
    private val mAdapter: RecyclerView.Adapter<*>? = null
    private var mLayoutManager: RecyclerView.LayoutManager? = null

    var fm = supportFragmentManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)



        val fab = findViewById<View>(R.id.fab) as Fab
        val sheetView = findViewById<View>(R.id.fab_sheet)
        val overlay = findViewById<View>(R.id.dim_overlay)
        val sheetColor = ContextCompat.getColor(this,R.color.background_card)
        val fabColor = ContextCompat.getColor(this,R.color.colorAccent)

        // Initialize material sheet FAB
        val materialSheetFab = MaterialSheetFab(fab, sheetView, overlay,
                sheetColor, fabColor)


       /* mRecyclerView = findViewById(R.id.fab)

        mLayoutManager = new LinearLayoutManager(this)
        mRecyclerView.setLayoutManager(mLayoutManager)

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);*/


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            R.id.action_call -> consume { navigateToSettings() }
            else -> super.onOptionsItemSelected(item)
        }
    }

    // https://antonioleiva.com/kotlin-awesome-tricks-for-android/
    inline fun consume(f: () -> Unit): Boolean {
        f()
        return true
    }

    fun navigateToSettings(){
        val dFragment = NrosEmergenciaFragment()
        // Show DialogFragment
        dFragment.show(fm, "Dialog Fragment")
        return
    }
}
