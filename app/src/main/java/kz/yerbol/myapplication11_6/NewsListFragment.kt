package kz.yerbol.myapplication11_6

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class NewsListFragment : Fragment() {

    private var newsClickListener: NewsClickListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if (context is NewsClickListener) {
            newsClickListener = context as NewsClickListener
        }
    }

    override fun onDetach() {
        super.onDetach()
        newsClickListener = null
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_news_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initTvNews(view)
    }

    private fun initTvNews(view: View) {
        val tvNewsOne: TextView = view.findViewById(R.id.tv_news_one)
        tvNewsOne.setOnClickListener { onNewsClick(index = 1, view = it) }

        val tvNewsTwo: TextView = view.findViewById(R.id.tv_news_two)
        tvNewsTwo.setOnClickListener { onNewsClick(index = 2, view = it) }

        val tvNewsThree: TextView = view.findViewById(R.id.tv_news_three)
        tvNewsThree.setOnClickListener { onNewsClick(index = 3, view = it) }

        val tvNewsFour: TextView = view.findViewById(R.id.tv_news_four)
        tvNewsFour.setOnClickListener { onNewsClick(index = 4, view = it) }

        val tvNewsFive: TextView = view.findViewById(R.id.tv_news_five)
        tvNewsFive.setOnClickListener { onNewsClick(index = 5, view = it) }

        val tvNewsSix: TextView = view.findViewById(R.id.tv_news_six)
        tvNewsSix.setOnClickListener { onNewsClick(index = 6, view = it) }
    }

    private fun onNewsClick(index: Int, view: View) {
        if (view !is TextView) {
            return
        }

        newsClickListener?.onNewsClick(index - 1)
    }
}