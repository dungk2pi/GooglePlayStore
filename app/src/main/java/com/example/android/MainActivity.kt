package com.example.android

import android.os.Bundle
import android.widget.ListAdapter
import android.widget.ListView
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        var list: ArrayList<GroupApp> = ArrayList<GroupApp>()

        var listApp: ArrayList<App> = ArrayList<App>()
        listApp.add(App("Game1", R.drawable._55652785_243289621787527_2259314959773497228_n, 4.7))
        listApp.add(App("Game2", R.drawable._72615752_192847030479728_144606161263388329_n, 4.6))
        listApp.add(App("Game3", R.drawable._55652785_243289621787527_2259314959773497228_n, 4.0))
        listApp.add(App("Game4", R.drawable._55652785_243289621787527_2259314959773497228_n, 4.1))
        listApp.add(App("Game5", R.drawable._72615752_192847030479728_144606161263388329_n, 4.8))
        list.add(GroupApp("Hot Game", listApp))

        var listApp1: ArrayList<App> = ArrayList<App>()
        listApp1.add(App("Game1", R.drawable._72615752_192847030479728_144606161263388329_n, 4.7))
        listApp1.add(App("Game2", R.drawable._85532808_712231947075953_6114396240778827804_n, 4.6))
        listApp1.add(App("Game3", R.drawable._85532808_712231947075953_6114396240778827804_n, 4.0))
        listApp1.add(App("Game4", R.drawable._55652785_243289621787527_2259314959773497228_n, 4.1))
        listApp1.add(App("Game5", R.drawable._85532808_712231947075953_6114396240778827804_n, 4.8))
        list.add(GroupApp("Off games", listApp1))

        var listApp2: ArrayList<App> = ArrayList<App>()
        listApp2.add(App("Game6", R.drawable._72615752_192847030479728_144606161263388329_n, 4.7))
        listApp2.add(App("Game7", R.drawable._85532808_712231947075953_6114396240778827804_n, 4.6))
        listApp2.add(App("Game8", R.drawable._55652785_243289621787527_2259314959773497228_n, 4.0))
        listApp2.add(App("Game9", R.drawable._85532808_712231947075953_6114396240778827804_n, 4.1))
        listApp2.add(App("Game10", R.drawable._55652785_243289621787527_2259314959773497228_n, 4.8))
        list.add(GroupApp("Onl games", listApp2))

        var listApp3: ArrayList<App> = ArrayList<App>()
        listApp3.add(App("Game11", R.drawable._85532808_712231947075953_6114396240778827804_n, 4.7))
        listApp3.add(App("Game12", R.drawable._55652785_243289621787527_2259314959773497228_n, 4.6))
        listApp3.add(App("Game13", R.drawable._85532808_712231947075953_6114396240778827804_n, 4.0))
        listApp3.add(App("Game14", R.drawable._55652785_243289621787527_2259314959773497228_n, 4.1))
        listApp3.add(App("Game15", R.drawable._55652785_243289621787527_2259314959773497228_n, 4.8))
        list.add(GroupApp("Game16", listApp3 ))

        val customAdapter: GroupAdapater = GroupAdapater(list, this)

        val listView = findViewById<RecyclerView>(R.id.recyclerViewGroup)
        listView.adapter = customAdapter
        listView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

    }

}

