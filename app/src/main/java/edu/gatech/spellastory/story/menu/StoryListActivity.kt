package edu.gatech.spellastory.story.menu

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import edu.gatech.spellastory.R
import edu.gatech.spellastory.story.StoryIntent
import kotlinx.android.synthetic.main.activity_story_list.*

fun Context.StoryListIntent() = Intent(this, StoryListActivity::class.java)

class StoryListActivity : AppCompatActivity() {

    private val stories = listOf("The Special Invention")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story_list)

        rv_stories.adapter = StoryListAdapter(stories) { story -> startActivity(StoryIntent(story)) }
        rv_stories.layoutManager = LinearLayoutManager(this)
    }
}
